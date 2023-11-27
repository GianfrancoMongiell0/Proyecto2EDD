
package EDD;
/**
*
* Esta clase define el monticulo Binario
*
* @autor: Cristian Fazio
*
*/
public class MonticuloBinario {
    // Campos de la clase
    public NodeDoc[] heap;
    private int size;

    public NodeDoc[] getHeap() {
        return heap;
    }

    public void setHeap(NodeDoc[] heap) {
        this.heap = heap;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MonticuloBinario(int capacidad) {
        heap = new NodeDoc[capacidad];
        size = 0;
    }

    public void insertar(NodeDoc valor) {
        if (size == heap.length) {
            return;
        }

        heap[size] = valor;
        ajustarHaciaArriba();
        size++;
    }

    public NodeDoc eliminarMinimo() {
        if (size == 0) {
            return null; // o algún valor que indique error
        }

        NodeDoc minimo = heap[0];
        heap[0] = heap[size - 1];
        size--;
        this.ajustarHaciaAbajo(0);

        return minimo;
    }

    private void ajustarHaciaArriba() {
        int indice = size;
        while (indice > 0 && heap[padre(indice)].etiquetaDeTiempo > heap[indice].etiquetaDeTiempo) {
            intercambiar(indice, padre(indice));
            indice = padre(indice);
        }
    }

    public void ajustarHaciaAbajo(int i) {
        int indice = 0;
        while (tieneHijoIzquierdo(indice)) {
            int indiceHijoMenor = indiceHijoIzquierdo(indice);
            if (tieneHijoDerecho(indice) && heap[indiceHijoDerecho(indice)].etiquetaDeTiempo < heap[indiceHijoMenor].etiquetaDeTiempo) {
                indiceHijoMenor = indiceHijoDerecho(indice);
            }

            if (heap[indice].etiquetaDeTiempo < heap[indiceHijoMenor].etiquetaDeTiempo) {
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

    public int indiceHijoIzquierdo(int indice) {
        return 2 * indice + 1;
    }

    public int indiceHijoDerecho(int indice) {
        return 2 * indice + 2;
    }

    private boolean tieneHijoIzquierdo(int indice) {
        return indiceHijoIzquierdo(indice) < size;
    }

    private boolean tieneHijoDerecho(int indice) {
        return indiceHijoDerecho(indice) < size;
    }

    private void intercambiar(int i, int j) {
        NodeDoc temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    public String imprimir(String cola){
         NodeDoc min = this.eliminarMinimo();
        if(min!= null){ 
                cola += "Documento: " + min.title + " ,  tiempo para imprimise: " + min.etiquetaDeTiempo + "\n";
                cola = imprimir(cola);
                this.insertar(min);
                return cola;
        }
        return cola;
        }
    }
    
