/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Asus
 */
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoCSV {
    public static TablaDispersion tabla;
    public ArchivoCSV(TablaDispersion t){
        this.tabla  = t;
    }

    public static void leerArchivoCSV(TablaDispersion td) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar Archivo CSV");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV", "csv"));

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                BufferedReader lector = new BufferedReader(new FileReader(archivo));
                String linea;
                while ((linea = lector.readLine()) != null) {
                    procesarLinea(linea, td);
                }
                lector.close();
                JOptionPane.showMessageDialog(null, "Cargado Exitosamente");

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún archivo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void procesarLinea(String linea, TablaDispersion td) {
        // Dividir la línea en partes basadas en la coma
        linea =linea.replace("\"", "");
        String[] partes = linea.split(",");
        

        // Si la línea contiene 2 partes, es una línea de datos válida
        if (partes.length == 2) {
            
            String usuario = partes[0].trim();
            String tipo = partes[1].trim();
            
            td.insertar(usuario, tipo);
            System.out.println("Usuario: " + usuario + ", Tipo: " + tipo);
           
        }
    }
}
