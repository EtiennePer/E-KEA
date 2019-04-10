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
        String[] array = {"travailleur","passionne","tenace", "determine", "curieux", "independant"};
        return array;
    }

    @Override
    public String getDescription() {
        return "IT Rugby";
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
                "Cuisine", "J'adore faire des repas pour mes amis/famille",
                "Sport", "Je suis passsioné de sport depuis de nombreuses années",
                "Voyage", "Un sac à dos, et c'est parti !",
                "Danser", "Principalement pour amuser les copains!",
                "Cinema", "Environ une fois par semaine, pour des films en tous genres."
        };
        return array;
    }

    @Override
    public String[] getSkillsSavoirFaireName() {
        String[] array = {
                "Android",
                "Java",
                "Kotlin",
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
                3.5F,
                3.5F,
                2F,
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
