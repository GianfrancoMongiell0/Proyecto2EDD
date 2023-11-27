
package Ventana;

import EDD.MonticuloBinario;
import EDD.NodeDoc;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * Ventana donde se muestra la grafica
 * 
 * @author Cristian Fazio
 */
public class Grafico extends javax.swing.JFrame {
    public static MonticuloBinario bh;

    /**
     * Creates new form Ventana1
     */
    public Grafico(MonticuloBinario h) {
        this.bh = h;
        initComponents();
        
        
    }
    public void graficar(Graphics g, int m, int y, NodeDoc x){
        g.setColor(Color.BLACK);
        g.fillOval(m, y, 50, 40);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial",Font.BOLD,20));
        String t = String.valueOf(x.etiquetaDeTiempo);
        g.drawString(t, m+20, y+30);
    }
    public int graficarMonticulo(Graphics g, NodeDoc x, int x0, int x1, int y, int index){

        int m = (x0 + x1) / 2;
        g.setColor(Color.WHITE);
        g.fillOval(m, y, 50, 40);
        g.setColor(Color.GRAY);
        g.setFont(new Font("Arial",Font.BOLD,20));
        String t = String.valueOf(x.etiquetaDeTiempo);
        g.drawString(t, m+20, y+30);
        int posL = bh.indiceHijoIzquierdo(index);
        int posR = bh.indiceHijoDerecho(index);
        if (bh.heap[posL] != null) {
            int x2 = graficarMonticulo(g, bh.heap[posL],x0,m,y+50, posL);
            g.drawLine(m+25, y+40, x2+25, y+50);
        }
        if (bh.heap[posR] != null) {
            int x2 = graficarMonticulo(g, bh.heap[posR],m,x1,y+50, posR);
            g.drawLine(m+25, y+40, x2+25, y + 50);
        }
        return m;
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        graficarMonticulo(g, bh.heap[0], 0, this.getWidth()-25, 100, 0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico(bh).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
