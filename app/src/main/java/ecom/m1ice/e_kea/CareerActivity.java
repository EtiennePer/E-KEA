package ecom.m1ice.e_kea;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import ecom.m1ice.e_kea.models.User;

public class CareerActivity extends AppCompatActivity {

    private TextView tv_firstLastname;
    private CircularImageView img_pp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);

        // Retrieve pp and name
        tv_firstLastname = findViewById(R.id.RESUME_tv_FirstnameLastname);
        img_pp = findViewById(R.id.RESUME_img_profile);

        // Retrieve the actual user
        User actualUser = ((GlobalVars) this.getApplication()).getActualUser();

        // Set content of form
        tv_firstLastname.setText(actualUser.getFirstname() + " " + actualUser.getLastname() + "\n" + actualUser.getDescription() + "\n" + "Carrière");

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

        /****** CAREER BODY *****/
        //Declare image var
        ImageView image1 = (ImageView) findViewById(R.id.imgCareer1);
        ImageView image2 = (ImageView) findViewById(R.id.imgCareer2);
        ImageView image3 = (ImageView) findViewById(R.id.imgCareer3);
        ImageView image4 = (ImageView) findViewById(R.id.imgCareer4);
        ImageView image5 = (ImageView) findViewById(R.id.imgCareer5);
        ImageView image6 = (ImageView) findViewById(R.id.imgCareer6);
        ImageView image7 = (ImageView) findViewById(R.id.imgCareer7);
        ImageView image8 = (ImageView) findViewById(R.id.imgCareer8);

        //Set Image with User value

        int val = 0;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image1.setImageResource(R.drawable.graduate); break;
                case "livre": image1.setImageResource(R.drawable.livre);break;
                case "star": image1.setImageResource(R.drawable.star);break;
                case "travail": image1.setImageResource(R.drawable.travail);break;
                default:image1.setImageResource(R.drawable.avenir);break;
            }
        }

        val = 2;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image2.setImageResource(R.drawable.graduate); break;
                case "livre": image2.setImageResource(R.drawable.livre);break;
                case "star": image2.setImageResource(R.drawable.star);break;
                case "travail": image2.setImageResource(R.drawable.travail);break;
                default:image2.setImageResource(R.drawable.avenir);break;
            }
        }

        val = 4;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image3.setImageResource(R.drawable.graduate); break;
                case "livre": image3.setImageResource(R.drawable.livre);break;
                case "star": image3.setImageResource(R.drawable.star);break;
                case "travail": image3.setImageResource(R.drawable.travail);break;
                default:image3.setImageResource(R.drawable.avenir);break;
            }
        }

        val = 6;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image4.setImageResource(R.drawable.graduate); break;
                case "livre": image4.setImageResource(R.drawable.livre);break;
                case "star": image4.setImageResource(R.drawable.star);break;
                case "travail": image4.setImageResource(R.drawable.travail);break;
                default:image4.setImageResource(R.drawable.avenir);break;
            }
        }

        val = 8;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image5.setImageResource(R.drawable.graduate); break;
                case "livre": image5.setImageResource(R.drawable.livre);break;
                case "star": image5.setImageResource(R.drawable.star);break;
                case "travail": image5.setImageResource(R.drawable.travail);break;
                default:image5.setImageResource(R.drawable.avenir);break;
            }
        }

        val = 10;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image6.setImageResource(R.drawable.graduate); break;
                case "livre": image6.setImageResource(R.drawable.livre);break;
                case "star": image6.setImageResource(R.drawable.star);break;
                case "travail": image6.setImageResource(R.drawable.travail);break;
                default:image6.setImageResource(R.drawable.avenir);break;
            }
        }

        val = 12;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image7.setImageResource(R.drawable.graduate); break;
                case "livre": image7.setImageResource(R.drawable.livre);break;
                case "star": image7.setImageResource(R.drawable.star);break;
                case "travail": image7.setImageResource(R.drawable.travail);break;
                default:image7.setImageResource(R.drawable.avenir);break;
            }
        }

        val = 14;
        if(actualUser.getCareer()[val].length() > 3){
            switch((actualUser.getCareer()[val])){
                case "graduate": image8.setImageResource(R.drawable.graduate); break;
                case "livre": image8.setImageResource(R.drawable.livre);break;
                case "star": image8.setImageResource(R.drawable.star);break;
                case "travail": image8.setImageResource(R.drawable.travail);break;
                default:image8.setImageResource(R.drawable.avenir);break;
            }
        }

        // Declare textView
        TextView txtView1 = (TextView) findViewById(R.id.textCareer1);
        TextView txtView2 = (TextView) findViewById(R.id.textCareer2);
        TextView txtView3 = (TextView) findViewById(R.id.textCareer3);
        TextView txtView4 = (TextView) findViewById(R.id.textCareer4);
        TextView txtView5 = (TextView) findViewById(R.id.textCareer5);
        TextView txtView6 = (TextView) findViewById(R.id.textCareer6);
        TextView txtView7 = (TextView) findViewById(R.id.textCareer7);
        TextView txtView8 = (TextView) findViewById(R.id.textCareer8);

        // Set textview with User Data
        val = 1;
        if(actualUser.getCareer()[val].length() > 3){
           txtView1.setText(actualUser.getCareer()[val]);
        }
        val = 3;
        if(actualUser.getCareer()[val].length() > 3){
            txtView2.setText(actualUser.getCareer()[val]);
        }
        val = 5;
        if(actualUser.getCareer()[val].length() > 3){
            txtView3.setText(actualUser.getCareer()[val]);
        }
        val = 7;
        if(actualUser.getCareer()[val].length() > 3){
            txtView4.setText(actualUser.getCareer()[val]);
        }
        val = 9;
        if(actualUser.getCareer()[val].length() > 3){
            txtView5.setText(actualUser.getCareer()[val]);
        }
        val = 11;
        if(actualUser.getCareer()[val].length() > 3){
            txtView6.setText(actualUser.getCareer()[val]);
        }
        val = 13;
        if(actualUser.getCareer()[val].length() > 3){
            txtView7.setText(actualUser.getCareer()[val]);
        }
        val = 15;
        if(actualUser.getCareer()[val].length() > 3){
            txtView8.setText(actualUser.getCareer()[val]);
        }



    }

    public void navigateToResume(View view) {
        startActivity(new Intent(this, ResumeActivity.class));
    }



}

