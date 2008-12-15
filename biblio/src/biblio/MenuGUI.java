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
    
    private Bibliotheque bibliotheque;
    
    /** Creates new form MenuGUI */
    public MenuGUI() {
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Impossible de charger le theme");
         
        }
    }
    
    public void menuPrincipal(Bibliotheque bib) {
        bibliotheque = bib;
        this.setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    fichier_menu = new javax.swing.JMenu();
    quitter_fichier_button = new javax.swing.JMenuItem();
    lecteur_menu = new javax.swing.JMenu();
    nouveau_lecteur_button = new javax.swing.JMenuItem();
    consulter_lecteur_button = new javax.swing.JMenuItem();
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
    nouvelle_parution_button = new javax.swing.JMenuItem();
    recherche_menu = new javax.swing.JMenu();
    recherche_par_auteur_button = new javax.swing.JMenuItem();
    recherche_par_motcle_button = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(244, 236, 236));
    setResizable(false);

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/biblio.png"))); // NOI18N

    fichier_menu.setText("Fichier");

    quitter_fichier_button.setText("Quitter");
    quitter_fichier_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        quitter_fichier_buttonMousePressed(evt);
      }
    });
    fichier_menu.add(quitter_fichier_button);

    jMenuBar1.add(fichier_menu);

    lecteur_menu.setText("Lecteur");

    nouveau_lecteur_button.setText("Nouveau");
    nouveau_lecteur_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        nouveau_lecteur_buttonMousePressed(evt);
      }
    });
    lecteur_menu.add(nouveau_lecteur_button);

    consulter_lecteur_button.setText("Consulter");
    consulter_lecteur_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        consulter_lecteur_buttonMousePressed(evt);
      }
    });
    lecteur_menu.add(consulter_lecteur_button);

    jMenuBar1.add(lecteur_menu);

    ouvrage_menu.setText("Ouvrage");

    nouvel_ouvrage_button.setText("Nouvel");
    nouvel_ouvrage_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        nouvel_ouvrage_buttonMousePressed(evt);
      }
    });
    ouvrage_menu.add(nouvel_ouvrage_button);

    consulter_ouvrage_button.setText("Consulter");
    consulter_ouvrage_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        consulter_ouvrage_buttonMousePressed(evt);
      }
    });
    ouvrage_menu.add(consulter_ouvrage_button);

    exemplaire_menu.setText("Exemplaire");

    nouvel_exemplaire_button.setText("Nouvel");
    nouvel_exemplaire_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        nouvel_exemplaire_buttonMousePressed(evt);
      }
    });
    exemplaire_menu.add(nouvel_exemplaire_button);

    statut_menu.setText("Statut");

    rendre_indisponible_button.setText("Rendre indisponible");
    rendre_indisponible_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        rendre_indisponible_buttonMousePressed(evt);
      }
    });
    statut_menu.add(rendre_indisponible_button);

    rendre_consultable_button.setText("Rendre consultable");
    rendre_consultable_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        rendre_consultable_buttonMousePressed(evt);
      }
    });
    statut_menu.add(rendre_consultable_button);

    rendre_empruntable_button.setText("Rendre empruntable");
    rendre_empruntable_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        rendre_empruntable_buttonMousePressed(evt);
      }
    });
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
    nouveau_periodique_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        nouveau_periodique_buttonMousePressed(evt);
      }
    });
    periodique_menu.add(nouveau_periodique_button);

    consulter_periodique_button.setText("Consulter");
    periodique_menu.add(consulter_periodique_button);

    parution_menu.setText("Parution");

    nouvelle_parution_button.setText("Nouvelle");
    nouvelle_parution_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        nouvelle_parution_buttonMousePressed(evt);
      }
    });
    parution_menu.add(nouvelle_parution_button);

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
      .addComponent(jLabel2)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel2)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void nouveau_lecteur_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouveau_lecteur_buttonMousePressed
        // TODO add your handling code here:
         CtrNouvLecteurGUI ctrNvLectGUI = new CtrNouvLecteurGUI(this, true);
         ctrNvLectGUI.menuPrincipal(bibliotheque);
         ctrNvLectGUI = null;   // suppression du controleur
    }//GEN-LAST:event_nouveau_lecteur_buttonMousePressed

    private void consulter_lecteur_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulter_lecteur_buttonMousePressed
        // TODO add your handling code here:
         CtrConsLecteurGUI ctrConsLectGUI = new CtrConsLecteurGUI(this, true);
         ctrConsLectGUI.menuPrincipal(bibliotheque);
         ctrConsLectGUI = null;   // suppression du controleur
    }//GEN-LAST:event_consulter_lecteur_buttonMousePressed

    private void quitter_fichier_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitter_fichier_buttonMousePressed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_quitter_fichier_buttonMousePressed

    private void nouvel_ouvrage_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouvel_ouvrage_buttonMousePressed
        // TODO add your handling code here:
         CtrNouvOuvrageGUI ctrNouvOuvGUI = new CtrNouvOuvrageGUI(this, true);
         ctrNouvOuvGUI.menuPrincipal(bibliotheque);
         ctrNouvOuvGUI = null;   // suppression du controleur
    }//GEN-LAST:event_nouvel_ouvrage_buttonMousePressed

    private void consulter_ouvrage_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulter_ouvrage_buttonMousePressed
        // TODO add your handling code here:
        CtrConsOuvrageGUI ctrConsOuvGUI = new CtrConsOuvrageGUI(this, true);
        ctrConsOuvGUI.menuPrincipal(bibliotheque);
        ctrConsOuvGUI = null;   // suppression du controleur
    }//GEN-LAST:event_consulter_ouvrage_buttonMousePressed

    private void nouvel_exemplaire_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouvel_exemplaire_buttonMousePressed
        // TODO add your handling code here:
        CtrNouvExemplaireGUI ctrNouvExempGUI = new CtrNouvExemplaireGUI(this, true);
        ctrNouvExempGUI.menuPrincipal(bibliotheque);
        ctrNouvExempGUI = null;   // suppression du controleur
    }//GEN-LAST:event_nouvel_exemplaire_buttonMousePressed

    private void rendre_consultable_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendre_consultable_buttonMousePressed
        // TODO add your handling code here:
        CtrRendreExConsultableGUI ctrRendreExConsGUI = new CtrRendreExConsultableGUI(this, true);
        ctrRendreExConsGUI.menuPrincipal(bibliotheque);
        ctrRendreExConsGUI = null;   // suppression du controleur
    }//GEN-LAST:event_rendre_consultable_buttonMousePressed

    private void rendre_empruntable_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendre_empruntable_buttonMousePressed
        // TODO add your handling code here:
        CtrRendreExEmpruntableGUI ctrRendreExEmprGUI = new CtrRendreExEmpruntableGUI(this, true);
        ctrRendreExEmprGUI.menuPrincipal(bibliotheque);
        ctrRendreExEmprGUI = null;   // suppression du controleur
    }//GEN-LAST:event_rendre_empruntable_buttonMousePressed

    private void rendre_indisponible_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendre_indisponible_buttonMousePressed
        // TODO add your handling code here:
        CtrRendreExNonDispoGUI ctrRendreExNonDispGUI = new CtrRendreExNonDispoGUI(this, true);
        ctrRendreExNonDispGUI.menuPrincipal(bibliotheque);
        ctrRendreExNonDispGUI = null;   // suppression du controleur
    }//GEN-LAST:event_rendre_indisponible_buttonMousePressed

    private void nouvelle_parution_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouvelle_parution_buttonMousePressed
        // TODO add your handling code here:
        CtrNouvParutionGUI ctrNouvParutionGUI = new CtrNouvParutionGUI(this, true);
        ctrNouvParutionGUI.menuPrincipal(bibliotheque);
        ctrNouvParutionGUI = null;   // suppression du controleur
    }//GEN-LAST:event_nouvelle_parution_buttonMousePressed

    private void nouveau_periodique_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouveau_periodique_buttonMousePressed
        CtrNouvPeriodiqueGUI ctr = new CtrNouvPeriodiqueGUI(this, true);
        ctr.menuPrincipal(bibliotheque);
        ctr = null;
    }//GEN-LAST:event_nouveau_periodique_buttonMousePressed
    
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
  private javax.swing.JLabel jLabel2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenu lecteur_menu;
  private javax.swing.JMenuItem nouveau_lecteur_button;
  private javax.swing.JMenuItem nouveau_periodique_button;
  private javax.swing.JMenuItem nouvel_exemplaire_button;
  private javax.swing.JMenuItem nouvel_ouvrage_button;
  private javax.swing.JMenuItem nouvelle_parution_button;
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
