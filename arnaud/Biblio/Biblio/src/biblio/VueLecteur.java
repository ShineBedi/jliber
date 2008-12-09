
package biblio;

import java.util.*;

public class VueLecteur
  implements Observer        // pour MVC
{
//*************************
//     Attributs
//*************************
 private Lecteur lect;

//*************************
//     Constructeur
//*************************
 public VueLecteur (Lecteur lect) {
   // Liaison � l'objet Lecteur
   this.lierLecteur(lect);

   // pour MVC :: la vue s'ajoute comme observateur de l'objet lect
   lect.addObserver(this);

   this.afficherTout();
 } // Fin Constructeur

// ********************************
//      M�thodes publiques
// ********************************
 public void update(Observable obs, Object o) {
   // maj de la vue
   this.afficherTout();
 }  // Fin upDate

 //********************************
 public void elimineObserveur() {
   lect.deleteObserver(this);
 } // Fin elimineObserveur

 // *******************************
//       M�thodes priv�es
// ********************************
 private void afficherTout()  {
   System.out.println();
   System.out.println("                 --------------------------------- ");
   System.out.println("                 -            LECTEUR            - ");
   System.out.println("                 --------------------------------- ");
   System.out.println("                 - Numero  = " + lect.numero() );
   System.out.println("                 - Nom  = " + lect.nom() );
   System.out.println("                 - Libell�  = " + lect.prenom() );
   System.out.println("                 - Adresse = " + lect.adresse() );
   System.out.println("                 - Age = " + lect.age());
   System.out.println("                 --------------------------------- ");
} // Fin afficherTout

//**********************************
private void lierLecteur(Lecteur lec) {
      lect = lec;
} // Fin lierLecteur

} // Fin Classe VueLecteur
