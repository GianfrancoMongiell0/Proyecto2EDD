/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author gianf
 */
public class Lector {

    public void leerCSV() throws FileNotFoundException, IOException {
       
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione un archivo CSV");

        // Añadir un filtro para solo permitir archivos .csv
        FileNameExtensionFilter filter = new FileNameExtensionFilter(null, "csv");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();

            try (BufferedReader br = new BufferedReader(new FileReader(fileToOpen))) {
                String line;
                while ((line = br.readLine()) != null) {
                    
                    String[] values = line.split(",");
                    // Haz algo con los valores aquí
                    String values1 = values[0].trim();
                    String values2 = values[1].trim();
                    System.out.println(values1 + " | " +  values2);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

  



}

