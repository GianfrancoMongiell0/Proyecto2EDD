/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

//**
public class MonticuloBinario {
    private int[] heap;
    private int size;

    public MonticuloBinario(int capacidad) {
        heap = new int[capacidad];
        size = 0;
    }

    public void insertar(int valor) {
        if (size == heap.length) {
            System.out.println("El montículo está lleno");
            return;
        }

        heap[size] = valor;
        ajustarHaciaArriba();
        size++;
    }

    public int extraerMinimo() {
        if (size == 0) {
            System.out.println("El montículo está vacío");
            return -1; // o algún valor que indique error
        }

        int minimo = heap[0];
        heap[0] = heap[size - 1];
        size--;
        ajustarHaciaAbajo();

        return minimo;
    }

    private void ajustarHaciaArriba() {
        int indice = size;
        while (indice > 0 && heap[padre(indice)] > heap[indice]) {
            intercambiar(indice, padre(indice));
            indice = padre(indice);
        }
    }

    private void ajustarHaciaAbajo() {
        int indice = 0;
        while (tieneHijoIzquierdo(indice)) {
            int indiceHijoMenor = indiceHijoIzquierdo(indice);
            if (tieneHijoDerecho(indice) && heap[indiceHijoDerecho(indice)] < heap[indiceHijoMenor]) {
                indiceHijoMenor = indiceHijoDerecho(indice);
            }

            if (heap[indice] < heap[indiceHijoMenor]) {
                break;
            } else {
                intercambiar(indice, indiceHijoMenor);
            }

            indice = indiceHijoMenor;
        }
    }

    private int padre(int indice) {
        return (indice - 1) / 2;
    }

    private int indiceHijoIzquierdo(int indice) {
        return 2 * indice + 1;
    }

    private int indiceHijoDerecho(int indice) {
        return 2 * indice + 2;
    }

    private boolean tieneHijoIzquierdo(int indice) {
        return indiceHijoIzquierdo(indice) < size;
    }

    private boolean tieneHijoDerecho(int indice) {
        return indiceHijoDerecho(indice) < size;
    }

    private void intercambiar(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}