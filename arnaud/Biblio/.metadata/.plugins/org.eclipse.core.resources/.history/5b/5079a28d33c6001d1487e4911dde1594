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

        // Liaison � l'appli "Bibliotheque"
        this.lierBibliotheque(bib);

        System.out.println();
        System.out.print("Rendre un exemplaire consultable � la biblioth�que");
        System.out.println();

        System.out.println();

         // V�rification l'existence de l'ouvrage / isbn
        System.out.print("Numero ISBN :");
        String isbn = IO.lireChaine();

        Ouvrage ouv = biblio.unOuvrage(isbn);
        if (ouv != null) {

                // V�rification l'existence de l'exemplaire / num�ro
                System.out.print("Num�ro d'exemplaire : ");
                int numero = IO.lireEntier();
                Exemplaire exemp = ouv.unExemplaire(numero);
                if (exemp != null) {

                        // l'exemplaire est actuellement non disponible
                        if (exemp.estNonDisponible())
                        {
                            biblio.modifStatutExemplaire(exemp,exemp.enConsultation);

                            // Cr�ation de la vue Exemplaire
                            VueExemplaire vExemp = new VueExemplaire(exemp);

                            // Suppression de la vue vExemp comme Observatrice de l'objet exemp
                            vExemp.elimineObserveur();
                            vExemp = null;
                        }
                        else
                        // l'exemplaire est d�j� en conseltable en biblioth�que
                        if (exemp.estEnConsultation()) System.out.print("L'exemplaire est d�j� en consultation.");

                        // l'exemplaire est actuellement empruntable
                        else System.out.print("Un exemplaire empruntable ne peut pas devenir directement consultable en biblioth�que.");
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
