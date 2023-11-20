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

    public NodeUser[] usuario;
    public int capacidad;

    public TablaDispersion() {
        this.usuario = new NodeUser[200];
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
        if (usuario[hash] == null) {
            usuario[hash] = new NodeUser(NameUsuario, Prioridad);
        } else {
            while (true) {
                if (usuario[hash] == null) {
                    usuario[hash] = new NodeUser(NameUsuario, Prioridad);
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
}
