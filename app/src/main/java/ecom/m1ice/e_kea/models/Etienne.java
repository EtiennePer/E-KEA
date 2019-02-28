package ecom.m1ice.e_kea.models;

import java.util.Date;

public class Etienne implements User {
    @Override
    public String getFirstname() {
        return "Etienne";
    }

    @Override
    public String getLastname() {
        return "Pericat";
    }

    @Override
    public Date getBithDate() {
        return new Date(1997, 02, 11);
    }

    @Override
    public String getPhotoPathName() {
        return "etienne.png";
    }

    @Override
    public String getResumePathName() {
        return "cv_etienne.pdf";
    }

    @Override
    public String[] getPersonnality() {
        String[] array = {"integre","passionne","tenace", "apprendre", "curieux", "fiable"};
        return array;
    }

    @Override
    public String getDescription() {
        return "IT Rugby";
    }

    @Override
    public String[] getHobbies() {
        String[] array = {"alcool","cinema","echec", "lecture", "sport"};
        return array;
    }
}
