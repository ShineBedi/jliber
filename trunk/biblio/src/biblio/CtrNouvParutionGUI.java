package biblio;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrNouvParutionGUI.java
 *
 * Created on 15 déc. 2008, 13:16:14
 */

/**
 *
 * @author ardaudg
 */
public class CtrNouvParutionGUI extends javax.swing.JDialog {

private Bibliotheque biblio;
private java.awt.Frame parent_frame;

    /** Creates new form CtrNouvParutionGUI */
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

        issn_label = new javax.swing.JLabel();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        issn_textfield = new javax.swing.JTextField();
        verifier_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout d'une parution");
        setResizable(false);

        issn_label.setText("Numero ISSN :");

        annuler_button.setText("Annuler");
        annuler_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                annuler_buttonMousePressed(evt);
            }
        });

        valider_button.setText("Valider");
        valider_button.setEnabled(false);
        valider_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valider_buttonMousePressed(evt);
            }
        });

        verifier_button.setText("Rechercher");
        verifier_button.setActionCommand("Rechercher");
        verifier_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifier_buttonMousePressed(evt);
            }
        });

        jLabel1.setText("Nom du périodique:");

        jTextField1.setBackground(new java.awt.Color(1, 1, 1));
        jTextField1.setEditable(false);
        jTextField1.setForeground(new java.awt.Color(254, 254, 254));
        jTextField1.setText("foo bar");
        jTextField1.setToolTipText("Nom du périodique ayant l'ISSN spécifié.");
        jTextField1.setEnabled(false);

        jLabel2.setText("Identifiant de parution:");

        jTextField2.setToolTipText("Entrez ici l'identifiant de parution du périodique spécifié.");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jLabel3.setText("Mots clés:");

        jLabel4.setText("Auteurs:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/plus_icon.gif"))); // NOI18N
        jButton1.setText("Ajouter");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/plus_icon.gif"))); // NOI18N
        jButton2.setText("Ajouter");

        jLabel5.setText("Article");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"OpenBSD", "14"},
                {"Rootkit", "28"}
            },
            new String [] {
                "Titre", "Page"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/plus_icon.gif"))); // NOI18N
        jButton3.setText("Ajouter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(issn_label, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1)
                                    .addComponent(issn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verifier_button, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issn_label)
                    .addComponent(verifier_button)
                    .addComponent(issn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
        // TODO add your handling code here:
        // Vérification la non existence de l'ouvrage / ISBN
        String issn = issn_textfield.getText();
//        Ouvrage ouv = biblio.unPeriodique(issn);
}//GEN-LAST:event_valider_buttonMousePressed

    private void verifier_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifier_buttonMousePressed
        // TODO add your handling code here:
        String issn = issn_textfield.getText();
        // Vérification la non existence de l'ouvrage / ISBN

}//GEN-LAST:event_verifier_buttonMousePressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrNouvParutionGUI dialog = new CtrNouvParutionGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel issn_label;
    private javax.swing.JTextField issn_textfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton valider_button;
    private javax.swing.JButton verifier_button;
    // End of variables declaration//GEN-END:variables

}
