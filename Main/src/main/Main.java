/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author gianf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario mytree = new ArbolBinario();
        mytree.InsertarRoot(10);
        // inserta a la derecha
        mytree.InsertarDer(10, 16);
        //inserta a la izquierda
        mytree.InsertarIzq(10, 5);
        // como quiero volver a la izquierda del 10 se sustituye el 5 por el 6
        mytree.InsertarIzq(10, 6);
        mytree.Preorden(mytree.getRoot());
    }

}
