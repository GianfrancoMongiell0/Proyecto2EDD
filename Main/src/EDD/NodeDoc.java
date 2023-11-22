/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Cristian Fazio
 */
public class NodeDoc {
        public String title;
        public String tamano;
        public String tipo;
        public int etiquetaDeTiempo;
        
        public NodeDoc(String titulo, String size, String tipo, int tiempo){
            this.title = titulo;
            this.tamano = size;
            this.tipo = tipo;
            this.etiquetaDeTiempo = tiempo;
        }
        
}
