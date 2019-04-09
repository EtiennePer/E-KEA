package ecom.m1ice.e_kea;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import ecom.m1ice.e_kea.models.User;


public class SkillsActivity extends AppCompatActivity {

    private TextView tv_firstLastname;
    private CircularImageView img_pp;
    private RatingBar ratingBarSavoirEtre1;
    private RatingBar ratingBarSavoirEtre2;
    private RatingBar ratingBarSavoirEtre3;
    private RatingBar ratingBarSavoirEtre4;
    private RatingBar ratingBarSavoirEtre5;
    private RatingBar ratingBarSavoirEtre6;
    private RatingBar ratingBarSavoirEtre7;
    private RatingBar ratingBarSavoirEtre8;
    private RatingBar ratingBarSavoirFaire1;
    private RatingBar ratingBarSavoirFaire2;
    private RatingBar ratingBarSavoirFaire3;
    private RatingBar ratingBarSavoirFaire4;
    private RatingBar ratingBarSavoirFaire5;
    private RatingBar ratingBarSavoirFaire6;
    private RatingBar ratingBarSavoirFaire7;
    private RatingBar ratingBarSavoirFaire8;
    private TextView textViewSavoirEtre1;
    private TextView textViewSavoirEtre2;
    private TextView textViewSavoirEtre3;
    private TextView textViewSavoirEtre4;
    private TextView textViewSavoirEtre5;
    private TextView textViewSavoirEtre6;
    private TextView textViewSavoirEtre7;
    private TextView textViewSavoirEtre8;
    private TextView textViewSavoirFaire1;
    private TextView textViewSavoirFaire2;
    private TextView textViewSavoirFaire3;
    private TextView textViewSavoirFaire4;
    private TextView textViewSavoirFaire5;
    private TextView textViewSavoirFaire6;
    private TextView textViewSavoirFaire7;
    private TextView textViewSavoirFaire8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        // Retrieve pp and name
        tv_firstLastname = findViewById(R.id.RESUME_tv_FirstnameLastname);
        img_pp = findViewById(R.id.RESUME_img_profile);

        // Retrieve the actual user
        User actualUser = ((GlobalVars) this.getApplication()).getActualUser();

        // Set content of form
        tv_firstLastname.setText(actualUser.getFirstname() + " " + actualUser.getLastname() + "\n" + actualUser.getDescription() + "\n" + "Compétences");

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

        // // TEXTVIEW AND RATING
        // retrieve rating bar
        ratingBarSavoirEtre1 = findViewById(R.id.ratingBarSavoirEtre1);
        ratingBarSavoirEtre2 = findViewById(R.id.ratingBarSavoirEtre2);
        ratingBarSavoirEtre3 = findViewById(R.id.ratingBarSavoirEtre3);
        ratingBarSavoirEtre4 = findViewById(R.id.ratingBarSavoirEtre4);
        ratingBarSavoirEtre5 = findViewById(R.id.ratingBarSavoirEtre5);
        ratingBarSavoirEtre6 = findViewById(R.id.ratingBarSavoirEtre6);
        ratingBarSavoirEtre7 = findViewById(R.id.ratingBarSavoirEtre7);
        ratingBarSavoirEtre8 = findViewById(R.id.ratingBarSavoirEtre8);

        ratingBarSavoirFaire1 = findViewById(R.id.ratingBarSavoirFaire1);
        ratingBarSavoirFaire2 = findViewById(R.id.ratingBarSavoirFaire2);
        ratingBarSavoirFaire3 = findViewById(R.id.ratingBarSavoirFaire3);
        ratingBarSavoirFaire4 = findViewById(R.id.ratingBarSavoirFaire4);
        ratingBarSavoirFaire5 = findViewById(R.id.ratingBarSavoirFaire5);
        ratingBarSavoirFaire6 = findViewById(R.id.ratingBarSavoirFaire6);
        ratingBarSavoirFaire7 = findViewById(R.id.ratingBarSavoirFaire7);
        ratingBarSavoirFaire8 = findViewById(R.id.ratingBarSavoirFaire8);

        // retrive textview
        textViewSavoirEtre1 = findViewById(R.id.textViewSavoirEtre1);
        textViewSavoirEtre2 = findViewById(R.id.textViewSavoirEtre2);
        textViewSavoirEtre3 = findViewById(R.id.textViewSavoirEtre3);
        textViewSavoirEtre4 = findViewById(R.id.textViewSavoirEtre4);
        textViewSavoirEtre5 = findViewById(R.id.textViewSavoirEtre5);
        textViewSavoirEtre6 = findViewById(R.id.textViewSavoirEtre6);
        textViewSavoirEtre7 = findViewById(R.id.textViewSavoirEtre7);
        textViewSavoirEtre8 = findViewById(R.id.textViewSavoirEtre8);

        textViewSavoirFaire1 = findViewById(R.id.textViewSavoirFaire1);
        textViewSavoirFaire2 = findViewById(R.id.textViewSavoirFaire2);
        textViewSavoirFaire3 = findViewById(R.id.textViewSavoirFaire3);
        textViewSavoirFaire4 = findViewById(R.id.textViewSavoirFaire4);
        textViewSavoirFaire5 = findViewById(R.id.textViewSavoirFaire5);
        textViewSavoirFaire6 = findViewById(R.id.textViewSavoirFaire6);
        textViewSavoirFaire7 = findViewById(R.id.textViewSavoirFaire7);
        textViewSavoirFaire8 = findViewById(R.id.textViewSavoirFaire8);

        // get data from user
        String[] strSavoirFaireName = actualUser.getSkillsSavoirFaireName();
        String[] strSavoirEtreName = actualUser.getSkillsSavoirEtreName();
        float[] floatSavoirFaireRate = actualUser.getSkillsSavoirFaireRate();
        float[] floatSavoirEtreRate = actualUser.getSkillsSavoirEtreRate();

        // set data to view
        textViewSavoirEtre1.setText(strSavoirEtreName[0]);
        textViewSavoirEtre2.setText(strSavoirEtreName[1]);
        textViewSavoirEtre3.setText(strSavoirEtreName[2]);
        textViewSavoirEtre4.setText(strSavoirEtreName[3]);
        textViewSavoirEtre5.setText(strSavoirEtreName[4]);
        textViewSavoirEtre6.setText(strSavoirEtreName[5]);
        textViewSavoirEtre7.setText(strSavoirEtreName[6]);
        textViewSavoirEtre8.setText(strSavoirEtreName[7]);

        textViewSavoirFaire1.setText(strSavoirFaireName[0]);
        textViewSavoirFaire2.setText(strSavoirFaireName[1]);
        textViewSavoirFaire3.setText(strSavoirFaireName[2]);
        textViewSavoirFaire4.setText(strSavoirFaireName[3]);
        textViewSavoirFaire5.setText(strSavoirFaireName[4]);
        textViewSavoirFaire6.setText(strSavoirFaireName[5]);
        textViewSavoirFaire7.setText(strSavoirFaireName[6]);
        textViewSavoirFaire8.setText(strSavoirFaireName[7]);

        ratingBarSavoirEtre1.setRating(floatSavoirEtreRate[0]);
        ratingBarSavoirEtre2.setRating(floatSavoirEtreRate[1]);
        ratingBarSavoirEtre3.setRating(floatSavoirEtreRate[2]);
        ratingBarSavoirEtre4.setRating(floatSavoirEtreRate[3]);
        ratingBarSavoirEtre5.setRating(floatSavoirEtreRate[4]);
        ratingBarSavoirEtre6.setRating(floatSavoirEtreRate[5]);
        ratingBarSavoirEtre7.setRating(floatSavoirEtreRate[6]);
        ratingBarSavoirEtre8.setRating(floatSavoirEtreRate[7]);

        ratingBarSavoirFaire1.setRating(floatSavoirFaireRate[0]);
        ratingBarSavoirFaire2.setRating(floatSavoirFaireRate[1]);
        ratingBarSavoirFaire3.setRating(floatSavoirFaireRate[2]);
        ratingBarSavoirFaire4.setRating(floatSavoirFaireRate[3]);
        ratingBarSavoirFaire5.setRating(floatSavoirFaireRate[4]);
        ratingBarSavoirFaire6.setRating(floatSavoirFaireRate[5]);
        ratingBarSavoirFaire7.setRating(floatSavoirFaireRate[6]);
        ratingBarSavoirFaire8.setRating(floatSavoirFaireRate[7]);

    }

    public void navigateToResume(View view) {
        startActivity(new Intent(this, ResumeActivity.class));
    }

}
