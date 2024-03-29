/*
 * PeriodiqueInterface.java
 *
 * Created on December 16, 2008, 4:02 PM
 */

package biblio;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author  scriptoff
 */
public class VuePeriodiqueGUI extends javax.swing.JDialog implements Observer {
    
    /** Creates new form PeriodiqueInterface */
    public VuePeriodiqueGUI(java.awt.Frame parent, boolean modal ) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this.getParent());
    }
    
    public void menuPrincipale(Periodique _per) {
        per = _per;
        per.addObserver(this);
        this.afficherTout();
        this.setVisible(true);
    }
     public void update(Observable obs, Object o) {
        // maj de la vue
        this.afficherTout();
    }
    public void elimineObserveur() {
        per.deleteObserver(this);
    }
    private void afficherTout()  {
       text_field_issn.setText(per.issn());
       text_field_nom.setText(per.nom());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_field_issn = new javax.swing.JTextField();
        text_field_nom = new javax.swing.JTextField();
        bouton_ajouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ISSN:");

        jLabel2.setText("Nom:");

        text_field_issn.setEditable(false);

        text_field_nom.setEditable(false);

        bouton_ajouter.setText("OK");
        bouton_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_ajouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_field_nom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(text_field_issn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bouton_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_field_issn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_field_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bouton_ajouter)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_ajouterActionPerformed
        this.dispose();
    }//GEN-LAST:event_bouton_ajouterActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
	    // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (Exception e) {
       System.out.println("Java sucks , C++ rocks");
    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VuePeriodiqueGUI dialog = new VuePeriodiqueGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.setLocationRelativeTo(null);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_ajouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField text_field_issn;
    private javax.swing.JTextField text_field_nom;
    // End of variables declaration//GEN-END:variables
    private Periodique per ;
}
