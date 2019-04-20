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
        return "Je suis une personne qui aime s'impliquer au maximum dans ce qu'il entreprend. Que ce soit pour mes études, dans les activités sportives" +
                " ou bien au travail, j'aime me fixer des objectifs et tout mettre en place pour les atteindre. Ma timidité me joue parfois encore quelques tours et c'est un " +
                "des points sur lesquels je dois travailler pour m'affirmer. J'adore rigoler, faire la cuisine et passer de bons moments avec mes amis.";
    }

    @Override
    public String getAttentesProfessionnelles() {
        return "L'informatique est sans aucun doute un secteur incroyablement riche de diversité. Découvrir le monde du travail à travers une formation " +
                "en alternance est pour moi une très bonne occasion de survoler l'ensemble des domaines liés à l'informatique. " +
                "A terme j'espère pouvoir lancer un jour mon entreprise (pas obligatoirement dans le domaine de l'informatique) et ainsi être confronter " +
                "à de nouvelles problématiques, à de nouveaux défis.";
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
                "Angular 2",
                "HTML/CSS",
                "SQL",
                "Spring",
                "Modélisation de Processus"
        };
        return array;
    }

    @Override
    public float[] getSkillsSavoirFaireRate() {
        float[] array = {
                3.5F,
                3.5F,
                2F,
                2.5F,
                3F,
                3.5F,
                3F,
                2F,
        };
        return array;
    }

    @Override
    public String[] getSkillsSavoirEtreName() {
        String[] array = {
                "Patient",
                "Autonome",
                "Pédagogue",
                "Ouvert",
                "Passionné",
                "Sportif",
                "Vif",
                "Timide",
        };
        return array;
    }

    @Override
    public float[] getSkillsSavoirEtreRate() {
        float[] array = {
                4,
                4,
                2.5F,
                3,
                3,
                3.5F,
                4F,
                2.5F,
        };
        return array;
    }

    @Override
    public String[] getCareer() {
        //A gauche :    Etude-  graduate (=done), livre(= en cours)
        //              Stage-  travail (=done), star (= en cours)
        //A droite : Votre expérience
        String[] array = {
                "", "",
                "", "",
                "", "",
                "", "",
                "", "",
                "", "",
                "", "",
                "", ""
        };
        return array;
    }
}
