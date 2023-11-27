/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EDD;
import Ventana.j;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Documentos extends javax.swing.JFrame  {

    public MonticuloBinario mb;
    public static TablaDispersion tabla;
    
   

    /**
     * Creates new form Documentos
     *
     * @param t
     */
    public Documentos(TablaDispersion t) {

        this.tabla = t;
        mb = new MonticuloBinario(100);
        NodeDoc n = new NodeDoc("Dsgdf", "Dssfsfs", "sddsfds", 8);
        mb.insertar(n);
        NodeDoc m = new NodeDoc("Dsgdf", "Dssfsfs", "sddsfds", 5);
        mb.insertar(m);
        NodeDoc o = new NodeDoc("Dsgdf", "Dssfsfs", "sddsfds", 9);
        mb.insertar(o);
        NodeDoc p = new NodeDoc("Dsgdf", "Dssfsfs", "sddsfds", 2);
        mb.insertar(p);
        NodeDoc q = new NodeDoc("Dsgdf", "Dssfsfs", "sddsfds", 3);
        mb.insertar(q);
        NodeDoc w = new NodeDoc("Dsgdf", "Dssfsfs", "sddsfds", 4);
        mb.insertar(w);
        NodeDoc i = new NodeDoc("Dsgdf", "Dssfsfs", "sddsfds", 1);
        mb.insertar(i);
        initComponents();
        this.setVisible(true);
    }

    

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cola = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        eliminarDoc = new javax.swing.JButton();
        crearDoc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DOCUMENTO = new javax.swing.JTextArea();
        DOC = new javax.swing.JTextField();
        TITULO = new javax.swing.JTextField();
        SIZE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        username1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Título:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel2.setText("Tamaño:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setText("Documento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        cola.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        cola.setText("MostrarCola");
        cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaActionPerformed(evt);
            }
        });
        jPanel1.add(cola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel5.setText("DOCUMENTOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        eliminarDoc.setText("Eliminar Doc");
        eliminarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDocActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, -1));

        crearDoc.setText("Crear Doc");
        crearDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDocActionPerformed(evt);
            }
        });
        jPanel1.add(crearDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        DOCUMENTO.setColumns(20);
        DOCUMENTO.setRows(5);
        jScrollPane2.setViewportView(DOCUMENTO);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 250, 200));
        jPanel1.add(DOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, -1));

        TITULO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TITULOKeyTyped(evt);
            }
        });
        jPanel1.add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        SIZE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIZEActionPerformed(evt);
            }
        });
        jPanel1.add(SIZE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, -1));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jButton2.setText("◀");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, 30));

        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        username1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username1KeyTyped(evt);
            }
        });
        jPanel1.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, -1));

        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDocActionPerformed
        if (username1.getText().isEmpty() || TITULO.getText().isEmpty() || SIZE.getText().isEmpty() || DOC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos", "ADVERTENCIA", 2);
        } else {
            String usuario = this.username1.getText().toLowerCase();

            String titulo = this.TITULO.getText().toLowerCase();

            String size = this.SIZE.getText();

            String tipo = this.DOC.getText().toLowerCase();

            this.tabla.eliminar(usuario);

            String texto = "Documento eliminado";
            DOCUMENTO.setText(texto);

        }


    }//GEN-LAST:event_eliminarDocActionPerformed

    private void crearDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDocActionPerformed
        if (username1.getText().isEmpty() || TITULO.getText().isEmpty() || SIZE.getText().isEmpty() || DOC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos", "ADVERTENCIA", 2);
        } else {
            String usuario = this.username1.getText().toLowerCase();
            String titulo = this.TITULO.getText().toLowerCase();

            String size = this.SIZE.getText();

            String tipo = this.DOC.getText().toLowerCase();
            String texto = "Usuario: " + usuario + "\nTítulo: " + titulo + "\nTamaño: " + size + "\nTipo: " + tipo;

            DOCUMENTO.setText(texto);

            this.tabla.insertarDoc(usuario, titulo, size, tipo, 0);
        }

    }//GEN-LAST:event_crearDocActionPerformed

    private void colaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaActionPerformed
        this.cola.setText(mb.imprimir(""));
    }//GEN-LAST:event_colaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void username1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username1KeyTyped
        int key = evt.getKeyChar();
        boolean vacio = key != 32;
        if (!(vacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_username1KeyTyped

    private void SIZEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIZEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIZEActionPerformed

    private void TITULOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TITULOKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TITULOKeyTyped

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
            java.util.logging.Logger.getLogger(Documentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documentos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Documentos(new TablaDispersion()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DOC;
    private javax.swing.JTextArea DOCUMENTO;
    private javax.swing.JTextField SIZE;
    private javax.swing.JTextField TITULO;
    private javax.swing.JButton cola;
    private javax.swing.JButton crearDoc;
    private javax.swing.JButton eliminarDoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables

}
