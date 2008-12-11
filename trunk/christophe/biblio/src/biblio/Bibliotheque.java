
package biblio;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Bibliotheque
        implements Serializable {

// **************************
//       Attributs
// **************************
    private int derNumLecteur;

    // Attributs d'Association
    private Hashtable lecteurs;
    private Hashtable ouvrages;
    private Hashtable periodiques;
    private Set1 emprunts;

// ***************************
//      Constructeur
// ***************************
public Bibliotheque() {
        lecteurs = new Hashtable();
        ouvrages = new Hashtable();
        periodiques = new Hashtable();
        emprunts = new Set1();

        derNumLecteur = 0;
        try {
            jbInit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }  // Fin Bibliotheque

//****************************
//     Methodes publiques
//****************************
public Lecteur nouveauLecteur(String no, String pr, String ad, int ag) {

        int numero = this.genererNumLecteur();
        // Creation de l'instance lect
        Lecteur lect = new Lecteur(numero, no, pr, ad, ag);
        this.lierLecteur(lect, numero);

        return lect;
} // Fin  nouveauLecteur

//****************************
public Ouvrage nouvelOuvrage(String isbn, String tit, String aut,
                               String ed, GregorianCalendar dateE) {
        // Création de l'objet ouv
        Ouvrage ouv = new Ouvrage(isbn, tit, aut, ed, dateE);

        this.lierOuvrage(ouv, isbn);
        return ouv;
} // Fin nouvelOuvrage
//****************************
public Periodique nouveauPeriodique(String issn, String nom) {
        // Création de l'objet ouv
        Periodique per = new Periodique(issn, nom);

        this.lierPeriodique(per, issn);
        return per;
} // Fin nouvelOuvrage
//****************************
public void nouvelExemplaire(Ouvrage ouv, GregorianCalendar dateR) {
        ouv.ajouterExemplaire(dateR);
} // Fin nouvelExemplaire

//****************************
public void modifStatutExemplaire(Exemplaire ex, int s) {
            ex.modifierStatut(s);
} // modifStatutExemplaire




// ********************************************
//    Méthodes d'accès- liaison d'objets
// ********************************************

//***********************************
public Lecteur unLecteur(int numero) {
     return (Lecteur) lecteurs.get(new Integer(numero));
}  // Fin unLecteur

private void lierLecteur(Lecteur lec, int numero) {
    lecteurs.put(new Integer(numero), lec);
} // Fin lierLecteur

public Ouvrage unOuvrage(String isbn) {
    return (Ouvrage) ouvrages.get(isbn);
} // Fin un Ouvrage

public Periodique unPeriodique(String issn) {
    return (Periodique) periodiques.get(issn);
} 

/*
public Periodique unPeriodique(string issn) {
	return (Periodique) periodiques.get(issn);
} // Fin un Periodique
*/

private void lierOuvrage(Ouvrage ouv, String isbn) {
    ouvrages.put(isbn, ouv);
} // Fin lierOuvrage
private void lierPeriodique(Periodique per, String issn) {
    periodiques.put(issn, per);
} 

private int genererNumLecteur() {
    derNumLecteur = derNumLecteur + 1;
    return this.derNumLecteur;
} // Fin genererNumLecteur

    private void jbInit() throws Exception {
    }
} // Fin Classe Bibliotheque
