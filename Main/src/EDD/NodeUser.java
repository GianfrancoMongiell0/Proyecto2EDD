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
        
        private String NameUsuario;
        private String Prioridad;
        
    public NodeUser(String NameUsuario, String Prioridad) {
        this.NameUsuario = NameUsuario;
        this.Prioridad = Prioridad;
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
}
