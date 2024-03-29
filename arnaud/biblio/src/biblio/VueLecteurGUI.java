/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VueLecteurGUI.java
 *
 * Created on 11 déc. 2008, 15:35:03
 */

package biblio;

import java.util.*;

/**
 *
 * @author ksz
 */
public class VueLecteurGUI extends javax.swing.JDialog implements Observer {

    private Lecteur lect;


    public void menuPrincipale (Lecteur lecteur) {
        lect = lecteur;
        lect.addObserver(this);
        this.afficherTout();
        this.setVisible(true);
     } // Fin Constructeur


    public void update(Observable obs, Object o) {
        // maj de la vue
        this.afficherTout();
    }
    
    public void elimineObserveur() {
        lect.deleteObserver(this);
    }

    private void afficherTout()  {
        Integer numero = lect.numero();
        numero_textfield.setText(numero.toString());
        nom_textfield.setText(lect.nom());
        prenom_textfield.setText(lect.prenom());
        adresse_textarea.setText(lect.adresse());
        Integer age = lect.age();
        age_textfield.setText(age.toString());
 }

    /** Creates new form VueLecteurGUI */
    public VueLecteurGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this.getParent());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero_label = new javax.swing.JLabel();
        nom_label = new javax.swing.JLabel();
        prenom_label = new javax.swing.JLabel();
        adresse_label = new javax.swing.JLabel();
        age_label = new javax.swing.JLabel();
        nom_textfield = new javax.swing.JTextField();
        prenom_textfield = new javax.swing.JTextField();
        scroller = new javax.swing.JScrollPane();
        adresse_textarea = new javax.swing.JTextArea();
        numero_textfield = new javax.swing.JTextField();
        age_textfield = new javax.swing.JTextField();
        terminer_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lecteur");
        setBackground(java.awt.Color.white);

        numero_label.setText("Numero :");

        nom_label.setText("Nom :");

        prenom_label.setText("Prénom :");

        adresse_label.setText("Adresse :");

        age_label.setText("Age :");

        nom_textfield.setEditable(false);

        prenom_textfield.setEditable(false);

        scroller.setEnabled(false);

        adresse_textarea.setColumns(20);
        adresse_textarea.setEditable(false);
        adresse_textarea.setRows(5);
        scroller.setViewportView(adresse_textarea);

        numero_textfield.setEditable(false);

        age_textfield.setEditable(false);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prenom_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prenom_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nom_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nom_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adresse_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(age_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(216, 216, 216))
                                    .addComponent(scroller)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(terminer_button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_label)
                    .addComponent(nom_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresse_label)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scroller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age_label)
                            .addComponent(age_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(terminer_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminer_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminer_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();// setVisible == fuite de memoire 
        //this.setVisible(false);
    }//GEN-LAST:event_terminer_buttonMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VueLecteurGUI dialog = new VueLecteurGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel adresse_label;
    private javax.swing.JTextArea adresse_textarea;
    private javax.swing.JLabel age_label;
    private javax.swing.JTextField age_textfield;
    private javax.swing.JLabel nom_label;
    private javax.swing.JTextField nom_textfield;
    private javax.swing.JLabel numero_label;
    private javax.swing.JTextField numero_textfield;
    private javax.swing.JLabel prenom_label;
    private javax.swing.JTextField prenom_textfield;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JButton terminer_button;
    // End of variables declaration//GEN-END:variables

}
