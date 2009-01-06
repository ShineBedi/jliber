/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrNouvOuvrageGUI.java
 *
 * Created on 12 déc. 2008, 11:01:06
 */

package biblio;
import java.awt.Color;
import java.lang.*;
import java.util.*;
/**
 *
 * @author ksz
 */
public class CtrNouvParutionGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;
    private Periodique periodique_global;
    private Parution parution_global;
    
    /** Creates new form CtrNouvOuvrageGUI */
    public CtrNouvParutionGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        parent_frame = parent;
        initComponents();
        this.setLocationRelativeTo(this.getParent());
    }

    public void menuPrincipal(Bibliotheque bib) {
        biblio = bib;
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        articles_label = new javax.swing.JLabel();
        numpar_label = new javax.swing.JLabel();
        numpar_textfield = new javax.swing.JTextField();
        issn_label = new javax.swing.JLabel();
        issn_textfield = new javax.swing.JTextField();
        verifier_button = new javax.swing.JButton();
        issn_notif_label = new javax.swing.JLabel();
        titre_notif_jlabel = new javax.swing.JLabel();
        ajouter_articles_button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        paru_notif_label = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rechercher_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        articles_list = new javax.swing.JTable();
        terminer_button = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout d'une parution et de ses articles");
        setResizable(false);

        articles_label.setText("Article(s) :");

        numpar_label.setText("Numéro parution :");

        numpar_textfield.setEnabled(false);

        issn_label.setText("Numero ISSN :");

        verifier_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        verifier_button.setText("Vérifier");
        verifier_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifier_buttonMousePressed(evt);
            }
        });

        issn_notif_label.setText("Saisissez un numéro ISSN.");

        titre_notif_jlabel.setText(" ");

        ajouter_articles_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/plus_icon.gif"))); // NOI18N
        ajouter_articles_button.setText("Ajouter");
        ajouter_articles_button.setEnabled(false);
        ajouter_articles_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_articles_buttonActionPerformed(evt);
            }
        });

        paru_notif_label.setText("Saisissez un numéro de parution");

        rechercher_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        rechercher_button.setText("Rechercher / Créer");
        rechercher_button.setEnabled(false);
        rechercher_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercher_buttonActionPerformed(evt);
            }
        });

        articles_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titre", "Page"
            }
        ));
        articles_list.setEnabled(false);
        jScrollPane2.setViewportView(articles_list);

        terminer_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/flag_red.png"))); // NOI18N
        terminer_button.setText("Terminer");
        terminer_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                terminer_buttonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(terminer_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paru_notif_label, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(issn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numpar_label, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(articles_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(issn_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(numpar_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titre_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ajouter_articles_button)
                                    .addComponent(rechercher_button, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(verifier_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addComponent(issn_notif_label, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {issn_textfield, jScrollPane2, numpar_textfield, titre_notif_jlabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ajouter_articles_button, terminer_button, verifier_button});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {articles_label, issn_label, numpar_label});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(issn_label)
                        .addComponent(issn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(verifier_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issn_notif_label)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numpar_label)
                    .addComponent(numpar_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercher_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paru_notif_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(articles_label)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titre_notif_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ajouter_articles_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminer_button)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifier_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifier_buttonMousePressed
        // TODO add your handling code here:
        issn_notif_label.setText(" ");
        String issn = issn_textfield.getText();
        // Vérification la non existence de l'ouvrage / ISBN
        Periodique per = biblio.unPeriodique(issn);
        if (issn.length()==0){
            issn_notif_label.setForeground(Color.red);
            issn_notif_label.setText("Veuillez saisir un ISSN valide.");
        } else {
            if (per == null) {
                issn_notif_label.setForeground(Color.red);
                issn_notif_label.setText("Ce periodique n'existe pas dans la base !");
            } else {
                periodique_global = per;
                issn_notif_label.setForeground(Color.green);
                issn_notif_label.setText("Titre du périodique : " + per.nom());
                issn_textfield.setEnabled(false);
                verifier_button.setEnabled(false);
                numpar_textfield.setEnabled(true);
                rechercher_button.setEnabled(true);
            }
        }
    }//GEN-LAST:event_verifier_buttonMousePressed

    // affiches les articles du periodique déjà existant
    public void rafraichirListeArticles(Parution paru) {
        Set<Article> articles = paru.tesArticles();
         javax.swing.table.DefaultTableModel dtmArticles = new javax.swing.table.DefaultTableModel();
         Vector<Vector<Object>> dataArticles = new Vector<Vector<Object>>();
         dataArticles.clear();
         Vector<String> columnArticles = new Vector<String>();
         columnArticles.clear();
         columnArticles.add("Titre");
         columnArticles.add("Page");
         for(Article art:articles) {
                  Vector<Object> data_lineArticles = new Vector<Object>();
                  data_lineArticles.add(art.titre());
                  data_lineArticles.add(art.page());
                  dataArticles.add(data_lineArticles);
          }
         dtmArticles.setDataVector(dataArticles, columnArticles);
         articles_list.setModel(dtmArticles);
    }

    private void terminer_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminer_buttonMousePressed
        // TODO add your handling code here:
        // Vérification la non existence de l'ouvrage / ISBN
        if(parution_global != null) {
            VuePeriodiqueGUI vPerGUI = new VuePeriodiqueGUI(parent_frame, true);
             vPerGUI.menuPrincipal(periodique_global);
             vPerGUI.elimineObserveur();
             vPerGUI = null;
        }
        this.dispose();
}//GEN-LAST:event_terminer_buttonMousePressed

    private void rechercher_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercher_buttonActionPerformed
         paru_notif_label.setText(" ");
            String numpar = numpar_textfield.getText();
            Parution paru = periodique_global.uneParution(numpar);
            if (numpar.length()==0){
                paru_notif_label.setForeground(Color.red);
                paru_notif_label.setText("Veuillez saisir un numéro de parution valide.");
            } else {
                if (paru == null) {
                    paru = periodique_global.nouvParution(numpar, periodique_global);
                    parution_global = paru;
                    paru_notif_label.setForeground(Color.green);
                    paru_notif_label.setText("Ajout d'une nouvelle parution.");
                } else {
                    parution_global = paru;
                    paru_notif_label.setForeground(Color.green);
                    paru_notif_label.setText("Modification de la parution : " + paru.idParution());
                    this.rafraichirListeArticles(paru);
                }
                numpar_textfield.setEnabled(false);
                rechercher_button.setEnabled(false);
                articles_list.setEnabled(true);
                ajouter_articles_button.setEnabled(true);
          }
    }//GEN-LAST:event_rechercher_buttonActionPerformed

    private void ajouter_articles_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_articles_buttonActionPerformed
        CtrNouvArticleGUI ctr = new CtrNouvArticleGUI(parent_frame, true);
        if(parution_global != null) {
            ctr.menuPrincipal(biblio, this, parution_global);
         } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Opération interdite");
         }
        ctr = null;   // suppression du controleur
    }//GEN-LAST:event_ajouter_articles_buttonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrNouvOuvrageGUI dialog = new CtrNouvOuvrageGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_articles_button;
    private javax.swing.JLabel articles_label;
    private javax.swing.JTable articles_list;
    private javax.swing.JLabel issn_label;
    private javax.swing.JLabel issn_notif_label;
    private javax.swing.JTextField issn_textfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel numpar_label;
    private javax.swing.JTextField numpar_textfield;
    private javax.swing.JLabel paru_notif_label;
    private javax.swing.JButton rechercher_button;
    private javax.swing.JButton terminer_button;
    private javax.swing.JLabel titre_notif_jlabel;
    private javax.swing.JButton verifier_button;
    // End of variables declaration//GEN-END:variables

}
