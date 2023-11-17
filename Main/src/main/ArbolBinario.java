/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Cristian Fazio
 */
public class ArbolBinario {

    private Node Root;

    public Node getRoot() {
        return Root;
    }

    public ArbolBinario() {
        this.Root = null;
    }

    public ArbolBinario(Node raiz) {
        Root = raiz;
    }

    public void InsertarRoot(Object dato) {
        Root = new Node(dato);
    }

    public boolean EsVacio(Node node) {
        return node == null;
    }

    public void InsertarIzq(int padre, int valor) {

        Node temp = Buscar(Root, padre);
        Node hijoIzq = new Node(valor, temp);
        temp.setHijoIzq(hijoIzq);
    }

    public void InsertarDer(int padre, int valor) {
        Node temp = Buscar(Root, padre);
        Node hijoDer = new Node(valor, temp);
        temp.setHijoDer(hijoDer);
    }

    public void Preorden(Node root) {
        if (root != null) {
            System.out.print(root.getDato() + " ");
            Preorden(root.getHijoIzq());
            Preorden(root.getHijoDer());
        }
    }

    public void Posorden(Node root) {
        if (root != null) {
            Posorden(root.getHijoIzq());
            Posorden(root.getHijoDer());
            System.out.print(root.getDato() + " ");
        }
    }

    public void Inorden(Node root) {
        if (root != null) {
            Inorden(root.getHijoIzq());
            System.out.print(root.getDato() + " ");
            Inorden(root.getHijoDer());
        }
    }

    public Node Buscar(Node mynode, int valor) {

        Node buscado = null;
        if (mynode != null && EsVacio(Root) == false) {
            if ((int) mynode.getDato() == valor) {
                return mynode;
            }
            if (mynode.getHijoIzq() != null) {
                buscado = Buscar(mynode.getHijoIzq(), valor);
            }
            if (buscado == null) {
                buscado = Buscar(mynode.getHijoDer(), valor);
            }
            return buscado;
        } else {
            return null;
        }

    }

    public Node Padre(Node mynode, Node root) {
        if (root == null || mynode == null) {
            return null;
        } else if ((root.getHijoDer() != null && root.getHijoDer() == mynode) || (root.getHijoIzq() != null && root.getHijoIzq() == mynode)) {
            return root;
        } else {
            Node encontrado = Padre(mynode, root.getHijoIzq());
            if (encontrado == null) {
                encontrado = Padre(mynode, root.getHijoDer());
            }
            return encontrado;
        }
    }

    public int Size(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(Size(root.getHijoIzq()), Size(root.getHijoDer())) + 1;
    }

    public boolean EsHoja(int num) {
        Node mynode = Buscar(Root, num);
        return mynode.getHijoDer() == null && mynode.getHijoIzq() == null;
    }

    public void Borrar(int num) {
        Node borrar = Buscar(Root, num);
        BorrarNodo(borrar, Root);
    }

    public Node Sucesor(Node mynode) {
        if (mynode.getHijoIzq() != null) {
            return Sucesor(mynode.getHijoIzq());
        } else {
            return mynode;
        }

    }

    public void BorrarNodo(Node aborrar, Node root) {
        Node padre;
        if (!EsVacio(aborrar)) {
            if (aborrar.getHijoIzq() == null) {
                if (aborrar == root) {
                    root = aborrar.getHijoDer();
                } else {
                    padre = Padre(aborrar, root);
                    if (padre.getHijoIzq() == aborrar) {
                        padre.setHijoIzq(aborrar.getHijoDer());
                    } else {
                        padre.setHijoDer(aborrar.getHijoDer());
                    }
                }

            } else {
                if (aborrar.getHijoDer() == null) {
                    if (aborrar == root) {
                        root = aborrar.getHijoIzq();
                    } else {
                        padre = Padre(aborrar, root);
                        if (padre.getHijoIzq() == aborrar) {
                            padre.setHijoIzq((aborrar.getHijoIzq()));
                        } else {
                            padre.setHijoDer(aborrar.getHijoIzq());
                        }
                    }
                } else {
                    Node sucesor = Sucesor(aborrar);
                    padre = Padre(sucesor, Root);
                    if (aborrar == padre) {
                        padre.setHijoDer(sucesor.getHijoDer());
                    } else {
                        padre.setHijoIzq(sucesor.getHijoDer());
                    }
                }
            }
        }
    }
}
