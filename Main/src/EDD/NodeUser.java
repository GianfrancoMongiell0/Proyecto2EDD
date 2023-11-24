/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Cristian Fazio
 */
public class NodeUser {
        
        public String NameUsuario;
        private String Prioridad;
        public NodeDoc[] docs;
        
    public NodeUser(String NameUsuario, String Prioridad) {
        this.NameUsuario = NameUsuario;
        this.Prioridad = Prioridad;
        this.docs = new NodeDoc[11];
    }

    public String getNameUsuario() {
        return NameUsuario;
    }

    public void setNameUsuario(String NameUsuario) {
        this.NameUsuario = NameUsuario;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }
    
    public void insertarDoc(NodeDoc doc){
        for (int i = 0; i < docs.length; i++) {
            if(docs[i] == null){
                docs[i] = doc;
                break;
            }
        }
    }
    
    public void eliminarDoc(String doc){
        for (int i = 0; i < docs.length; i++) {
            if(docs[i] != null && docs[i].title.equals(doc)){
                docs[i]  = null;
                break;
            }
        }
    }
}
