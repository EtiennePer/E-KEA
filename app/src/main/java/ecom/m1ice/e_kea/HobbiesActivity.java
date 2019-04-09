package ecom.m1ice.e_kea;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
         // Retrieve pp and name
        tv_firstLastname = findViewById(R.id.RESUME_tv_FirstnameLastname);
        img_pp = findViewById(R.id.RESUME_img_profile);

        // Retrieve the actual user
        final User actualUser = ((GlobalVars) this.getApplication()).getActualUser();

        // Set content of form
        tv_firstLastname.setText(actualUser.getFirstname() + " " + actualUser.getLastname() + "\n" + actualUser.getDescription() + "\n" + "Hobbies");

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
        ImageView image0 = (ImageView) findViewById(R.id.imgView0);
        switch(actualUser.getHobbies()[0]){
            case "Alcool" : image0.setImageResource(R.drawable.alcool); break;
            case "Cinema" : image0.setImageResource(R.drawable.cinema); break;
            case "Cuisine" : image0.setImageResource(R.drawable.cuisine); break;
            case "Danser": image0.setImageResource(R.drawable.danser); break;
            case "Echec": image0.setImageResource(R.drawable.echec); break;
            case "Jardinage" : image0.setImageResource(R.drawable.jardinage); break;
            case "Karaoke" : image0.setImageResource(R.drawable.karaoke); break;
            case "Lecture" : image0.setImageResource(R.drawable.lecture); break;
            case "Musculation" : image0.setImageResource(R.drawable.musculation); break;
            case "Pêche" : image0.setImageResource(R.drawable.peche); break;
            case "Peintre" : image0.setImageResource(R.drawable.peintre); break;
            case "Photo" : image0.setImageResource(R.drawable.photo); break;
            case "Sport" : image0.setImageResource(R.drawable.sport); break;
            case "Voyage" : image0.setImageResource(R.drawable.voyage); break;
            case "Yoga" : image0.setImageResource(R.drawable.yoga); break;
        }

        ImageView image1 = (ImageView) findViewById(R.id.imgView1);
        switch(actualUser.getHobbies()[2]){
            case "Alcool" : image1.setImageResource(R.drawable.alcool); break;
            case "Cinema" : image1.setImageResource(R.drawable.cinema); break;
            case "Cuisine" : image1.setImageResource(R.drawable.cuisine); break;
            case "Danser": image1.setImageResource(R.drawable.danser); break;
            case "Echec": image1.setImageResource(R.drawable.echec); break;
            case "Jardinage" : image1.setImageResource(R.drawable.jardinage); break;
            case "Karaoke" : image1.setImageResource(R.drawable.karaoke); break;
            case "Lecture" : image1.setImageResource(R.drawable.lecture); break;
            case "Musculation" : image1.setImageResource(R.drawable.musculation); break;
            case "Pêche" : image1.setImageResource(R.drawable.peche); break;
            case "Peintre" : image1.setImageResource(R.drawable.peintre); break;
            case "Photo" : image1.setImageResource(R.drawable.photo); break;
            case "Sport" : image1.setImageResource(R.drawable.sport); break;
            case "Voyage" : image1.setImageResource(R.drawable.voyage); break;
            case "Yoga" : image1.setImageResource(R.drawable.yoga); break;
        }

        ImageView image2 = (ImageView) findViewById(R.id.imgView2);
        switch(actualUser.getHobbies()[4]){
            case "Alcool" : image2.setImageResource(R.drawable.alcool); break;
            case "Cinema" : image2.setImageResource(R.drawable.cinema); break;
            case "Cuisine" : image2.setImageResource(R.drawable.cuisine); break;
            case "Danser": image2.setImageResource(R.drawable.danser); break;
            case "Echec": image2.setImageResource(R.drawable.echec); break;
            case "Jardinage" : image2.setImageResource(R.drawable.jardinage); break;
            case "Karaoke" : image2.setImageResource(R.drawable.karaoke); break;
            case "Lecture" : image2.setImageResource(R.drawable.lecture); break;
            case "Musculation" : image2.setImageResource(R.drawable.musculation); break;
            case "Pêche" : image2.setImageResource(R.drawable.peche); break;
            case "Peintre" : image2.setImageResource(R.drawable.peintre); break;
            case "Photo" : image2.setImageResource(R.drawable.photo); break;
            case "Sport" : image2.setImageResource(R.drawable.sport); break;
            case "Voyage" : image2.setImageResource(R.drawable.voyage); break;
            case "Yoga" : image2.setImageResource(R.drawable.yoga); break;
        }

        ImageView image3 = (ImageView) findViewById(R.id.imgView3);
        switch(actualUser.getHobbies()[6]){
            case "Alcool" : image3.setImageResource(R.drawable.alcool); break;
            case "Cinema" : image3.setImageResource(R.drawable.cinema); break;
            case "Cuisine" : image3.setImageResource(R.drawable.cuisine); break;
            case "Danser": image3.setImageResource(R.drawable.danser); break;
            case "Echec": image3.setImageResource(R.drawable.echec); break;
            case "Jardinage" : image3.setImageResource(R.drawable.jardinage); break;
            case "Karaoke" : image3.setImageResource(R.drawable.karaoke); break;
            case "Lecture" : image3.setImageResource(R.drawable.lecture); break;
            case "Musculation" : image3.setImageResource(R.drawable.musculation); break;
            case "Pêche" : image3.setImageResource(R.drawable.peche); break;
            case "Peintre" : image3.setImageResource(R.drawable.peintre); break;
            case "Photo" : image3.setImageResource(R.drawable.photo); break;
            case "Sport" : image3.setImageResource(R.drawable.sport); break;
            case "Voyage" : image3.setImageResource(R.drawable.voyage); break;
            case "Yoga" : image3.setImageResource(R.drawable.yoga); break;
        }

        ImageView image4 = (ImageView) findViewById(R.id.imgView4);
        switch(actualUser.getHobbies()[8]){
            case "Alcool" : image4.setImageResource(R.drawable.alcool); break;
            case "Cinema" : image4.setImageResource(R.drawable.cinema); break;
            case "Cuisine" : image4.setImageResource(R.drawable.cuisine); break;
            case "Danser": image4.setImageResource(R.drawable.danser); break;
            case "Echec": image4.setImageResource(R.drawable.echec); break;
            case "Jardinage" : image4.setImageResource(R.drawable.jardinage); break;
            case "Karaoke" : image4.setImageResource(R.drawable.karaoke); break;
            case "Lecture" : image4.setImageResource(R.drawable.lecture); break;
            case "Musculation" : image4.setImageResource(R.drawable.musculation); break;
            case "Pêche" : image4.setImageResource(R.drawable.peche); break;
            case "Peintre" : image4.setImageResource(R.drawable.peintre); break;
            case "Photo" : image4.setImageResource(R.drawable.photo); break;
            case "Sport" : image4.setImageResource(R.drawable.sport); break;
            case "Voyage" : image4.setImageResource(R.drawable.voyage); break;
            case "Yoga" : image4.setImageResource(R.drawable.yoga); break;
        }

        image0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HobbiesActivity.this);
                builder.setCancelable(true);
                builder.setTitle(actualUser.getHobbies()[0]);
                builder.setMessage(actualUser.getHobbies()[1]);
                builder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HobbiesActivity.this);
                builder.setCancelable(true);
                builder.setTitle(actualUser.getHobbies()[2]);
                builder.setMessage(actualUser.getHobbies()[3]);
                builder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HobbiesActivity.this);
                builder.setCancelable(true);
                builder.setTitle(actualUser.getHobbies()[4]);
                builder.setMessage(actualUser.getHobbies()[5]);
                builder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HobbiesActivity.this);
                builder.setCancelable(true);
                builder.setTitle(actualUser.getHobbies()[6]);
                builder.setMessage(actualUser.getHobbies()[7]);
                builder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HobbiesActivity.this);
                builder.setCancelable(true);
                builder.setTitle(actualUser.getHobbies()[8]);
                builder.setMessage(actualUser.getHobbies()[9]);
                builder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }

    public void navigateToResume(View view) {
        startActivity(new Intent(this, ResumeActivity.class));
    }
}
