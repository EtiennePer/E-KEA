package ecom.m1ice.e_kea;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import ecom.m1ice.e_kea.models.User;

public class HobbiesActivity extends AppCompatActivity {

    private TextView tv_firstLastname;
    private CircularImageView img_pp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
        String[] allPersonnality = {"apprendre","confiance","curieux", "determine", "fiable", "independant", "integre", "passionne", "tenace", "travailleur"};

        tv_firstLastname = findViewById(R.id.RESUME_tv_FirstnameLastname);
        img_pp = findViewById(R.id.RESUME_img_profile);

        // Retrieve the actual user
        User actualUser = ((GlobalVars) this.getApplication()).getActualUser();

        // Set content of form
        tv_firstLastname.setText(actualUser.getFirstname() + " " + actualUser.getLastname());

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

        // Retrieve the good drawable Hobbies (c'est moche parce que on peut pas accéder dynamiquement à des propriétés d'objets en JAVA)
        ImageView image = (ImageView) findViewById(R.id.imgView0);
        switch(actualUser.getHobbies()[0]){
            case "alcool" : image.setImageResource(R.drawable.alcool); break;
            case "cinema" : image.setImageResource(R.drawable.cinema); break;
            case "cuisine" : image.setImageResource(R.drawable.cuisine); break;
            case "danser": image.setImageResource(R.drawable.danser); break;
            case "echec": image.setImageResource(R.drawable.echec); break;
            case "jardinage" : image.setImageResource(R.drawable.jardinage); break;
            case "karaoke" : image.setImageResource(R.drawable.karaoke); break;
            case "lecture" : image.setImageResource(R.drawable.lecture); break;
            case "musculation" : image.setImageResource(R.drawable.musculation); break;
            case "peche" : image.setImageResource(R.drawable.peche); break;
            case "peintre" : image.setImageResource(R.drawable.peintre); break;
            case "photo" : image.setImageResource(R.drawable.photo); break;
            case "sport" : image.setImageResource(R.drawable.sport); break;
            case "voyage" : image.setImageResource(R.drawable.voyage); break;
            case "yoga" : image.setImageResource(R.drawable.yoga); break;
        }

        image = (ImageView) findViewById(R.id.imgView1);
        switch(actualUser.getHobbies()[1]){
            case "alcool" : image.setImageResource(R.drawable.alcool); break;
            case "cinema" : image.setImageResource(R.drawable.cinema); break;
            case "cuisine" : image.setImageResource(R.drawable.cuisine); break;
            case "danser": image.setImageResource(R.drawable.danser); break;
            case "echec": image.setImageResource(R.drawable.echec); break;
            case "jardinage" : image.setImageResource(R.drawable.jardinage); break;
            case "karaoke" : image.setImageResource(R.drawable.karaoke); break;
            case "lecture" : image.setImageResource(R.drawable.lecture); break;
            case "musculation" : image.setImageResource(R.drawable.musculation); break;
            case "peche" : image.setImageResource(R.drawable.peche); break;
            case "peintre" : image.setImageResource(R.drawable.peintre); break;
            case "photo" : image.setImageResource(R.drawable.photo); break;
            case "sport" : image.setImageResource(R.drawable.sport); break;
            case "voyage" : image.setImageResource(R.drawable.voyage); break;
            case "yoga" : image.setImageResource(R.drawable.yoga); break;
        }

        image = (ImageView) findViewById(R.id.imgView2);
        switch(actualUser.getHobbies()[2]){
            case "alcool" : image.setImageResource(R.drawable.alcool); break;
            case "cinema" : image.setImageResource(R.drawable.cinema); break;
            case "cuisine" : image.setImageResource(R.drawable.cuisine); break;
            case "danser": image.setImageResource(R.drawable.danser); break;
            case "echec": image.setImageResource(R.drawable.echec); break;
            case "jardinage" : image.setImageResource(R.drawable.jardinage); break;
            case "karaoke" : image.setImageResource(R.drawable.karaoke); break;
            case "lecture" : image.setImageResource(R.drawable.lecture); break;
            case "musculation" : image.setImageResource(R.drawable.musculation); break;
            case "peche" : image.setImageResource(R.drawable.peche); break;
            case "peintre" : image.setImageResource(R.drawable.peintre); break;
            case "photo" : image.setImageResource(R.drawable.photo); break;
            case "sport" : image.setImageResource(R.drawable.sport); break;
            case "voyage" : image.setImageResource(R.drawable.voyage); break;
            case "yoga" : image.setImageResource(R.drawable.yoga); break;
        }

        image = (ImageView) findViewById(R.id.imgView3);
        switch(actualUser.getHobbies()[3]){
            case "alcool" : image.setImageResource(R.drawable.alcool); break;
            case "cinema" : image.setImageResource(R.drawable.cinema); break;
            case "cuisine" : image.setImageResource(R.drawable.cuisine); break;
            case "danser": image.setImageResource(R.drawable.danser); break;
            case "echec": image.setImageResource(R.drawable.echec); break;
            case "jardinage" : image.setImageResource(R.drawable.jardinage); break;
            case "karaoke" : image.setImageResource(R.drawable.karaoke); break;
            case "lecture" : image.setImageResource(R.drawable.lecture); break;
            case "musculation" : image.setImageResource(R.drawable.musculation); break;
            case "peche" : image.setImageResource(R.drawable.peche); break;
            case "peintre" : image.setImageResource(R.drawable.peintre); break;
            case "photo" : image.setImageResource(R.drawable.photo); break;
            case "sport" : image.setImageResource(R.drawable.sport); break;
            case "voyage" : image.setImageResource(R.drawable.voyage); break;
            case "yoga" : image.setImageResource(R.drawable.yoga); break;
        }

        image = (ImageView) findViewById(R.id.imgView4);
        switch(actualUser.getHobbies()[4]){
            case "alcool" : image.setImageResource(R.drawable.alcool); break;
            case "cinema" : image.setImageResource(R.drawable.cinema); break;
            case "cuisine" : image.setImageResource(R.drawable.cuisine); break;
            case "danser": image.setImageResource(R.drawable.danser); break;
            case "echec": image.setImageResource(R.drawable.echec); break;
            case "jardinage" : image.setImageResource(R.drawable.jardinage); break;
            case "karaoke" : image.setImageResource(R.drawable.karaoke); break;
            case "lecture" : image.setImageResource(R.drawable.lecture); break;
            case "musculation" : image.setImageResource(R.drawable.musculation); break;
            case "peche" : image.setImageResource(R.drawable.peche); break;
            case "peintre" : image.setImageResource(R.drawable.peintre); break;
            case "photo" : image.setImageResource(R.drawable.photo); break;
            case "sport" : image.setImageResource(R.drawable.sport); break;
            case "voyage" : image.setImageResource(R.drawable.voyage); break;
            case "yoga" : image.setImageResource(R.drawable.yoga); break;
        }

    }
}
