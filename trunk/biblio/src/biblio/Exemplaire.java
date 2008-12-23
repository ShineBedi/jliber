
package biblio;

import java.io.*;
import java.util.*;

public class Exemplaire
        extends Observable            // pour MVC
        implements Serializable {

//**************************
//        Attributs
//**************************
    final static int empruntable = 0, enConsultation = 1, nonDisponible = 2, emprunte = 3;


    private int numero;
    private int statut;
    private GregorianCalendar dateReception;

    // Attributs d'Association
    private Ouvrage ouvrage;
    private Set<Emprunt> emprunts;

// *************************
//     Constructeur
// *************************
public Exemplaire(int num,GregorianCalendar dateR, Ouvrage ouv) {
    numero = num; dateReception = dateR; statut = nonDisponible;
    this.lierOuvrage(ouv);
    emprunts = new HashSet<Emprunt>();
} // Fin Constructeur

//**********************************************
// Methodes d'acces aux attributs de la classe
//**********************************************

public Ouvrage tonOuvrage() {return ouvrage ;}

public  int numero() {return numero;}

public GregorianCalendar dateReception() {return dateReception;}

public int statut() {return statut;}



//*****************************
//     Prédicats d'Etat
//*****************************

public boolean estEmpruntable(){return (statut == empruntable);}

public boolean estNonDisponible(){return (statut == nonDisponible);}

public boolean estEnConsultation(){return (statut == enConsultation);}

public boolean estEmprunte(){return(statut == emprunte);}



// Pour les affichages
public String libStatut() {
    if (statut == nonDisponible ) return "non disponible";
    else if (statut == empruntable)  return "empruntable";
    else if (statut == enConsultation) return "en consultation";
    else if (statut == emprunte) return "emprunté";
    else return "erreur dans le statut de l'exemplaire";
}  // Fin libStatut



//**********************************
//     Méthodes de Traitement
//**********************************

  public void modifierStatut(int s) {
    statut =s;

} // Fin modifier statut


// ***************************
//     Méthodes privées
// ***************************
private void lierOuvrage(Ouvrage ouv){
    ouvrage = ouv;
} // Fin lierOuvrage

public Set<Emprunt> tesEmprunts() {
    return emprunts;
}

public void lierEmprunt(Emprunt emp) {
    emprunts.add(emp);
}


} // Fin Classe Exemplaire
