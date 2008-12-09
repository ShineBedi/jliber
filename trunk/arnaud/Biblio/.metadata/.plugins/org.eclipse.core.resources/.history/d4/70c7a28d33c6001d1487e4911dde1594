
package biblio;

import java.io.*;
import java.util.*;

public class Exemplaire
        extends Observable            // pour MVC
        implements Serializable {

//**************************
//        Attributs
//**************************
    final static int empruntable = 0, enConsultation = 1, nonDisponible = 2;


    private int numero;
    private int statut;
    private GregorianCalendar dateReception;

    // Attributs d'Association
    private Ouvrage ouvrage;

// *************************
//     Constructeur
// *************************
public Exemplaire(int num,GregorianCalendar dateR, Ouvrage ouv) {
    numero = num; dateReception = dateR; statut = nonDisponible;
    this.lierOuvrage(ouv);

} // Fin Constructeur

//**********************************************
// Methodes d'acces aux attributs de la classe
//**********************************************

public Ouvrage tonOuvrage() {return ouvrage ;}

public  int numero() {return numero;}

public GregorianCalendar dateReception() {return dateReception;}

public int statut() {return statut;}



//*****************************
//     Pr�dicats d'Etat
//*****************************

public boolean estEmpruntable(){return (statut == empruntable);}

public boolean estNonDisponible(){return (statut == nonDisponible);}

public boolean estEnConsultation(){return (statut == enConsultation);}



// Pour les affichages
public String libStatut() {
    if (statut == nonDisponible ) return "non disponible";
    else if (statut == empruntable)  return "empruntable";
    else if (statut == enConsultation) return "en consultation";
    else return "erreur dans le statut de l'exemplaire";
}  // Fin libStatut



//**********************************
//     M�thodes de Traitement
//**********************************

  public void modifierStatut(int s) {
    statut =s;

} // Fin modifier statut


// ***************************
//     M�thodes priv�es
// ***************************
private void lierOuvrage(Ouvrage ouv){
    ouvrage = ouv;
} // Fin lierOuvrage


} // Fin Classe Exemplaire
