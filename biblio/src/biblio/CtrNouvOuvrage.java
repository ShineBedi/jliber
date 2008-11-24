
package biblio;

import java.util.*;

public class CtrNouvOuvrage {

// *************************
//        Attributs
// *************************
private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
public CtrNouvOuvrage(Bibliotheque bib) {

    // Liaison à l'appli "Bibliotheque"
    this.lierBibliotheque(bib);

    System.out.println();
    System.out.print("Ajout d'un ouvrage");
    System.out.println();

    System.out.println();
    System.out.print("Numero ISBN :");
    String isbn = IO.lireChaine();

    // Vérification la non existence de l'ouvrage / ISBN
    Ouvrage ouv = biblio.unOuvrage(isbn);
    if (ouv == null) {
       // Saisie de toutes les infos de l'ouvrage
       System.out.print("Titre    : ");
       String tit = IO.lireChaine();
       System.out.print("Auteur   : ");
       String aut = IO.lireChaine();
       System.out.print("Editeur  : ");
       String ed = IO.lireChaine();
       System.out.print("Date d'edition : ");
       GregorianCalendar dateEd = IO.lireDate();

       // Demande d'ajout d'un nouvel ouvrage
       ouv = biblio.nouvelOuvrage(isbn, tit, aut, ed, dateEd);

       // Création de la vue
       VueOuvrage vOuv = new VueOuvrage(ouv);

       // Suppression de la vue vLect comme Observatrice de l'objet lect
       vOuv.elimineObserveur();
       vOuv = null;
    }
    else  {
       System.out.println("Ouvrage deja existant.");
       System.out.println();
    }
  } // Fin Constructeur

// *******************************
//      Méthodes privées
// *******************************
  private void lierBibliotheque(Bibliotheque bib) {
      biblio = bib;
  } // Fin lierBibliotheque

} // Fin Classe CtrNouvOuvrage
