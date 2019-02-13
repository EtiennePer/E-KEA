package ecom.m1ice.e_kea.models;

import java.util.Date;

public class Alexande implements User {
    @Override
    public String getFirstname() {
        return "Alexandre";
    }

    @Override
    public String getLastname() {
        return "Pausé";
    }

    @Override
    public Date getBithDate() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getPhotoPathName() {
        return null;
    }

    @Override
    public String getResumePathName() {
        return null;
    }
}
