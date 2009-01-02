
package biblio;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Lecteur
        extends Observable          // pour MVC
        implements Serializable {

//**************************
//      Constantes
//**************************
    static int maxEmprunt = 5 ;  // max d'emprunts autorisé / lecteur

// **************************
//      Attributs
// **************************
    private int numero;
    private String nom;
    private String prenom;
    private String adresse;
    private int age;

    //  Attributs d'Association
    private Set<Emprunt> emprunts;

// ***************************
//     Constructeur
// ***************************
public Lecteur(int num, String no, String pre,
                   String adr, int ag) {
    numero = num;
    nom = no;
    prenom = pre;
    adresse = adr;
    age = ag;

    emprunts = new HashSet<Emprunt>();
}  // Fin Constructeur

//*****************************
//     Pr�dicats d'Etat
//*****************************
public boolean nonSature() {
    int size =0;
    for(Emprunt emp:emprunts){
        if(emp.dateRetour() == emp.dateEmprunt())
        {
            size++;
        }
    }
    return (size < maxEmprunt);
}
public void supprimerEmprunt(Emprunt emp)
{
   delierEmprunt(emp);
}
private void delierEmprunt ( Emprunt emp )
{
    emprunts.remove(emp);
}
//************************************************
// M�thodes d'Acces aux attributs de la classe
//************************************************
public int numero() {return numero;}

public String nom() {return nom;}

public String prenom() {return prenom;}

public String adresse() {return adresse;}

public int age() {return age;}

public Set<Emprunt> tesEmprunts() {return emprunts;}

public void lierEmprunt(Emprunt emp) {
    emprunts.add(emp);
}
} // Fin Classe Lecteur
