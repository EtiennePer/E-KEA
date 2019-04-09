package ecom.m1ice.e_kea.models;

import java.util.Date;

public class Alexandre implements User {
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

    @Override
    public String[] getSkillsSavoirFaireName() {
        String[] array = {
                "Java EE",
                "Android",
                "Javascript",
                "Python",
                "PHP",
                "Symfony 3",
                "Laravel 5",
                "Angular 7",
        };
        return array;
    }

    @Override
    public float[] getSkillsSavoirFaireRate() {
        float[] array = {
                2,
                1.2F,
                3.5F,
                3,
                2.4F,
                4,
                3.1F,
                1.8F,
        };
        return array;
    }

    @Override
    public String[] getSkillsSavoirEtreName() {
        String[] array = {
                "Leadeur",
                "Patient",
                "Pédagogue",
                "Ouvert",
                "Passioné",
                "Créateur",
                "Tolérant",
                "Volontaire",
        };
        return array;
    }

    @Override
    public float[] getSkillsSavoirEtreRate() {
        float[] array = {
                4,
                4,
                4,
                2,
                3,
                1.8F,
                1.4F,
                1.7F,
        };
        return array;
    }

}
