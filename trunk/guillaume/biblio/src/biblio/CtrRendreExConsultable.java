package biblio;

public class CtrRendreExConsultable {


// *************************
//        Attributs
// *************************
private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
public CtrRendreExConsultable(Bibliotheque bib) {

        // Liaison à l'appli "Bibliotheque"
        this.lierBibliotheque(bib);

        System.out.println();
        System.out.print("Rendre un exemplaire consultable à la bibliothèque");
        System.out.println();

        System.out.println();

         // Vérification l'existence de l'ouvrage / isbn
        System.out.print("Numero ISBN :");
        String isbn = IO.lireChaine();

        Ouvrage ouv = biblio.unOuvrage(isbn);
        if (ouv != null) {

                // Vérification l'existence de l'exemplaire / numéro
                System.out.print("Numéro d'exemplaire : ");
                int numero = IO.lireEntier();
                Exemplaire exemp = ouv.unExemplaire(numero);
                if (exemp != null) {

                        // l'exemplaire est actuellement non disponible
                        if (exemp.estNonDisponible())
                        {
                            biblio.modifStatutExemplaire(exemp,exemp.enConsultation);

                            // Création de la vue Exemplaire
                            VueExemplaire vExemp = new VueExemplaire(exemp);

                            // Suppression de la vue vExemp comme Observatrice de l'objet exemp
                            vExemp.elimineObserveur();
                            vExemp = null;
                        }
                        else
                        // l'exemplaire est déjà en conseltable en bibliothèque
                        if (exemp.estEnConsultation()) System.out.print("L'exemplaire est déjà en consultation.");

                        // l'exemplaire est actuellement empruntable
                        else System.out.print("Un exemplaire empruntable ne peut pas devenir directement consultable en bibliothéque.");
                }
          }

  } // Fin Constructeur

// *******************************
//      M�thodes priv�es
// *******************************
private void lierBibliotheque(Bibliotheque bib) {
    biblio = bib;
} // Fin lierBibliotheque


} // fin CtrRendreExConsultable
