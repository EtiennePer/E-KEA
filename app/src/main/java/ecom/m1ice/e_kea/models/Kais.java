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

    @Override
    public String getDescription() {
        return "IT Muscular";
    }

    @Override
    public String getAttentesPersonelles() {
        return "Hello";
    }

    @Override
    public String getAttentesProfessionnelles() {
        return "Hello";
    }

    @Override
    public String[] getHobbies() {
        String[] array = {
                "Pêche", "Je pêchais quand j'étais petit",
                "Voyage", "Je n'hésite pas à voyager dès que j'en ai l'occasion",
                "Jardinage", "Rien ne vaut les légumes venant de la terre !",
                "Cuisine", "J'hérite d'une grande culture culinaire",
                "Yoga", "Relaxant !"
        };
        return array;
    }
}
