/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

/**
 *
 * @author samaniw
 */
public class BinarySearchTree {

    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int data) {
        root = new BinaryNode(data);
    }

    public void InOrden() {
        InOrden(root);
    }

    private void InOrden(BinaryNode currentRoot) {

        if (currentRoot != null) {
            InOrden(currentRoot.getLeft());
            System.out.print(currentRoot.getData());
            InOrden(currentRoot.getRight());
        }

    }

    public void Add(int data) {
        if (root == null) {
            root = new BinaryNode(data);
        } else {
            //validar si el dato ya existe
            Add(data, root);
        }
    }

    private void Add(int data, BinaryNode currentRoot) {
        if (data < currentRoot.getData()) {
            if (currentRoot.getLeft() == null) {
                currentRoot.setLeft(new BinaryNode(data));
            } else {
                Add(data, currentRoot.getLeft());
            }

        } else if (currentRoot.getRight() == null) {
            currentRoot.setRight(new BinaryNode(data));
        } else {
            Add(data, currentRoot.getRight());
        }
    }

    public boolean Search(int data) {
        return Search(data, root);
    }

    private boolean Search(int data, BinaryNode currentRoot) {
        if (currentRoot == null) {
            return false;
        }
        if (data == currentRoot.getData()) {
            return true;
        }
        if (data < currentRoot.getData()) {
            return Search(data, currentRoot.getLeft());
        } else {
            return Search(data, currentRoot.getRight());
        }
    }
}
