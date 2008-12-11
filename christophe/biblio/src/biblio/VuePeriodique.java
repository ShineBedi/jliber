
package biblio;

import java.util.*;

public class VuePeriodique
       implements Observer        // pour MVC
{
//*************************
//     Attributs
//*************************
 private Periodique perio;

//*************************
//     Constructeur
//*************************
 public VuePeriodique (Periodique per) {
   // Liaison � l'objet Exemplaire
   this.lierPeriodique(per);

   // pour MVC :: la vue s'ajoute comme observateur de l'objet emprunt
   per.addObserver(this);

   this.afficherTout();
 } // Fin Constructeur

// ********************************
//      M�thodes publiques
// ********************************
 public void update(Observable obs, Object o) {
   // maj de la vue
   this.afficherTout();
 }  // Fin upDate

 //******************************
 public void elimineObserveur() {
   perio.deleteObserver(this);
 } // Fin elimineObserveur

// ********************************
//       M�thodes priv�es
// ********************************
 private void afficherTout()  {

   System.out.println();
   System.out.println("                 --------------------------------- ");
   System.out.println("                 -          PERIODIQUE           - ");
   System.out.println("                 --------------------------------- ");
   System.out.println("                 Periodique :                     ");
   System.out.println("                    - ISSN = " + perio.issn());
   System.out.println("                    - Nom = " + perio.nom());
   System.out.println("                 --------------------------------- ");

} // Fin afficherTout

private void lierPeriodique(Periodique per) {
      perio = per;
} // Fin lierPeriodique

} // Fin Classe VuePeriodique
