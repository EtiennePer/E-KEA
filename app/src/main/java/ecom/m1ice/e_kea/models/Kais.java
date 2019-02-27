package ecom.m1ice.e_kea.models;

import java.util.Date;

public class Kais implements User {


    @Override
    public String getFirstname() {
        return "Kais";
    }

    @Override
    public String getLastname() {
        return "Ben Youssef";
    }

    @Override
    public Date getBithDate() {
        return new Date(1994, 8, 07);
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getPhotoPathName() {
        return "kaiss.png";
    }

    @Override
    public String getResumePathName() {
        return null;
    }

    @Override
    public String[] getPersonnality() {
        String[] array = {"tenace","apprendre","travailleur", "curieux", "passionne", "integre"};
        return array;
    }
}
