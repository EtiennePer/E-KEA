package ecom.m1ice.e_kea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ecom.m1ice.e_kea.GlobalVars;
import ecom.m1ice.e_kea.R;
import ecom.m1ice.e_kea.models.Etienne;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);

        // TODO : read TAG and select the good user
        ((GlobalVars) this.getApplication()).setActualUser(new Etienne()); // for example


        routeToAppropriatePage();
        finish();
    }

    private void routeToAppropriatePage() {

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
