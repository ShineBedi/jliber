package biblio;

import java.util.*;

public class VueOuvrage
       implements Observer        // pour MVC
{
//*************************
//     Attributs
//*************************
 private Ouvrage ouv;

//*************************
//     Constructeur
//*************************
 public VueOuvrage (Ouvrage ou) {
   // Liaison à l'objet Lecteur
   this.lierOuvrage(ou);

   // pour MVC :: la vue s'ajoute comme observateur de l'objet lect
   ouv.addObserver(this);

   this.afficherTout();
 } // Fin Constructeur

// ********************************
//      Méthodes publiques
// ********************************
 public void update(Observable obs, Object o) {
   // maj de la vue
   this.afficherTout();
 }  // Fin upDate

 //********************************
 public void elimineObserveur() {
    ouv.deleteObserver(this);
 } // Fin elimineObserveur

// ********************************
//       Méthodes privées
// ********************************
 private void afficherTout()  {
   System.out.println();
   System.out.println("                 -------------------------------------- ");
   System.out.println("                 -                OUVRAGE             - ");
   System.out.println("                 -------------------------------------- ");
    System.out.println("                 - ISBN  = " + ouv.isbn() );
   System.out.println("                 - Titre  = " + ouv.titre() );
   System.out.println("                 - Auteur  = " + ouv.auteur() );
   System.out.println("                 - Editeur = " + ouv.editeur() );
   System.out.println("                 - Date edition : " + IO.ecrireDate(ouv.dateEdition()));
   System.out.println("                 - Nb d'exemplaires  = " + ouv.nbExemplaires() );
   System.out.println("                 -------------------------------------- ");

   this.afficherListeExemplaires();
} // Fin afficherTout

//*************************************
private void afficherListeExemplaires() {
  Enumeration enumEx = ouv.enumExemplaires();

  if  (enumEx.hasMoreElements()) {

      System.out.println("                 - Exemplaires :                 ");
      while (enumEx.hasMoreElements()) {
          Exemplaire exemp = (Exemplaire) enumEx.nextElement();
      System.out.println("                    * " + exemp.numero()
          + " " + exemp.libStatut() + "  ");
      }
      System.out.println("                 -------------------------------------- ");
  }
} // Fin afficherExemplaires

private void lierOuvrage(Ouvrage ou) {
      ouv = ou;
} // Fin lierOuvrage

} // Fin Classe VueOuvrage
