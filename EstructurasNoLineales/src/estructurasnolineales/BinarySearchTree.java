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
    private BinaryNode father;
    private boolean position;

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
        } else //validar si el dato ya existe
        {
            if (Search(data) != null) {
                System.out.println("Dato repetido, no se puede insertar");
            } else {
                Add(data, root);

            }
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

    public BinaryNode Search(int data) {
        return Search(data, root);
    }

    private BinaryNode Search(int data, BinaryNode currentRoot) {
        if (currentRoot == null) {
            return null;
        }
        if (data == currentRoot.getData()) {
            return currentRoot;
        }

        father = currentRoot;

        if (data < currentRoot.getData()) {
            position = false;
            return Search(data, currentRoot.getLeft());
        } else {
            position = true;
            return Search(data, currentRoot.getRight());
        }
    }

    public void Delete(int data) {
        if (root == null) {
            System.out.println("Árbol vacío");
        } else {
            Delete(data, root);
        }
    }

    private void Delete(int data, BinaryNode currentRoot) {
        
        BinaryNode v = Search(data);
        if(v.isLeaf()){
            if(position){
                father.setRight(null);
            }else{
                father.setLeft(null);
            }
        }else if(v.hasOneChild()){
            if(v.isChildPosition()){
                father.setRight(v.getRight());
            }else{
                father.setLeft(v.getLeft());
            }
        }else{
            BinaryNode minimum = getMinor(v.getRight());
            Delete(minimum.getData());
            v.setData(minimum.getData());
            //tarea:
            //1)validar el proceso de borrado en un árbol de 8 niveles
            //2)Completar el proceso de borrado para un solo nodo
        }
    }
    
    public BinaryNode getMinor(BinaryNode currentRoot){
        if(currentRoot.getLeft()==null){
            return currentRoot;
        }else{
            return getMinor(currentRoot.getLeft());
        }
    }
}
