
package biblio;

import java.io.*;
//import java.lang.*;
import java.util.*;

public class Ouvrage
        extends Observable        // pour MVC
        implements Serializable {

// *************************
//        Attributs
// *************************
    private String isbn;
    private String titre;
    private String auteur;
    private String editeur;
    private GregorianCalendar dateEdition;
    private int derNumExemplaire;   // pour la g�n�ration des numeros d'exempl.

    //  Attributs d'Association
    private Hashtable exemplaires;

// ***********************************
//          Constructeur
// ***********************************
public Ouvrage(String is, String tit, String aut, String ed,
                   GregorianCalendar dat) {
        isbn = is;
        titre = tit;
        auteur = aut;
        editeur = ed;
        dateEdition = dat;
        derNumExemplaire = 0;

        exemplaires = new Hashtable();
} //Fin Constructeur

//**********************************************
// M�thodes d'Acces aux attributs de la classe
//**********************************************
public  String isbn() {return isbn;}

public String titre() {return titre;}

public String auteur() {return auteur;}

public String editeur() {return editeur;}

public GregorianCalendar dateEdition() {return dateEdition;}

public Exemplaire unExemplaire(int numero) {
       return (Exemplaire) exemplaires.get(new Integer(numero));
} // Fin unExemplaire

public Enumeration enumExemplaires() {return exemplaires.elements();}

public int nbExemplaires() {return exemplaires.size();}

//**********************************************
//   Methodes de traitement
//**********************************************
public void ajouterExemplaire(GregorianCalendar dateReception) {
    // Generation du numero chronologique de l'exemplaire
    int numero = this.genererNumeroExemplaire();
    // Creation de l'exemplaire
    Exemplaire exempl = new Exemplaire(numero, dateReception, this);
    // liaison de l'ouvrage a l'exemplaire
    this.lierExemplaire(exempl, numero);
} // Fin ajouterExemplaire

//**********************************************
//   Pr�dicats / Invariants
//**********************************************
public boolean verifDate(GregorianCalendar dateRecep) {
        return (dateRecep.after(dateEdition));
}

// ***********************************
//   M�thodes priv�es
// ***********************************
private int genererNumeroExemplaire() {
    derNumExemplaire = this.derNumExemplaire + 1;
    return derNumExemplaire;
} // Fin genererNumeroExemplaire

private void lierExemplaire(Exemplaire exp, int numero) {
    exemplaires.put(new Integer(numero), exp);
} // Fin lierExemplaire

}  // Fin Classe Ouvrage
