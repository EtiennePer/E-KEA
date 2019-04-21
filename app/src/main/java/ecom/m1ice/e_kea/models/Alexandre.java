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
        return "A la sortie du Baccalauréat je n’avais aucune envie particulière de poursuite d’étude. " +
                "L’informatique, le sport ou la santé étais des domaines qui pouvait me plaire. " +
                "Puis sur un coup de tête à la dernière minute j’ai finalement décidé d’aller vers l’informatique. " +
                "Depuis je ne m’en suis jamais lassé. " +
                "C’est un domaine vaste qui offre de multiples opportunités. " +
                "Aujourd’hui je travaille pour une compagnie aérienne et je voyage à ma guise … et demain ? ";
    }

    @Override
    public String getAttentesProfessionnelles() {
        return "Selon moi ce qui différencie mon métier dans l’informatique des autres domaines c’est que je suis libre de choisir le secteur d’activité où je veux travailler. " +
                "La seule barrière étant l’anglais. J’aspire à travailler dans une entreprise et y rester pour la voir grandir et surtout en être un moteur de son développement. " +
                "Avant d’arriver à cela peut être que voyager et travailler à travers le monde pourrais me plaire.";
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
                "Pêche", "C'est une passion que l'on transmet de génération en génération ! Même si c'est assez ennuyant dans le fond ..",
                "Voyage", "Je n'hésite pas à voyager dès que j'en ai l'occasion, à chaque congé ! Une façon de découvrir d'autre culture. Le monde a tellement à offrir !",
                "Jeux", "J'adore jouer ! Que ce soit avec des jeux de sociétés ou des jeux vidéos. En solo ou à plusieurs !",
                "Cuisine", "J'hérite d'une grande culture culinaire mais je dois encore m'améliorer. Il y a encore tellement de plat de La Réunion que je ne sais pas encore faire..",
                "Yoga", "Peut être pas le yoga en général mais me détendre après le travail ou la fac voir même pendant les voyages !"
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
                2.5F,
                1.5F,
                3.5F,
                1F,
                3F,
                4F,
                3.5F,
                3F,
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

    @Override
    public String[] getCareer() {
        //A gauche :    Etude-  graduate (=done), livre(= en cours)
        //              Stage-  travail (=done), star (= en cours)
        //A droite : Votre expérience
        String[] array = {
                "star", "2018-2020 - Air France - Alternance développeur Angular 7, big data et gestion de projet",
                "livre", "2018-2020 - Master MIASHS parcours ICE - Université Toulouse Jean Jaurès",
                "travail", "2018 - Air France - Alternance développeur chargé des tests (développement et management)",
                "graduate", "2018 - Licence MIASHS parcours MIAGE - Université Paul Sabatier et Université Capitole",
                "graduate", "2017 - BTS SIO option SLAM - Lycée Bellepierre - Réunion",
                "travail", "Stage 7 semaines - Développement d'un site web avec backoffice pour la fédération française de danse de la Réunion",
                "travail", "Stage 5 semaines - Développeur sur l'application CityScreen dans une start-up de 5 personnes",
                "graduate", "2015 - Bac S SVT option ISN - Lycée Bel Air - Réunion",
        };
        return array;
    }



}
