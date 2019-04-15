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
import ecom.m1ice.e_kea.tools.OpenFileUtils;

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
            img = getResources().getDrawable(R.drawable.etienne);
        } else if (actualUser.getFirstname().toLowerCase().contains("ka")) {
            img = getResources().getDrawable(R.drawable.kaiss);
        } else if (actualUser.getFirstname().toLowerCase().contains("alex")) {
            img = getResources().getDrawable(R.drawable.alexandre);
        }

        img_pp.setImageDrawable(img);

        bt_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenFileUtils.openResume(actualUser.getResumePathName(), ResumeActivity.this);
            }
        });

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

    public void navigateToPersonnality(View view) {
        startActivity(new Intent(this, PersonnalityActivity.class));
    }
    public void navigateToHobbies(View view) {
        startActivity(new Intent(this, HobbiesActivity.class));
    }
    public void navigateToExpectation(View view) {
        startActivity(new Intent(this, ExpectationsActivity.class));
    }
    public void navigateToSkills(View view) {
        startActivity(new Intent(this, SkillsActivity.class));
    }
    public void navigateToCareer(View view) {
        startActivity(new Intent(this, CareerActivity.class));
    }
}
