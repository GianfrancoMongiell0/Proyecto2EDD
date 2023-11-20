/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import EDD.MonticuloBinario;
import EDD.TablaDispersion;

/**
 *
 * @author gianf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
//    MonticuloBinario pq = new MonticuloBinario(5);
//    pq.insertar(3);
//    pq.insertar(8);
//    pq.insertar(1);
//    pq.insertar(7);
//    pq.insertar(2);
//
//    System.out.println("Elemento minimo: " + pq.extraerMinimo());
//    System.out.println("Elemento minimo: " + pq.extraerMinimo());
//    System.out.println("Elemento minimo: " + pq.extraerMinimo());
//    System.out.println("Elemento minimo: " + pq.extraerMinimo());
//    System.out.println("Elemento minimo: " + pq.extraerMinimo());

        TablaDispersion t = new TablaDispersion();
        t.insertar("Cristian", "Cacao");
        t.insertar("Andres", "Camello");
        t.insertar("Jonathan", "Selva");
        t.insertar("Nicole", "Animal");
        for (int i = 0; i < 200; i++) {
            if (t.usuario[i] != null) {
                System.out.println(t.usuario[i].getNameUsuario());
            }
        }
    }
}
