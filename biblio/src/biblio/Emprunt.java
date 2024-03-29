package biblio;

import java.io.*;
import java.util.*;

public class Emprunt
        extends Observable            // pour MVC
        implements Serializable {

//**************************
//        Attributs
//**************************


    private GregorianCalendar dateEmprunt;
    private GregorianCalendar dateRetour;

    private Lecteur lecteur;
    private Exemplaire exemplaire;

    public Emprunt(GregorianCalendar dateEmprunt, GregorianCalendar dateRetour, Lecteur lecteur, Exemplaire exemplaire) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.lierLecteur(lecteur);
        lecteur.lierEmprunt(this);
        this.lierExemplaire(exemplaire);
        exemplaire.lierEmprunt(this);
    }

    //**********************************************
    // Methodes d'acces aux attributs de la classe
    //**********************************************

    public GregorianCalendar dateEmprunt() { return dateEmprunt; }
    public GregorianCalendar dateRetour() { return dateRetour; }

    public void finEmprunt(GregorianCalendar dateRetour) {
        this.dateRetour = dateRetour;
    }
    public Lecteur tonLecteur() {
        return (Lecteur)lecteur;
    }

    private void lierLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public Exemplaire tonExemplaire() {
        return (Exemplaire)exemplaire;
    }

    private void lierExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }
    public void retourExemplaire( Lecteur lect, Exemplaire ex)
    {
        ex.supprimerEmprunt(this);
        lect.supprimerEmprunt(this);
        delierExemplaire(ex);
        delierLecteur(lect);
    }
    public void delierExemplaire(Exemplaire emp)
    {
        exemplaire = null;
    }
    public void delierLecteur(Lecteur lect)
    {
        lecteur = null;
    }
}