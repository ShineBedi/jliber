/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrConsLecteurGUI.java
 *
 * Created on 11 déc. 2008, 16:52:09
 */

package biblio;


import java.util.*;
import java.lang.*;
import javax.swing.*;
/**
 *
 * @author ksz
 */
public class CtrConsLecteurGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;
    
    /** Creates new form CtrConsLecteurGUI */
    public CtrConsLecteurGUI(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        numero_textfield = new javax.swing.JTextField();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulter un lecteur");
        setResizable(false);

        jLabel1.setText("Numero lecteur :");

        annuler_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/cancel.png"))); // NOI18N
        annuler_button.setText("Annuler");
        annuler_button.setFocusable(false);
        annuler_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(annuler_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valider_button))
                    .addComponent(numero_textfield))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numero_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
      // TODO add your handling code here:
      try {
          String numero = numero_textfield.getText();
          int numero_int = Integer.parseInt(numero);
          Lecteur lect = biblio.unLecteur(numero_int);
          if (lect != null) {
            this.dispose();
            // Création de la vue
            VueLecteurGUI vLectGUI = new VueLecteurGUI(parent_frame, true);
            vLectGUI.menuPrincipal(lect);
             // Suppression de la vue vLect comme Observatrice de l'objet lect
            vLectGUI.elimineObserveur();
            vLectGUI = null;  // suppression de la vue
          } else  {
            JOptionPane.showMessageDialog(this,
            "Le lecteur saisie n'est pas dans la base",
            "Erreur : lecteur inconnu",
            JOptionPane.ERROR_MESSAGE);
          }
      } catch(java.lang.NumberFormatException Ex) {
            JOptionPane.showMessageDialog(this,
            "Erreur de saisie dans les champs obligatoires",
            "Erreur : Conversion",
            JOptionPane.ERROR_MESSAGE);
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
                CtrConsLecteurGUI dialog = new CtrConsLecteurGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton annuler_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numero_textfield;
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables

}
