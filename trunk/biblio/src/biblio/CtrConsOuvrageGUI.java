/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrConsOuvrageGUI.java
 *
 * Created on 12 déc. 2008, 12:53:05
 */

package biblio;
import javax.swing.*;
import java.awt.Color;
/**
 *
 * @author ksz
 */
public class CtrConsOuvrageGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;

    /** Creates new form CtrConsOuvrageGUI */
    public CtrConsOuvrageGUI(java.awt.Frame parent, boolean modal) {
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

        isbn_label = new javax.swing.JLabel();
        isbn_textfield = new javax.swing.JTextField();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        isbn_notif_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulter un ouvrage");
        setResizable(false);

        isbn_label.setText("Numero ISBN :");

        annuler_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/cancel.png"))); // NOI18N
        annuler_button.setText("Annuler");
        annuler_button.setFocusable(false);
        annuler_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        annuler_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        isbn_notif_label.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(annuler_button)
                        .addGap(18, 18, 18)
                        .addComponent(valider_button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isbn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isbn_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addComponent(isbn_notif_label))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn_label)
                    .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isbn_notif_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuler_button)
                    .addComponent(valider_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
        // TODO add your handling code here:
        try {
            String isbn = isbn_textfield.getText();
            Ouvrage ouv = biblio.unOuvrage(isbn);
            if (ouv != null) {
                this.dispose();
                // Création de la vue
                VueOuvrageGUI vOuvGUI = new VueOuvrageGUI(parent_frame, true);
                vOuvGUI.menuPrincipal(ouv);
                // Suppression de la vue vLect comme Observatrice de l'objet lect
                vOuvGUI.elimineObserveur();
                vOuvGUI = null;  // suppression de la vue
            } else  {
               isbn_notif_label.setForeground(Color.red);
               isbn_notif_label.setText("L'ouvrage n'existe pas dans la base.");
            }
        } catch(java.lang.NumberFormatException Ex) {
           isbn_notif_label.setForeground(Color.red);
           isbn_notif_label.setText("Saisissez un ISBN.");
        }
}//GEN-LAST:event_valider_buttonMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrConsOuvrageGUI dialog = new CtrConsOuvrageGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel isbn_label;
    private javax.swing.JLabel isbn_notif_label;
    private javax.swing.JTextField isbn_textfield;
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables

}
