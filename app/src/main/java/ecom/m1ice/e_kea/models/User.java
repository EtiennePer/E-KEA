package ecom.m1ice.e_kea.models;

import java.util.Date;

public interface User {
    String getFirstname();
    String getLastname();
    Date getBithDate();
    String getPhotoPathName();
    String getResumePathName();
    String[] getPersonnality();
    String[] getHobbies();
    String getDescription();
    String getAttentesPersonelles();
    String getAttentesProfessionnelles();
}
