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
        public String tamaño;
        public String tipo;
        public int etiquetaDeTiempo;
        
        
public NodeDoc(String titulo, String size, String tipo, int tiempo){
        this.title = titulo;
        this.tamaño = size;
        this.tipo = tipo;
        this.etiquetaDeTiempo = tiempo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamano(String tamano) {
        this.tamaño = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEtiquetaDeTiempo() {
        return etiquetaDeTiempo;
    }

    public void setEtiquetaDeTiempo(int etiquetaDeTiempo) {
        this.etiquetaDeTiempo = etiquetaDeTiempo;
    }
    
}
