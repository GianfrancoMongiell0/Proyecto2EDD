
package EDD;

/**
 *
 * Esta clase define el nodo que se va a usar para los usuarios
 * 
 * @author Gianfranco Mongiello
 * 
 */
public class NodeUser {
        //Campos de la clase
        public String NameUsuario;
        private String Prioridad;
        public NodeDoc[] docs;
        /**
         * 
         * Constructor del NodoUser
         * 
         */
    public NodeUser(String NameUsuario, String Prioridad) {
        this.NameUsuario = NameUsuario;
        this.Prioridad = Prioridad;
        this.docs = new NodeDoc[11];
    }

    /**
     * 
     * Metodo que permite obtener el nombre del usuario
     * 
     */
    public String getNameUsuario() {
        return NameUsuario;
    }
    //Cierre del metodo

    /**
 * 
 * Metodo que permite cambiar el nombre del usuario
 * 
 */
    public void setNameUsuario(String NameUsuario) {
        this.NameUsuario = NameUsuario;
    }
//Cierre del metodo

    /**
 * 
 * Metodo que permite obtener las prioridad que tiene el usuario
 * 
 */
    
    public String getPrioridad() {
        return Prioridad;
    }
//Cierre del metodo
    
    /**
 * 
 * Metodo que permite cambiar la prioridad del usuario
 * 
 */
    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }
//Cierre del metodo    
    
    /**
 * 
 * Metodo que permite insertar el documento del usuario
 * 
 */
    public void insertarDoc(NodeDoc doc){
        for (int i = 0; i < docs.length; i++) {
            if(docs[i] == null){
                docs[i] = doc;
                break;
            }
        }
    }
//Cierre del metodo    
    
    /**
 * 
 * Metodo que permite eliminar el documento del usuario
 * 
 */
    public void eliminarDoc(String doc){
        for (int i = 0; i < docs.length; i++) {
            if(docs[i] != null && docs[i].title.equals(doc)){
                docs[i]  = null;
                break;
            }
        }
    }
 //Cierre del metodo   
    
    /**
 * 
 * Metodo que permite buscar el documento del usuario
 * 
 */
     public NodeDoc buscarDocumento(String doc){
        for (int i = 0; i < docs.length; i++) {
            if(docs[i]!= null && docs[i].title.equals(doc)){
                return docs[i];
            }
        }
        return null;
     }
     //Cierre del metodo
}
//Cierre de la clase 