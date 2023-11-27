
package main;

import EDD.MonticuloBinario;
import EDD.TablaDispersion;
import Ventana.Reloj;
import Ventana.Ventana1;

/**
 *
 * @author gianf
 */
public class Main {

    public static void main(String[] args) {

        MonticuloBinario mb = new MonticuloBinario(200);
        TablaDispersion tb = new TablaDispersion();
        Ventana1 ventana  = new Ventana1(mb, tb);
        ventana.setVisible(true);
        Reloj r = new Reloj();
        System.out.println(mb==null);
    }
}
        
    
