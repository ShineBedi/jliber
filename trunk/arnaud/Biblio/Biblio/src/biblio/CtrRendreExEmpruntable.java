package biblio;


public class CtrRendreExEmpruntable {

// *************************
//        Attributs
// *************************
        private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
        public CtrRendreExEmpruntable(Bibliotheque bib) {

            // Liaison � l'appli "Bibliotheque"
            this.lierBibliotheque(bib);

            System.out.println();
            System.out.print("Rendre un exemplaire empruntable");
            System.out.println();

            // V�rification l'existence de l'ouvrage / isbn
            System.out.println();
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
                    if ( exemp.estNonDisponible() )
                    {
                        biblio.modifStatutExemplaire(exemp,exemp.empruntable);
                        // Cr�ation de la vue Exemplaire
                        VueExemplaire vExemp = new VueExemplaire(exemp);

                        // Suppression de la vue vExemp comme Observatrice de l'objet exemp
                        vExemp.elimineObserveur();
                        vExemp = null;
                    }
                    else
                    // l'exemplaire est d�j� empruntable
                    if (exemp.estEmpruntable()) System.out.print("L'exemplaire est d�j� empruntable.");

                    // l'exemplaire est actuellement consultable en biblioth�que
                    else System.out.print("Un exemplaire consultable en biblioth�que ne peut pas devenir directement empruntable.");
                }
            }

          } // Fin Constructeur

// *******************************
//      M�thodes priv�es
// *******************************
          private void lierBibliotheque(Bibliotheque bib) {
              biblio = bib;
          } // Fin lierBibliotheque


} // fin CtrRendreExEmpruntable
