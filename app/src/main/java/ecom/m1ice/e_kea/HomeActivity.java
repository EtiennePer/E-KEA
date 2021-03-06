package ecom.m1ice.e_kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ecom.m1ice.e_kea.models.Alexandre;
import ecom.m1ice.e_kea.models.Etienne;
import ecom.m1ice.e_kea.models.Kais;
import ecom.m1ice.e_kea.models.User;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void imageClick(View view) {
        User actualUser = ((GlobalVars) this.getApplication()).getActualUser();
        String imgName = view.getResources().getResourceName(view.getId());
        if(imgName != null){
            if(imgName.contains("alex")){
                ((GlobalVars) this.getApplication()).setActualUser(new Alexandre());
            }
            if(imgName.toLowerCase().contains("ka")){
                ((GlobalVars) this.getApplication()).setActualUser(new Kais());

            }
            if(imgName.toLowerCase().contains("eti")){
                ((GlobalVars) this.getApplication()).setActualUser(new Etienne());

            }
        }
        startActivity(new Intent(this, ResumeActivity.class));
    }
}