/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Cristian Fazio
 */
public class ArbolNode {
       private int data;
    private ArbolNode left;
    private ArbolNode right;
    
    
    public ArbolNode(int data) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ArbolNode getLeft() {
        return left;
    }

    public void setLeft(ArbolNode left) {
        this.left = left;
    }

    public ArbolNode getRight() {
        return right;
    }

    public void setRight(ArbolNode right) {
        this.right = right;
    }
    
    /**
     * Checks whether a node is leaf or not
     *
     * @return
     */
    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }

    /**
     * Prints the node content
     */
    public void printNode() {
        System.out.println(this.data);
    }
}

