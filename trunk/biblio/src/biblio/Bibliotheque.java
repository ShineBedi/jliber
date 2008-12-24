
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
    private static final long serialVersionUID = 42L;
    // Attributs d'Association
    private Hashtable<Integer,Lecteur> lecteurs;
    private Hashtable<String,Ouvrage> ouvrages;
    private Hashtable<String,Periodique> periodiques;
    private Hashtable<String, Article> articles;
    private Set<Emprunt> emprunts;
    private Hashtable<String,Auteur> auteurs;
    private Hashtable<String,MotCle> motsCles;

// ***************************
//      Constructeur
// ***************************
public Bibliotheque() {
        lecteurs = new Hashtable();
        ouvrages = new Hashtable();
        periodiques = new Hashtable();
        emprunts = new HashSet<Emprunt>();
        auteurs = new Hashtable();
        motsCles = new Hashtable();
        derNumLecteur = 0;

        try {
            BufferedReader in =  new BufferedReader(new FileReader("ListeAutorite.txt"));
            String ligne;
            while((ligne= in.readLine()) != null)
            {
                this.lierMotCle(new MotCle(ligne), ligne);
             }
        } catch(Exception e) {
             javax.swing.JOptionPane.showMessageDialog(null, "Impossible d'ouvrir la liste des mots clés");
        }


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
public Periodique nouveauPeriodique(String issn, String nom) {
        // Création de l'objet ouv
        Periodique per = new Periodique(issn, nom);

        this.lierPeriodique(per, issn);
        return per;
} // Fin nouveauperiodique
//****************************
public Ouvrage nouvelOuvrage(String isbn, String tit, String ed, GregorianCalendar dateE, Set<Auteur> mesAuteurs, Set<MotCle> mesMotsCles) {
        // Création de l'objet ouv
        Ouvrage ouv = new Ouvrage(isbn, tit, ed, dateE, mesAuteurs, mesMotsCles);

        this.lierOuvrage(ouv, isbn);
        return ouv;
} // Fin nouvelOuvrage

//****************************
public void nouvelExemplaire(Ouvrage ouv, GregorianCalendar dateR) {
        ouv.ajouterExemplaire(dateR);
} // Fin nouvelExemplaire

public void nouvelEmprunt(GregorianCalendar dateEmp, GregorianCalendar dateRetour, Lecteur lect, Exemplaire exemp){
    Emprunt emprunt = new Emprunt(dateEmp, dateRetour, lect, exemp);
}
//****************************
public void modifStatutExemplaire(Exemplaire ex, int s) {
            ex.modifierStatut(s);
} // modifStatutExemplaire

public Auteur nouvelAuteur(String nom, String prenom) {
    Auteur aut = new Auteur(nom, prenom);
    this.lierAuteur(aut, nom+prenom);
    return aut;
}



// ********************************************
//    Méthodes d'accès- liaison d'objets
// ********************************************

public Enumeration enumMotsCles() {return motsCles.elements();}

public Enumeration enumAuteurs() { return auteurs.elements(); }
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

private void lierOuvrage(Ouvrage ouv, String isbn) {
    ouvrages.put(isbn, ouv);
} // Fin lierOuvrage

public Periodique unPeriodique(String issn) {
    return (Periodique) periodiques.get(issn);
} // Fin unPeriodique

private void lierPeriodique(Periodique per, String issn) {
    periodiques.put(issn, per);
} // Fin lierPeriodique


public Auteur unAuteur(String nomprenom) {
    return (Auteur) auteurs.get(nomprenom);
}

private void lierAuteur(Auteur aut, String nomprenom) {
    auteurs.put(nomprenom, aut);
}

public MotCle unMotCle(String motcle) {
    return (MotCle) motsCles.get(motcle);
}

private void lierMotCle(MotCle mc, String motcle) {
    motsCles.put(motcle, mc);
}

private int genererNumLecteur() {
    derNumLecteur = derNumLecteur + 1;
    return this.derNumLecteur;
} // Fin genererNumLecteur

    private void jbInit() throws Exception {
    }
} // Fin Classe Bibliotheque
