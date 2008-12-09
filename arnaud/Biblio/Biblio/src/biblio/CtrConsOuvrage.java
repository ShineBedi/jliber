
package biblio;

import java.util.*;

public class CtrConsOuvrage {

// *************************
//        Attributs
// *************************
private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
public CtrConsOuvrage(Bibliotheque bib) {

    // Liaison � l'appli "Bibliotheque"
    this.lierBibliotheque(bib);

    System.out.println();
    System.out.print("Consultation d'un ouvrage");

    System.out.println();
    System.out.print("Numero ISBN :");
    String isbn = IO.lireChaine();

    // V�rification l'existence du lecteur
    Ouvrage ouv = biblio.unOuvrage(isbn);
    if (ouv != null) {
        // Cr�ation de la vue
        VueOuvrage vOuv = new VueOuvrage(ouv);

        // Suppression de la vue vLect comme Observatrice de l'objet lect
        vOuv.elimineObserveur();
        vOuv = null;
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

} // Fin Classe CtrConsOuvrage
