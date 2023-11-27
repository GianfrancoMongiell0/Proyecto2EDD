
package EDD;

/**
 * 
 *Esta clase define el nodo para los documentos
 * 
 * @author Cristian Fazio
 */
public class NodeDoc {
// Campos de la clase
        public String title;
        public String tamaño;
        public String tipo;
        public int etiquetaDeTiempo;
        
/**
 * 
 * Constructor para el nodeDoc
 * 
 */
public NodeDoc(String titulo, String size, String tipo, int tiempo){
        this.title = titulo;
        this.tamaño = size;
        this.tipo = tipo;
        this.etiquetaDeTiempo = tiempo;
    }
// Cierre del metodo


/**
 * 
 * Metodo que permite obtener el titulo
 * 
*/

    public String getTitle() {
        return title;
    }
/**
 * 
 * Metodo que permite cambiar el titulo
 * 
 */
    public void setTitle(String title) {
        this.title = title;
    }
// Cierre del metodo

    
    
    /**
     * 
     * Metodo que permite obtener el tamanio del documento
     * 
     */
    public String getTamaño() {
        return tamaño;
    }// Cierre del metodo
    
    /**
     * 
     *  Metodo que permite cambiar el tamanio del documento
     * 
     */
    

    public void setTamano(String tamano) {
        this.tamaño = tamano;
    }
// Cierre del metodo
    
    /**
     * 
     * Metodo que permite obtener el tipo de documento
     * 
     */

    public String getTipo() {
        return tipo;
    }
// Cierre del metodo

    
/**
 * 
 * Metodo que permite cambiar el tipo del documento
 * 
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
// Cierre del metodo

    /**
     * 
     * Metodo que permite obtener el tiempo del documento
     * 
     */
    public int getEtiquetaDeTiempo() {
        return etiquetaDeTiempo;
    }
//Cierre del metodo

    
    /**
     * 
     * Metodo que permite cambiar el tiempo del documento
     * 
     */
    public void setEtiquetaDeTiempo(int etiquetaDeTiempo) {
        this.etiquetaDeTiempo = etiquetaDeTiempo;
    }//Cierre del metodo
    
}
//Cierre de la clase