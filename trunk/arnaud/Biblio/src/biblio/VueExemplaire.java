
package biblio;

import java.util.*;

public class VueExemplaire
       implements Observer        // pour MVC
{
//*************************
//     Attributs
//*************************
 private Exemplaire exemp;

//*************************
//     Constructeur
//*************************
 public VueExemplaire (Exemplaire ex) {
   // Liaison � l'objet Exemplaire
   this.lierExemplaire(ex);

   // pour MVC :: la vue s'ajoute comme observateur de l'objet emprunt
   exemp.addObserver(this);

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
   exemp.deleteObserver(this);
 } // Fin elimineObserveur

// ********************************
//       M�thodes priv�es
// ********************************
 private void afficherTout()  {

   System.out.println();
   System.out.println("                 --------------------------------- ");
   System.out.println("                 -          EXEMPLAIRE           - ");
   System.out.println("                 --------------------------------- ");
   System.out.println("                 Exemplaire :                     ");
   System.out.println("                    - ISBN = " + exemp.tonOuvrage().isbn());
   System.out.println("                    - Numero = " + exemp.numero());
   System.out.println("                    - Etat = " );
   System.out.println("                        " + exemp.libStatut() + "  ");
   System.out.println("                 --------------------------------- ");

} // Fin afficherTout

private void lierExemplaire(Exemplaire ex) {
      exemp = ex;
} // Fin lierExemplaire

} // Fin Classe VueExemplaire
