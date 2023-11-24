/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EDD;

import javax.swing.JTextArea;

/**
 *
 * @author Asus
 */
public class Ventana1 extends javax.swing.JFrame {
    private JTextArea TextAreaCola;
    TablaDispersion tabla;
    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
        initComponents();
        this.setVisible(true);
        tabla = new TablaDispersion();
        ArchivoCSV csv = new ArchivoCSV(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cargarcsv = new javax.swing.JButton();
        user = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Doc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargarcsv.setBackground(new java.awt.Color(102, 102, 102));
        cargarcsv.setForeground(new java.awt.Color(0, 0, 0));
        cargarcsv.setText("Cargar Archivo");
        cargarcsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarcsvActionPerformed(evt);
            }
        });
        jPanel1.add(cargarcsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        user.setBackground(new java.awt.Color(102, 102, 102));
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setText("Usuarios");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 87, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENÚ DE INICIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        Doc.setBackground(new java.awt.Color(102, 102, 102));
        Doc.setForeground(new java.awt.Color(0, 0, 0));
        Doc.setText("Documentos");
        Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocActionPerformed(evt);
            }
        });
        jPanel1.add(Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 410, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarcsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarcsvActionPerformed
          ArchivoCSV.leerArchivoCSV(tabla, TextAreaCola);

    }//GEN-LAST:event_cargarcsvActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
//        this.setVisible(false);
        Usuarios u = new Usuarios(tabla);
    }//GEN-LAST:event_userActionPerformed

    private void DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocActionPerformed
        // TODO add your handling code here:
        Documentos d = new Documentos(tabla);
    }//GEN-LAST:event_DocActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Doc;
    private javax.swing.JButton cargarcsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables

}