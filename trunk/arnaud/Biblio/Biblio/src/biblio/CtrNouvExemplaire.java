
package biblio;

import java.util.*;

public class CtrNouvExemplaire {

// *************************
//        Attributs
// *************************
private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
public CtrNouvExemplaire(Bibliotheque bib) {

    // Liaison � l'appli "Bibliotheque"
    this.lierBibliotheque(bib);

    System.out.println();
    System.out.print("Ajout d'un exemplaire");
    System.out.println();

    System.out.println();
    System.out.print("Numero ISBN :");
    String isbn = IO.lireChaine();

    // V�rification l'existence de l'ouvrage / ISBN
    Ouvrage ouv = biblio.unOuvrage(isbn);
    if (ouv != null) {
        System.out.print("Date de reception : ");
        GregorianCalendar dateRecep = IO.lireDate();

        // Invariant : date r�ception de l'exempl. > date �dition de l'ouvrage
        if (ouv.verifDate(dateRecep)) {



            // Demande d'ajout de l'exemplaire
            biblio.nouvelExemplaire(ouv,dateRecep);



            // Cr�ation de la vue
            VueOuvrage vOuv = new VueOuvrage(ouv);

            // Suppression de la vue vLect comme Observatrice de l'objet lect
            vOuv.elimineObserveur();
            vOuv = null;
        }
        else  {
            System.out.println();
            System.out.println("Date de Reception incorrecte / � la date d'Edition.");
        }
    }
    else  {
       System.out.println("Ouvrage inconnu.");
       System.out.println();
    }
  } // Fin Constructeur

// *******************************
//      M�thodes priv�es
// *******************************
  private void lierBibliotheque(Bibliotheque bib) {
      biblio = bib;
  } // Fin lierBibliotheque

} // Fin Classe CtrNouvExemplaire
