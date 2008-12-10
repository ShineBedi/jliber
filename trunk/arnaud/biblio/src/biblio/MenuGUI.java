/*
 * MenuGUI.java
 *
 * Created on 10 décembre 2008, 10:09
 */

package biblio;

/**
 *
 * @author  mailleta
 */
public class MenuGUI extends javax.swing.JFrame {
    
    /** Creates new form MenuGUI */
    public MenuGUI() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        fichier_menu = new javax.swing.JMenu();
        quitter_fichier_button = new javax.swing.JMenuItem();
        lecteur_menu = new javax.swing.JMenu();
        consulter_lecteur_button = new javax.swing.JMenuItem();
        nouveau_lecteur_button = new javax.swing.JMenuItem();
        ouvrage_menu = new javax.swing.JMenu();
        nouvel_ouvrage_button = new javax.swing.JMenuItem();
        consulter_ouvrage_button = new javax.swing.JMenuItem();
        exemplaire_menu = new javax.swing.JMenu();
        nouvel_exemplaire_button = new javax.swing.JMenuItem();
        statut_menu = new javax.swing.JMenu();
        rendre_indisponible_button = new javax.swing.JMenuItem();
        rendre_consultable_button = new javax.swing.JMenuItem();
        rendre_empruntable_button = new javax.swing.JMenuItem();
        emprunt_exemplaire_button = new javax.swing.JMenuItem();
        retour_exemplaire_button = new javax.swing.JMenuItem();
        periodique_menu = new javax.swing.JMenu();
        nouveau_periodique_button = new javax.swing.JMenuItem();
        consulter_periodique_button = new javax.swing.JMenuItem();
        parution_menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        recherche_menu = new javax.swing.JMenu();
        recherche_par_auteur_button = new javax.swing.JMenuItem();
        recherche_par_motcle_button = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fichier_menu.setText("Fichier");

        quitter_fichier_button.setText("Quitter");
        fichier_menu.add(quitter_fichier_button);

        jMenuBar1.add(fichier_menu);

        lecteur_menu.setText("Lecteur");

        consulter_lecteur_button.setText("Consulter");
        lecteur_menu.add(consulter_lecteur_button);

        nouveau_lecteur_button.setText("Nouveau");
        lecteur_menu.add(nouveau_lecteur_button);

        jMenuBar1.add(lecteur_menu);

        ouvrage_menu.setText("Ouvrage");

        nouvel_ouvrage_button.setText("Nouvel");
        ouvrage_menu.add(nouvel_ouvrage_button);

        consulter_ouvrage_button.setText("Consulter");
        ouvrage_menu.add(consulter_ouvrage_button);

        exemplaire_menu.setText("Exemplaire");

        nouvel_exemplaire_button.setText("Nouvel");
        exemplaire_menu.add(nouvel_exemplaire_button);

        statut_menu.setText("Statut");

        rendre_indisponible_button.setText("Rendre indisponible");
        statut_menu.add(rendre_indisponible_button);

        rendre_consultable_button.setText("Rendre consultable");
        statut_menu.add(rendre_consultable_button);

        rendre_empruntable_button.setText("Rendre empruntable");
        statut_menu.add(rendre_empruntable_button);

        exemplaire_menu.add(statut_menu);

        emprunt_exemplaire_button.setText("Emprunt");
        exemplaire_menu.add(emprunt_exemplaire_button);

        retour_exemplaire_button.setText("Retour");
        exemplaire_menu.add(retour_exemplaire_button);

        ouvrage_menu.add(exemplaire_menu);

        jMenuBar1.add(ouvrage_menu);

        periodique_menu.setText("Periodique");

        nouveau_periodique_button.setText("Nouveau");
        periodique_menu.add(nouveau_periodique_button);

        consulter_periodique_button.setText("Consulter");
        periodique_menu.add(consulter_periodique_button);

        parution_menu.setText("Parution");

        jMenuItem1.setText("Nouvelle");
        parution_menu.add(jMenuItem1);

        periodique_menu.add(parution_menu);

        jMenuBar1.add(periodique_menu);

        recherche_menu.setText("Recherche");

        recherche_par_auteur_button.setText("Par auteur");
        recherche_menu.add(recherche_par_auteur_button);

        recherche_par_motcle_button.setText("Par mot-clé");
        recherche_menu.add(recherche_par_motcle_button);

        jMenuBar1.add(recherche_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consulter_lecteur_button;
    private javax.swing.JMenuItem consulter_ouvrage_button;
    private javax.swing.JMenuItem consulter_periodique_button;
    private javax.swing.JMenuItem emprunt_exemplaire_button;
    private javax.swing.JMenu exemplaire_menu;
    private javax.swing.JMenu fichier_menu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu lecteur_menu;
    private javax.swing.JMenuItem nouveau_lecteur_button;
    private javax.swing.JMenuItem nouveau_periodique_button;
    private javax.swing.JMenuItem nouvel_exemplaire_button;
    private javax.swing.JMenuItem nouvel_ouvrage_button;
    private javax.swing.JMenu ouvrage_menu;
    private javax.swing.JMenu parution_menu;
    private javax.swing.JMenu periodique_menu;
    private javax.swing.JMenuItem quitter_fichier_button;
    private javax.swing.JMenu recherche_menu;
    private javax.swing.JMenuItem recherche_par_auteur_button;
    private javax.swing.JMenuItem recherche_par_motcle_button;
    private javax.swing.JMenuItem rendre_consultable_button;
    private javax.swing.JMenuItem rendre_empruntable_button;
    private javax.swing.JMenuItem rendre_indisponible_button;
    private javax.swing.JMenuItem retour_exemplaire_button;
    private javax.swing.JMenu statut_menu;
    // End of variables declaration//GEN-END:variables
    
}
