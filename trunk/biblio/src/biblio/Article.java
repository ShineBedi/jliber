package biblio;

import java.io.*;
import java.util.*;

public class Article
        extends Observable            // pour MVC
        implements Serializable {

//**************************
//        Attributs
//**************************


    private String titre;
    private int    page;

    private Parution     parution;

    // Attributs d'Association
    private Set<Auteur>  auteurs;
    private Set<MotCle>  motsCles;

    public Article(String titre, int page, Parution parution) {
        this.titre = titre;
        this.page = page;
        this.lierParution(parution);
        auteurs = new HashSet<Auteur>();
        motsCles = new HashSet<MotCle>();
    }

    //**********************************************
    // Methodes d'acces aux attributs de la classe
    //**********************************************

    public String titre() { return titre; }
    public int page() { return page; }


    public Set<Auteur> tesAuteurs() {
        return (Set<Auteur>)auteurs;
    }

    public Set<MotCle> tesMotsCles() {
        return (Set<MotCle>)motsCles;
    }

    public Parution taParution() {
        return (Parution)parution;
    }


    // ***************************
    //     Méthodes privées
    // ***************************
    private void lierAuteur(Set<Auteur> auteurs) {
        this.auteurs = auteurs;
    } // Fin lierOuvrage

    private void lierMotCle(Set<MotCle> motsCles) {
        this.motsCles = motsCles;
    }

    private void lierParution(Parution parution) {
        this.parution = parution;
    }

}