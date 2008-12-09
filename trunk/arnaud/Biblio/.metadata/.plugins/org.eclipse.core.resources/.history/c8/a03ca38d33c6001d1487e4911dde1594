
package biblio;

import java.util.*;

public class MenuBiblio {

// **************************
//       Attributs
// **************************
private Bibliotheque bibliotheque;

// ***************************
//     Constructeur
// ***************************
public MenuBiblio(Bibliotheque bib) {
        bibliotheque = bib;
} // Fin Constructeur

// ***************************
//    M�thodes publiques
// ***************************
public void menuLecteur() {
        int choix;
        do {
            System.out.println();
            System.out.println("      ******************************************");
            System.out.println("      *        Op�rations sur les LECTEURS     *");
            System.out.println("      ******************************************");
            System.out.println("      * 1- Ajouter un lecteur                  *");
            System.out.println("      * 2- Consulter un lecteur                *");
            System.out.println("      *                                        *");
            System.out.println("      * 0- Retour au menu principal            *");
            System.out.println("      ******************************************");
            System.out.println();
            System.out.print("      Votre Choix : ");
            choix = IO.lireEntier();

            switch (choix) {
            case 1: {
                CtrNouvLecteur ctrNvLect = new CtrNouvLecteur(bibliotheque);
                ctrNvLect= null;   // suppression du controleur
                break;
            }
            case 2: {
                CtrConsLecteur ctrConsLect = new CtrConsLecteur(bibliotheque);
                ctrConsLect= null;   // suppression du controleur
                break;
            }


            default:
                break;
            } // switch
            System.out.println();
        } while (choix != 0);
  } // Fin menuLecteur

  public void menuOuvrage() {
        int choix;
        do {
            System.out.println();
            System.out.println("      *****************************************");
            System.out.println("      *     Op�rations sur les OUVRAGES       *");
            System.out.println("      *****************************************");
            System.out.println("      * 1- Ajouter un ouvrage                 *");
            System.out.println("      * 2- Ajouter un exemplaire              *");
            System.out.println("      * 3- Rendre un exemplaire empruntable   *");
            System.out.println("      * 4- Rendre un exemplaire consultable   *");
            System.out.println("      * 5- Rendre un exemplaire non disponible*");
            System.out.println("      * 6- Consulter un ouvrage               *");
            System.out.println("      *                                       *");
            System.out.println("      * 0- Retour au menu principal           *");
            System.out.println("      ****************************************");
            System.out.println();
            System.out.print("      Votre Choix : ");
            choix = IO.lireEntier();

            switch (choix) {
            case 1: {
                CtrNouvOuvrage ctrNvOuv = new CtrNouvOuvrage(bibliotheque);
                ctrNvOuv = null;   // suppression du controleur
                 break;
            }
            case 2: {
                CtrNouvExemplaire ctrNvExemp = new CtrNouvExemplaire(bibliotheque);
                ctrNvExemp = null;   // suppression du controleur
                break;
            }
            case 3: {
                CtrRendreExEmpruntable ctrEx = new CtrRendreExEmpruntable(bibliotheque);
                ctrEx = null;   // suppression du controleur
                break;
            }
            case 4: {
                CtrRendreExConsultable ctrEx = new CtrRendreExConsultable(bibliotheque);
                ctrEx = null;   // suppression du controleur
                break;
            }
            case 5: {
                CtrRendreExNonDispo ctrEx = new CtrRendreExNonDispo(bibliotheque);
                ctrEx = null;   // suppression du controleur
                break;
            }

            case 6: {
                CtrConsOuvrage ctrConsOuv = new CtrConsOuvrage(bibliotheque);
                ctrConsOuv = null;   // suppression du controleur
                break;
            }

           default:
                break;
            } // switch
            System.out.println();
        } while (choix != 0);
  } // Fin menuOuvrage


//*************************************
      public void menuPrincipal() {
          int choix;
          GregorianCalendar datejour = new GregorianCalendar();

          do {
              System.out.println();
              System.out.println("      **************************************");
              System.out.print("             On est le " +
                               IO.ecrireDate(datejour));
              System.out.println();
              System.out.println("      **************************************");
              System.out.println("      *          BIBLIOTHEQUE IUT          *");
              System.out.println("      **************************************");
              System.out.println("      * 1- Operations sur les LECTEURS     *");
              System.out.println("      * 2- Operations sur les OUVRAGES     *");
              System.out.println("      *                                    *");
              System.out.println("      * 0- Quitter                         *");
              System.out.println("      **************************************");
              System.out.println();
              System.out.print("      Votre Choix : ");
              choix = IO.lireEntier();

              switch (choix) {
              case 1: {
                  this.menuLecteur();
                  break;
              }
              case 2: {
                  this.menuOuvrage();
                  break;
              }
              default:
                  break;
              } // switch
              System.out.println();
          } while (choix != 0);
} // Fin menuPrincipal

} // Fin Classe MenuBiblio
