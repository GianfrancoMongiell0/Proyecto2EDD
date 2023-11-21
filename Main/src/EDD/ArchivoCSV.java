/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import javax.swing.JOptionPane;

/**
 *
 * @author gianf
 */
public class ArchivoCSV {

    private BufferedReader lector;
    private String linea;
    private String partes[];

    public void leerArchivoCSV(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes = null;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }

    }

    public void imprimirLinea() {
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i] + "|");
        }
    }

}
