package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Fazio
 */
public class BST {
      private ArbolNode root;

    public BST() {
        this.root = null;
    }
    
    public BST(ArbolNode node) {
        this.root = node;
    }

    public ArbolNode getRoot() {
        return this.root;
    }

    public void setRoot(ArbolNode root) {
        this.root = root;
    }
    
    public void insert(ArbolNode root, ArbolNode newNode) {
        if (this.root == null) {
            this.root = newNode;
        } else {
            if (newNode.getData() < root.getData()) {
                if (root.getLeft() == null) {
                    root.setLeft(newNode);
                } else {
                    insert(root.getLeft(), newNode);
                }
            } else if (newNode.getData() > root.getData()) {
                if (root.getRight() == null) {
                    root.setRight(newNode);
                } else {
                    insert(root.getRight(), newNode);
                }
            } else {
                System.out.println("El elemento ya se encuentra en el Árbol");
            }
        }
    }
    
    
    public ArbolNode search(ArbolNode aux, int data) {
        if (aux == null) return null;
        
        if (aux.getData() == data) {
            return aux;
        } else if(data < aux.getData()) {
            return search(aux.getLeft(), data);
        } else {
            return search(aux.getRight(), data);
        }
    }
    
    public int getNodeLevel(ArbolNode aux, int data, int level) {
        if (aux == null) return -1;
        
        if (aux.getData() == data) {
            return level;
        } else if (data < aux.getData()) {
            return getNodeLevel(aux.getLeft(), data, level + 1);
        } else {
            return getNodeLevel(aux.getRight(), data, level + 1);
        }
    }
    
    
    public boolean isInTheTree(ArbolNode aux, int data) {
        if (aux == null) return false;
        
        if (aux.getData() == data) 
            return true;
        else
            return (isInTheTree(aux.getLeft(), data) || isInTheTree(aux.getRight(), data));
    }
    
    
    public void inOrder(ArbolNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + ",");
            inOrder(root.getRight());
        }
    }
    
    public void preOrder(ArbolNode root) {
        if (root != null) {
            System.out.print(root.getData() + ",");
            inOrder(root.getLeft());
            inOrder(root.getRight());
        }
    }
    
    public void postOrder(ArbolNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            inOrder(root.getRight());
            System.out.print(root.getData() + ",");
        }
    }
}