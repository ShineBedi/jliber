package biblio;

import java.io.*;
//import java.lang.*;
import java.util.*;
/**
 *
 * @author vargasch ardaudg
 */
public class Periodique
        extends Observable        // pour MVC
        implements Serializable{

// *************************
//        Attributs
// *************************
  private String issn ;
  private String nom  ;
  private Hashtable parutions;

// ***********************************
//          Constructeur
// ***********************************
  public Periodique( String issn , String nom ){
    this.nom = nom ;
    this.issn = issn ;

    this.parutions = new Hashtable();
}
//Fin constructeur



//**********************************************
// Méthodes d'Acces aux attributs de la classe
//**********************************************
  public String issn() {return issn ;}
  public String nom(){return nom ;}

  public Parution uneParution(String idParution) {
       return (Parution) parutions.get(idParution);
} // Fin uneParution*

public Enumeration enumParutions() {return parutions.elements();}

public int nbParutions() {return parutions.size();}

//**********************************************
//   Methodes de traitement
//**********************************************
/*
  public void ajouterParution(int numeroParution) {
    // Creation de la parution
    Parution paru = new Parution(numeroParution, this);
    // liaison de la parution au périodique
    this.lierParution(paru, numeroParution);
} // Fin ajouterParution
*/

//**********************************************
//   Prédicats / Invariants
//**********************************************

// ***********************************
//   Méthodes privées
// ***********************************
 public Parution nouvParution(String numpar, Periodique per){
     Parution paru = new Parution(numpar, per);
     this.lierParution(paru, numpar);
     return paru;
 }

 private void lierParution(Parution paru, String idParution) {
    parutions.put(idParution, paru);
} 

}  // Fin Classe Periodique
