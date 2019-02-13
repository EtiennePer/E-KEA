package ecom.m1ice.e_kea;

import android.app.Application;

import ecom.m1ice.e_kea.models.Alexande;
import ecom.m1ice.e_kea.models.Etienne;
import ecom.m1ice.e_kea.models.User;

public class GlobalVars extends Application {


    private User actualUser;

    public User getActualUser() {

        if (actualUser == null)
            return new Etienne();

        return actualUser;
    }

    public void setActualUser(User actualUser) {
        this.actualUser = actualUser;
    }
}
