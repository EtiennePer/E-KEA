package ecom.m1ice.e_kea;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import ecom.m1ice.e_kea.models.User;

public class ResumeActivity extends AppCompatActivity {

    private TextView tv_firstLastname;
    private CircularImageView img_pp;

    private Button bt_resume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        tv_firstLastname = findViewById(R.id.RESUME_tv_FirstnameLastname);
        img_pp = findViewById(R.id.RESUME_img_profile);

        // Retrieve the actual user
        User actualUser = ((GlobalVars) this.getApplication()).getActualUser();

        // Set content of form
        tv_firstLastname.setText(actualUser.getFirstname() + " " + actualUser.getLastname());

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
    }
}
