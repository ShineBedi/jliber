
package biblio;

import java.io.*;
import java.util.*;

public class Auteur
        extends Observable            // pour MVC
        implements Serializable {

//**************************
//        Attributs
//**************************


    private String nom;
    private String prenom;


    // Attributs d'Association
    private Set<Article> articles;
    private Set<Ouvrage> ouvrages;

    // *************************
    //     Constructeur
    // *************************
    public Auteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        articles = new HashSet<Article>();
        ouvrages = new HashSet<Ouvrage>();
    } // Fin Constructeur

    //**********************************************
    // Methodes d'acces aux attributs de la classe
    //**********************************************

    public String nom() { return this.nom; }
    public String prenom() { return this.prenom; }


    public Set<Article> tesArticles() {
        return (Set<Article>)articles;
    }

    public Set<Ouvrage> tesOuvrages() {
        return (Set<Ouvrage>)ouvrages;
    }



    // ***************************
    //     Méthodes privées
    // ***************************
    private void lierOuvrage(Set<Ouvrage> ouv) {
        ouvrages = ouv;
    } // Fin lierOuvrage

    private void lierArticle(Set<Article> art) {
        articles = art;
    }
}
