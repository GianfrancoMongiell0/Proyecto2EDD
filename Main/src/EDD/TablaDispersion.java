/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Asus
 */
public class TablaDispersion {

    public NodeUser[] usuarios;
    public int capacidad;

    public TablaDispersion() {
        this.usuarios = new NodeUser[200];
        this.capacidad = 0;
    }

    public int calcHash(String usuario) {
        int hash = 0;
        for (int i = 0; i < usuario.length(); i++) {
            hash += (int) usuario.charAt(i) * i;
        }

        hash = hash % 200;
        return hash;
    }

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

    public void eliminar(String usuario){
        int n = BuscarUsuario(usuario);
            if (n != -1) {
                this.usuarios[n] = null;}
   }
}