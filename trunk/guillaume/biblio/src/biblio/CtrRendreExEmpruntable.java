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

            // Liaison  à l'appli "Bibliotheque"
            this.lierBibliotheque(bib);

            System.out.println();
            System.out.print("Rendre un exemplaire empruntable");
            System.out.println();

            // Vérification l'existence de l'ouvrage / isbn
            System.out.println();
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
                    if ( exemp.estNonDisponible() )
                    {
                        biblio.modifStatutExemplaire(exemp,exemp.empruntable);
                        // Création de la vue Exemplaire
                        VueExemplaire vExemp = new VueExemplaire(exemp);

                        // Suppression de la vue vExemp comme Observatrice de l'objet exemp
                        vExemp.elimineObserveur();
                        vExemp = null;
                    }
                    else
                    // l'exemplaire est déjà empruntable
                    if (exemp.estEmpruntable()) System.out.print("L'exemplaire est déjà empruntable.");

                    // l'exemplaire est actuellement consultable en bibliothéque
                    else System.out.print("Un exemplaire consultable en bibliothèque ne peut pas devenir directement empruntable.");
                }
            }

          } // Fin Constructeur

// *******************************
//      Méthodes privées
// *******************************
          private void lierBibliotheque(Bibliotheque bib) {
              biblio = bib;
          } // Fin lierBibliotheque


} // fin CtrRendreExEmpruntable
