package ecom.m1ice.e_kea;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import ecom.m1ice.e_kea.models.User;

public class ExpectationsActivity extends AppCompatActivity {

    private TextView tv_firstLastname;
    private CircularImageView img_pp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expectations);

        // Retrieve pp and name
        tv_firstLastname = findViewById(R.id.RESUME_tv_FirstnameLastname);
        img_pp = findViewById(R.id.RESUME_img_profile);

        // Retrieve the actual user
        User actualUser = ((GlobalVars) this.getApplication()).getActualUser();

        // Set content of form
        tv_firstLastname.setText(actualUser.getFirstname() + " " + actualUser.getLastname() + "\n" + actualUser.getDescription() + "\n" + "Attentes");

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

        // Set attentes to the view
        TextView t = findViewById(R.id.textViewPersonnelles);
        t.setText(actualUser.getAttentesPersonelles());
        t = findViewById(R.id.textViewProfessionnelles);
        t.setText(actualUser.getAttentesProfessionnelles());
    }

    public void navigateToResume(View view) {
        startActivity(new Intent(this, ResumeActivity.class));
    }
}
