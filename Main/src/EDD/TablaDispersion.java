
package EDD;

/**
 *Esta clase define la tabla de dispercion
 * 
 * @author Cristian Fazio
 */
public class TablaDispersion {
//Campos de la clase
    public NodeUser[] usuarios;
    public int capacidad;
/**
 * Constructor de la clase
 */
    public TablaDispersion() {
        this.usuarios = new NodeUser[200];
        this.capacidad = 0;
    }
 /**
     * 
     * Metodo que permite calcular el hash del usuario
     * 
     */
    public int calcHash(String usuario) {
        int hash = 0;
        for (int i = 0; i < usuario.length(); i++) {
            hash += (int) usuario.charAt(i) * i;
        }

        hash = hash % 200;
        return hash;
    }
//cierre del metodo
    
     /**
     * 
     * Metodo que permite agregar a un usuario 
     * 
     */
    public void insertar(String NameUsuario, String Prioridad) {
        int hash = calcHash(NameUsuario);
        if (usuarios[hash] == null) {
            usuarios[hash] = new NodeUser(NameUsuario, Prioridad);
        } else {
            while (true) {
                if (usuarios[hash] == null) {
                    usuarios[hash] = new NodeUser(NameUsuario, Prioridad);
                    break;
                }
                if (capacidad == 200) {
                    break;
                }
                if (hash == 199) {
                    hash = 0;
                } else {
                    hash++;
                }
            }
        }
    }
//cierre del metodo    

    
     /**
     * 
     * Metodo que permite buscar el usuario seleccionado
     * 
     */
    public int BuscarUsuario(String usuario) {

        int hash = calcHash(usuario);
        if (usuarios[hash] == null) {
            return -1;
        } else {
            if (usuarios[hash].NameUsuario.equals(usuario)) {
                return hash;
            } else {
                int cont = 1;
                while (true) {

                    if ((usuarios)[hash].NameUsuario.equals(usuario)) {
                        return hash;
                    } else {
                        if (hash == 199) {
                            hash = 0;
                        } else {
                            hash++;
                        }
                        if (cont == 150) {
                            break;
                        } else {
                            cont++;
                        }
                    }
                }
            }
        }
        return -1;
    }
//cierre del metodo
    
     /**
     * 
     * Metodo que permite eliminar el usuario seleccionado
     * 
     */
    
    public void eliminar(String usuario) {
        int n = BuscarUsuario(usuario);
        if (n != -1) {
            this.usuarios[n] = null;
        }
    }
    //cierre del metodo

     /**
     * 
     * Metodo que permite imprimir 
     * 
     */
    
    public void imprimir() {

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                System.out.println("Nombre de Usuario: " + usuarios[i].getNameUsuario());
                System.out.println("Prioridad: " + usuarios[i].getPrioridad());
                System.out.println("Posicion: " + i);

                for (int j = 0; j < 11; j++) {
                    if (usuarios[i].docs[j] != null) {
                        System.out.println("Documento: " + usuarios[i].docs[j].title);
                    }
                }
            }
        }
    }
    //cierre del metodo

     /**
     * 
     * Metodo que permite insertar el documento deseado
     */
    
    public void insertarDoc(String usuario, String titulo, String size, String tipo, int tiempo) {
        int index = this.BuscarUsuario(usuario);
        NodeDoc d = new NodeDoc(titulo, size, tipo, tiempo);
        this.usuarios[index].insertarDoc(d);
    }
    //cierre del metodo
    
     /**
     * 
     * Metodo que permite eliminar el doc seleccionado
     * 
     */

    public void eliminarDoc(String usuario, String titulo) {
        int index = this.BuscarUsuario(usuario);
        if(index!=-1){
        this.usuarios[index].eliminarDoc(titulo);}
    }
    //cierre del metodo

    
    /**
     * 
     * Metodo que permite imprimir el usuario seleccionado
     * 
     */
    public String imprimirUser(String data) {
        for (int i = 0; i < this.usuarios.length; i++) {
            if (this.usuarios[i] != null) {
                data += "Usuario: "+this.usuarios[i].getNameUsuario() + "\n";
                boolean vacio = true;
                    
                
                for (int j = 0; j < this.usuarios[i].docs.length; j++) {
                    if (this.usuarios[i].docs[j] != null) {
                        if(vacio){
                            data += "Documentos: " + "\n";
                            vacio = false;
                        }
                        data += "   -"+this.usuarios[i].docs[j].title + "\n";

                    }

                }

            }

        }
        return data;
    }
    //cierre del metodo
}
//Cierre de la clase