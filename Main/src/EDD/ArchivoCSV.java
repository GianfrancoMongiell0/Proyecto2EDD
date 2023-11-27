
package EDD;

/**
 *
 * Esta clase define el el buscador de archivo mediante se va a buscar el archivo csv   
 * 
 * @author Gianfranco Mongiello
 */
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoCSV {
// Campos de la clase 
    public static TablaDispersion tabla;
    public ArchivoCSV(TablaDispersion t){
        this.tabla  = t;
    }

// Metodo para buscar y leer el archivo csv
    public static void leerArchivoCSV(TablaDispersion td, JTextArea textAreaCola) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar Archivo CSV");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV", "csv"));

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = lector.readLine()) != null) {
                        procesarLinea(linea, td);
                    }
                }
                JOptionPane.showMessageDialog(null, "Cargado Exitosamente");

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún archivo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
// Cierre del metodo
    
    
// Metodo para procesar la linea del csv y agregarla a la clase de Tabla de dispercion
    private static void procesarLinea(String linea, TablaDispersion td) {
        // Dividir la línea en partes basadas en la coma
        linea =linea.replace("\"", "");
        String[] partes = linea.split(",");
        if (partes.length != 2){
            partes = linea.split(";");

        }
        

        // Si la línea contiene 2 partes, es una línea de datos válida
        if (partes.length == 2) {
            
            String usuario = partes[0].trim();
            if(partes[1].equals("prioridad_alta")){
                partes[1] = "Alta";
            }else if(partes[1].equals("prioridad_media")){
                partes[1] = "Media";
            }else if(partes[1].equals("prioridad_baja")){
                partes[1] = "Baja";
            }
            String tipo = partes[1].trim();
            
            td.insertar(usuario, tipo);
           
        }
        
    }
    // Cierre del metodo
}
// Cierre de la clase