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
        return new Date(1997, 5, 21);
    }

    @Override
    public String getDescription() {
        return "IT Traveler";
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
    public String getPhotoPathName() {
        return null;
    }

    @Override
    public String getResumePathName() {
        return "cv_alexandre.pdf";
    }

    @Override
    public String[] getPersonnality() {
        String[] array = {"apprendre","integre","confiance", "determine", "fiable", "curieux"};
        return array;
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
