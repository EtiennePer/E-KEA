package ecom.m1ice.e_kea;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import ecom.m1ice.e_kea.models.User;

public class ResumeActivity extends AppCompatActivity {

    private TextView tv_firstName;
    private TextView tv_lastname;
    private CircularImageView img_pp;

    private Button bt_resume;
    private Button bt_expectations;
    private Button bt_skills;
    private Button bt_career;
    private Button bt_personnality;
    private Button bt_hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        tv_firstName = findViewById(R.id.RESUME_tv_Firstname);
        tv_lastname = findViewById(R.id.RESUME_tv_Lastname);
        img_pp = findViewById(R.id.RESUME_img_profile);
        bt_resume = findViewById(R.id.RESUME_bt_resume);
        bt_expectations = findViewById(R.id.RESUME_bt_expectations);
        bt_skills = findViewById(R.id.RESUME_bt_skills);
        bt_career = findViewById(R.id.RESUME_bt_carreer);
        bt_personnality = findViewById(R.id.RESUME_bt_personnality);
        bt_hobbies = findViewById(R.id.RESUME_bt_hobbies);

        // Retrieve the actual user
        final User actualUser = ((GlobalVars) this.getApplication()).getActualUser();

        // Set content of form
        tv_firstName.setText(actualUser.getFirstname());
        tv_lastname.setText(actualUser.getLastname());
        // Retrieve the good drawable
        Drawable img = null;
        if (actualUser.getFirstname().toLowerCase().contains("eti")) {
            img = getResources().getDrawable(R.drawable.pp_etienne);
        } else if (actualUser.getFirstname().toLowerCase().contains("ka")) {
            img = getResources().getDrawable(R.drawable.pp_kais);
        } else if (actualUser.getFirstname().toLowerCase().contains("alex")) {
            img = getResources().getDrawable(R.drawable.pp_alexandre);
        }

        img_pp.setImageDrawable(img);

        bt_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openResume(actualUser.getResumePathName());
            }
        });

    }


    private void openResume(String resumeName) {
        // create new Intent
        Intent intent = new Intent(Intent.ACTION_VIEW);

        // set flag to give temporary permission to external app to use your FileProvider
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        // generate URI, I defined authority as the application ID in the Manifest, the last param is file I want to open
        File copiedFile = copyFromAssets(resumeName);
        Uri uri = FileProvider.getUriForFile(this, BuildConfig.APPLICATION_ID + ".fileprovider", copiedFile);

        // I am opening a PDF file so I give it a valid MIME type
        intent.setDataAndType(uri, "application/pdf");

        // validate that the device can open your File!
        PackageManager pm = this.getPackageManager();
        if (intent.resolveActivity(pm) != null) {
            startActivity(intent);
        }
    }

    private File copyFromAssets(String resumeName) {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        try {
            in = assetManager.open(resumeName);
            File outFile = new File(getExternalFilesDir(null), resumeName);
            out = new FileOutputStream(outFile);
            copyFile(in, out);
            return outFile;
        } catch (IOException e) {
            Log.e("tag", "Failed to copy asset file: " + resumeName, e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // NOOP
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // NOOP
                }
            }
        }

        return null;
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }

    /**
     * Send to the specified activity
     *
     * @param activityClass
     */
    private void goTo(Class activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
