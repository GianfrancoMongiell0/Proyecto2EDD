/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Cristian Fazio
 */
public class Node {
    private Object dato;
    private Node hijoIzq;
    private Node hijoDer;
    private Node padre;

    public Node(Object dato) {
        this.dato = dato;
        hijoIzq=hijoDer=null;
        padre= null;
    }
    
    public Node(Object dato,Node padre) {
        this.dato = dato;
        hijoIzq=hijoDer=null;
        this.padre= padre;
    }
    
    
    public Object getDato() {return dato;}

    public void setDato(Object dato) {this.dato = dato;}

    public Node getHijoIzq() {return hijoIzq;}

    public void setHijoIzq(Node hijoIzq) {this.hijoIzq = hijoIzq;}

    public Node getHijoDer() {return hijoDer;}

    public void setHijoDer(Node hijoDer) {this.hijoDer = hijoDer;}

   public Node getPadre() {return padre;}

   public void setPadre(Node padre) {this.padre = padre;}
    
}
