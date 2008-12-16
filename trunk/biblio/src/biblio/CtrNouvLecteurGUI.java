package biblio;

/*
 * CtrNouvLecteurGUI.java
 *
 * Created on 10 décembre 2008, 10:55
 */

import java.util.*;
import java.awt.Color;
/**
 *
 * @author  mailleta
 */
public class CtrNouvLecteurGUI extends javax.swing.JDialog {
    
    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;

    /** Creates new form CtrNouvLecteurGUI */
    public CtrNouvLecteurGUI(java.awt.Frame parent, boolean modal) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nom_label = new javax.swing.JLabel();
        prenom_label = new javax.swing.JLabel();
        adresse_label = new javax.swing.JLabel();
        age_label = new javax.swing.JLabel();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        nom_textfield = new javax.swing.JTextField();
        prenom_textfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adresse_textarea = new javax.swing.JTextArea();
        age_spin = new javax.swing.JSpinner();
        nom_check_jlabel = new javax.swing.JLabel();
        prenom_check_jlabel = new javax.swing.JLabel();
        adresse_check_jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout d'un nouveau lecteur");
        setResizable(false);

        nom_label.setText("Nom :");

        prenom_label.setText("Prénom :");

        adresse_label.setText("Adresse :");

        age_label.setText("Age :");

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

        adresse_textarea.setColumns(20);
        adresse_textarea.setRows(5);
        jScrollPane1.setViewportView(adresse_textarea);

        nom_check_jlabel.setText(" ");

        prenom_check_jlabel.setText(" ");

        adresse_check_jlabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(prenom_label, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addGap(66, 66, 66))
                            .addComponent(nom_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenom_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(nom_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(prenom_check_jlabel)
                            .addComponent(nom_check_jlabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(adresse_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(66, 66, 66))
                            .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresse_check_jlabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_label)
                    .addComponent(nom_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_check_jlabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom_label)
                    .addComponent(prenom_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenom_check_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresse_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(adresse_check_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
      // TODO add your handling code here:
      try {

          String nom = nom_textfield.getText();
          String prenom = prenom_textfield.getText();
          String adresse = adresse_textarea.getText();

      nom_check_jlabel.setText("");
      prenom_check_jlabel.setText("");
      adresse_check_jlabel.setText("");



      if (nom.length()==0 || prenom.length()==0 || adresse.length()==0){
      if (nom.length()==0){
      nom_check_jlabel.setForeground(Color.red);
      nom_check_jlabel.setText("Vous devez saisir un nom.");
      }

      if (prenom.length()==0){
      prenom_check_jlabel.setForeground(Color.red);
      prenom_check_jlabel.setText("Vous devez saisir un prénom.");
      }

      if (adresse.length()==0){
      adresse_check_jlabel.setForeground(Color.red);
      adresse_check_jlabel.setText("Vous devez saisir une adresse.");
      }
      } else {
          int age =  Integer.parseInt(age_spin.getValue().toString());

          Lecteur lect = biblio.nouveauLecteur(nom,prenom,adresse,age);
          this.dispose();
          // Création de la vue
          VueLecteurGUI vLectGUI = new VueLecteurGUI(parent_frame, true);
          vLectGUI.menuPrincipal(lect);
          // Suppression de la vue vLect comme Observatrice de l'objet lect
          vLectGUI.elimineObserveur();
          vLectGUI = null;  // suppression de la vue
      }
      }  catch (java.lang.NumberFormatException e) {
             javax.swing.JOptionPane.showMessageDialog(null, "Erreur de saisie dans les champs obligatoires");
      }
    }//GEN-LAST:event_valider_buttonMousePressed

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_annuler_buttonMousePressed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrNouvLecteurGUI dialog = new CtrNouvLecteurGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel adresse_check_jlabel;
    private javax.swing.JLabel adresse_label;
    private javax.swing.JTextArea adresse_textarea;
    private javax.swing.JLabel age_label;
    private javax.swing.JSpinner age_spin;
    private javax.swing.JButton annuler_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nom_check_jlabel;
    private javax.swing.JLabel nom_label;
    private javax.swing.JTextField nom_textfield;
    private javax.swing.JLabel prenom_check_jlabel;
    private javax.swing.JLabel prenom_label;
    private javax.swing.JTextField prenom_textfield;
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables
    
}
