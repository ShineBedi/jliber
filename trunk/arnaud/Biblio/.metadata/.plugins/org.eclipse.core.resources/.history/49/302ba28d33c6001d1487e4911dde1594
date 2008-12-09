
package biblio;

import java.util.*;

public class CtrNouvLecteur {

// *************************
//        Attributs
// *************************
private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
public CtrNouvLecteur(Bibliotheque bib) {

    // Liaison � l'appli "Bibliotheque"
    this.lierBibliotheque(bib);

    System.out.println();
    System.out.print("Ajout d'un lecteur");
    System.out.println();

    System.out.print("Nom : ");
    String nom = IO.lireChaine();

    System.out.print("Prenom :");
    String prenom = IO.lireChaine();

    System.out.print("Adresse :");
    String adresse = IO.lireChaine();

    System.out.print("Age :");
    int age = IO.lireEntier();

      // Demande d'ajout d'un nouveau lecteur
      Lecteur lect = biblio.nouveauLecteur(nom,prenom,adresse,age);

      // Cr�ation de la vue
      VueLecteur vLect = new VueLecteur(lect);

      // Suppression de la vue vLect comme Observatrice de l'objet lect
      vLect.elimineObserveur();
      vLect = null;  // suppression de la vue
} // Fin Constructeur

// *******************************
//      M�thodes priv�es
// *******************************
private void lierBibliotheque(Bibliotheque bib) {
      biblio = bib;
} // Fin lierBibliotheque

} // Fin Classe CtrNouvLecteur
