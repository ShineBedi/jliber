
package biblio;

import java.util.*;

public class CtrConsLecteur {

// *************************
//        Attributs
// *************************
private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
public CtrConsLecteur(Bibliotheque bib) {

    // Liaison à l'appli "Bibliotheque"
    this.lierBibliotheque(bib);

    System.out.println();
    System.out.print("Consultation d'un lecteur");

    System.out.println();
    System.out.print("Numero du Lecteur :");
    int numLect = IO.lireEntier();

    // Vérification l'existence du lecteur
    Lecteur lect = biblio.unLecteur(numLect);
    if (lect != null) {
       // Création de la vue
       VueLecteur vLect = new VueLecteur(lect);

       // Suppression de la vue vActC comme Observatrice de l'objet actc
       vLect.elimineObserveur();
       vLect = null;  // suppression de la vue
    }
    else  {
       System.out.println("Lecteur inconnu.");
       System.out.println();
    }

} // Fin Constructeur

// *******************************
//      Méthodes privées
// *******************************
private void lierBibliotheque(Bibliotheque bib) {
      biblio = bib;
} // Fin lierBibliotheque

} // Fin Classe CtrConsLecteur
