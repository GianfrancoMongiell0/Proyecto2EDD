/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import EDD.MonticuloBinario;
import EDD.TablaDispersion;
import Ventana.Ventana1;

/**
 *
 * @author gianf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MonticuloBinario mb = new MonticuloBinario(200);
        TablaDispersion tb = new TablaDispersion();
        Ventana1 ventana  = new Ventana1(mb, tb);
        ventana.setVisible(true);
    }
}
        
    
