/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrNouvAuteurGUI.java
 *
 * Created on 22 déc. 2008, 19:29:13
 */

package biblio;

import java.awt.Color;
import java.lang.*;
import java.util.*;

/**
 *
 * @author ksz
 */
public class CtrNouvArticleGUI extends javax.swing.JDialog {


    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;
    private CtrNouvParutionGUI fenetreParution;
    private Parution parution;

    /** Creates new form CtrNouvOuvrageGUI */
    public CtrNouvArticleGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        parent_frame = parent;
        initComponents();
        this.setLocationRelativeTo(this.getParent());
    }

    public void menuPrincipal(Bibliotheque bib, CtrNouvParutionGUI fenetreParution, Parution paru) {
        biblio = bib;
        this.fenetreParution = fenetreParution;
        parution = paru;
        Enumeration enumMotsCles = biblio.enumMotsCles();
        Vector<String> mesMotsCles = new Vector<String>();
        if (enumMotsCles.hasMoreElements()) {
            while (enumMotsCles.hasMoreElements()) {
                MotCle mc = (MotCle) enumMotsCles.nextElement();
                mesMotsCles.add(mc.motCle());
            }
        }
        motscles_list.setListData(mesMotsCles);
        this.rafraichirListeAuteur();
        this.setVisible(true);
    }

    public void rafraichirListeAuteur() {

        // ajout des Auteurs
        Enumeration enumAuteurs = biblio.enumAuteurs();
        Vector<String> mesAuteurs = new Vector<String>();
        if (enumAuteurs.hasMoreElements()) {
            while (enumAuteurs.hasMoreElements()) {
                Auteur aut = (Auteur) enumAuteurs.nextElement();
                mesAuteurs.add(aut.nom()+" "+aut.prenom());
            }
        }
        auteurs_list.setListData(mesAuteurs);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        titre_label = new javax.swing.JLabel();
        auteur_label = new javax.swing.JLabel();
        titre_textfield = new javax.swing.JTextField();
        titre_notif_jlabel = new javax.swing.JLabel();
        auteur_notif_jlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        auteurs_list = new javax.swing.JList();
        ajouter_auteurs_button = new javax.swing.JButton();
        motscles_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        motscles_list = new javax.swing.JList();
        motscles_notif_jlabel = new javax.swing.JLabel();
        page_label = new javax.swing.JLabel();
        page_spin = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout d'un article");

        annuler_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/cancel.png"))); // NOI18N
        annuler_button.setText("Annuler");
        annuler_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                annuler_buttonMousePressed(evt);
            }
        });

        valider_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/tick.png"))); // NOI18N
        valider_button.setText("Valider");
        valider_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valider_buttonMousePressed(evt);
            }
        });

        titre_label.setText("Titre :");

        auteur_label.setText("Auteur(s) :");

        titre_notif_jlabel.setText(" ");

        auteur_notif_jlabel.setText(" ");

        jScrollPane1.setViewportView(auteurs_list);

        ajouter_auteurs_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/plus_icon.gif"))); // NOI18N
        ajouter_auteurs_button.setText("Ajouter");
        ajouter_auteurs_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ajouter_auteurs_buttonMousePressed(evt);
            }
        });

        motscles_label.setText("Mot(s) clé(s) :");

        jScrollPane2.setViewportView(motscles_list);

        motscles_notif_jlabel.setText(" ");

        page_label.setText("Page :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(motscles_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(auteur_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titre_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(page_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(auteur_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motscles_label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titre_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(page_spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(ajouter_auteurs_button)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {auteur_label, motscles_label, page_label, titre_label});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, titre_textfield});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre_label)
                    .addComponent(titre_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titre_notif_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(page_spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(page_label))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(auteur_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouter_auteurs_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(auteur_notif_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motscles_label)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motscles_notif_jlabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed

        titre_notif_jlabel.setText(" ");
        auteur_notif_jlabel.setText(" ");
        motscles_notif_jlabel.setText(" ");
        // Saisie de toutes les infos de l'ouvrage

        String titre = titre_textfield.getText();
        int page =  Integer.parseInt(page_spin.getValue().toString());

        // on recupere la liste des auteurs selectionnées
        int selectionsAuteurs[] = auteurs_list.getSelectedIndices();
        Object selectedValuesAuteurs[] = auteurs_list.getSelectedValues();
        Set<Auteur> auteurs = new HashSet<Auteur>();
        for (int i = 0, n = selectionsAuteurs.length; i < n; i++) {
            String nomprenom = (String)selectedValuesAuteurs[i];
            nomprenom = nomprenom.replace(" ", "");
            Auteur aut = biblio.unAuteur(nomprenom);
            auteurs.add(aut);
        }

        // on récupère la liste des mots clés selectionnées
        int selectionsMotsCles[] = motscles_list.getSelectedIndices();
        Object selectedValuesMotsCles[] =motscles_list.getSelectedValues();
        Set<MotCle> motsCles = new HashSet<MotCle>();
        for (int i = 0, n = selectionsMotsCles.length; i < n; i++) {
            String motcle = (String)selectedValuesMotsCles[i];
            motcle = motcle.replace(" ", "");
            MotCle mc = biblio.unMotCle(motcle);
            motsCles.add(mc);
        }

         if (titre.isEmpty() || selectionsAuteurs.length == 0 || selectionsMotsCles.length==0){
            if (titre.isEmpty()){
                titre_notif_jlabel.setForeground(Color.red);
                titre_notif_jlabel.setText("Vous devez saisir un titre.");
            }
            if(selectionsAuteurs.length == 0) {
                auteur_notif_jlabel.setForeground(Color.red);
                auteur_notif_jlabel.setText("Vous devez sélectionner au moins un auteur.");
            }
            if(selectionsMotsCles.length==0) {
                motscles_notif_jlabel.setForeground(Color.red);
                motscles_notif_jlabel.setText("Vous devez sélectionner au moins un mot clé.");
            }

        } else {
                parution.nouvArticle(titre, page, parution, auteurs, motsCles);
                fenetreParution.rafraichirListeArticles(parution);
                javax.swing.JOptionPane.showMessageDialog(null, "Ajout de l'article dans la base réussi");
                 this.dispose();
        }
}//GEN-LAST:event_valider_buttonMousePressed

    private void ajouter_auteurs_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouter_auteurs_buttonMousePressed
        // TODO add your handling code here:
        CtrNouvAuteurArtGUI ctr = new CtrNouvAuteurArtGUI(parent_frame, true);
        ctr.menuPrincipal(biblio, this);
        ctr = null;   // suppression du controleur
}//GEN-LAST:event_ajouter_auteurs_buttonMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrNouvArticleGUI dialog = new CtrNouvArticleGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ajouter_auteurs_button;
    private javax.swing.JButton annuler_button;
    private javax.swing.JLabel auteur_label;
    private javax.swing.JLabel auteur_notif_jlabel;
    private javax.swing.JList auteurs_list;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel motscles_label;
    private javax.swing.JList motscles_list;
    private javax.swing.JLabel motscles_notif_jlabel;
    private javax.swing.JLabel page_label;
    private javax.swing.JSpinner page_spin;
    private javax.swing.JLabel titre_label;
    private javax.swing.JLabel titre_notif_jlabel;
    private javax.swing.JTextField titre_textfield;
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables

}
