package ecom.m1ice.e_kea;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import ecom.m1ice.e_kea.models.User;

public class PersonnalityActivity extends AppCompatActivity {

    private TextView tv_firstLastname;
    private CircularImageView img_pp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personnality);

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

        // Retrieve the good drawable Personnality (c'est moche parce que on peut pas accéder dynamiquement à des propriétés d'objets en JAVA)
        ImageView image = (ImageView) findViewById(R.id.imgView0);
        switch(actualUser.getPersonnality()[0]){
            case "apprendre" : image.setImageResource(R.drawable.apprendre); break;
            case "confiance" : image.setImageResource(R.drawable.confiance); break;
            case "curieux" : image.setImageResource(R.drawable.curieux); break;
            case "determine": image.setImageResource(R.drawable.determine); break;
            case "fiable": image.setImageResource(R.drawable.fiable); break;
            case "independant" : image.setImageResource(R.drawable.independant); break;
            case "integre" : image.setImageResource(R.drawable.integre); break;
            case "passionne" : image.setImageResource(R.drawable.passionne); break;
            case "tenace" : image.setImageResource(R.drawable.tenace); break;
            case "travailleur" : image.setImageResource(R.drawable.travailleur); break;
        }

        image = (ImageView) findViewById(R.id.imgView1);
        switch(actualUser.getPersonnality()[1]){
            case "apprendre" : image.setImageResource(R.drawable.apprendre); break;
            case "confiance" : image.setImageResource(R.drawable.confiance); break;
            case "curieux" : image.setImageResource(R.drawable.curieux); break;
            case "determine": image.setImageResource(R.drawable.determine); break;
            case "fiable": image.setImageResource(R.drawable.fiable); break;
            case "independant" : image.setImageResource(R.drawable.independant); break;
            case "integre" : image.setImageResource(R.drawable.integre); break;
            case "passionne" : image.setImageResource(R.drawable.passionne); break;
            case "tenace" : image.setImageResource(R.drawable.tenace); break;
            case "travailleur" : image.setImageResource(R.drawable.travailleur); break;
        }

        image = (ImageView) findViewById(R.id.imgView2);
        switch(actualUser.getPersonnality()[2]){
            case "apprendre" : image.setImageResource(R.drawable.apprendre); break;
            case "confiance" : image.setImageResource(R.drawable.confiance); break;
            case "curieux" : image.setImageResource(R.drawable.curieux); break;
            case "determine": image.setImageResource(R.drawable.determine); break;
            case "fiable": image.setImageResource(R.drawable.fiable); break;
            case "independant" : image.setImageResource(R.drawable.independant); break;
            case "integre" : image.setImageResource(R.drawable.integre); break;
            case "passionne" : image.setImageResource(R.drawable.passionne); break;
            case "tenace" : image.setImageResource(R.drawable.tenace); break;
            case "travailleur" : image.setImageResource(R.drawable.travailleur); break;
        }

        image = (ImageView) findViewById(R.id.imgView3);
        switch(actualUser.getPersonnality()[3]){
            case "apprendre" : image.setImageResource(R.drawable.apprendre); break;
            case "confiance" : image.setImageResource(R.drawable.confiance); break;
            case "curieux" : image.setImageResource(R.drawable.curieux); break;
            case "determine": image.setImageResource(R.drawable.determine); break;
            case "fiable": image.setImageResource(R.drawable.fiable); break;
            case "independant" : image.setImageResource(R.drawable.independant); break;
            case "integre" : image.setImageResource(R.drawable.integre); break;
            case "passionne" : image.setImageResource(R.drawable.passionne); break;
            case "tenace" : image.setImageResource(R.drawable.tenace); break;
            case "travailleur" : image.setImageResource(R.drawable.travailleur); break;
        }

        image = (ImageView) findViewById(R.id.imgView4);
        switch(actualUser.getPersonnality()[4]){
            case "apprendre" : image.setImageResource(R.drawable.apprendre); break;
            case "confiance" : image.setImageResource(R.drawable.confiance); break;
            case "curieux" : image.setImageResource(R.drawable.curieux); break;
            case "determine": image.setImageResource(R.drawable.determine); break;
            case "fiable": image.setImageResource(R.drawable.fiable); break;
            case "independant" : image.setImageResource(R.drawable.independant); break;
            case "integre" : image.setImageResource(R.drawable.integre); break;
            case "passionne" : image.setImageResource(R.drawable.passionne); break;
            case "tenace" : image.setImageResource(R.drawable.tenace); break;
            case "travailleur" : image.setImageResource(R.drawable.travailleur); break;
        }

        image = (ImageView) findViewById(R.id.imgView5);
        switch(actualUser.getPersonnality()[5]){
            case "apprendre" : image.setImageResource(R.drawable.apprendre); break;
            case "confiance" : image.setImageResource(R.drawable.confiance); break;
            case "curieux" : image.setImageResource(R.drawable.curieux); break;
            case "determine": image.setImageResource(R.drawable.determine); break;
            case "fiable": image.setImageResource(R.drawable.fiable); break;
            case "independant" : image.setImageResource(R.drawable.independant); break;
            case "integre" : image.setImageResource(R.drawable.integre); break;
            case "passionne" : image.setImageResource(R.drawable.passionne); break;
            case "tenace" : image.setImageResource(R.drawable.tenace); break;
            case "travailleur" : image.setImageResource(R.drawable.travailleur); break;
        }



        img_pp.setImageDrawable(img);
    }
}
