
package biblio;

import java.io.*;
import java.util.*;

public class Auteur
        extends Index
        implements Serializable {

//**************************
//        Attributs
//**************************


    private String nom;
    private String prenom;

    // *************************
    //     Constructeur
    // *************************
    public Auteur(String nom, String prenom) {
        super(nom+prenom);
        this.nom = nom;
        this.prenom = prenom;
    } // Fin Constructeur

    //**********************************************
    // Methodes d'acces aux attributs de la classe
    //**********************************************

    public String nom() { return this.nom; }
    public String prenom() { return this.prenom; }

}
