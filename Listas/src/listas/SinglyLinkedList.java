/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s208e19
 */
public class SinglyLinkedList<T extends Comparable> implements Ilist<T> {

    private Node<T> head;
    private int x;

    public SinglyLinkedList() {
        this.head = null;
    }

    @Override
    public void add(T d) {
        //crear el nuevo nodo
        //el siguiente del nuevo nodo = cabeza
        //actualizar cabeza = nuevo nodo

        Node<T> newNode = new Node<>(d);
        newNode.setNextNode(this.head);
        this.head = newNode;

    }

    @Override
    public void addOrdered(T d) {
        /*
        Crear un nodo para el nuevo dato.
        Si la lista esta vacía, o el valor del primer elemento de la lista 
        es mayor que el nuevo, insertar el nuevo nodo en la primera posición 
        de la lista y modificar la cabecera respectivamente.
        
         */

        Node<T> newNode = new Node<>(d);
        if (isEmpty() || d.compareTo(this.head.getData()) == -1) {
            newNode.setNextNode(this.head);
            this.head = newNode;
        } else {
            /* 
        Si no se cumple el caso anterior, buscar el lugar adecuado 
            para la inserción: recorrer la lista conservando el nodo actual. 
            Inicializar nodo actual con el valor de primera posición, 
            y avanzar mientras el siguiente nodo no sea nulo y el dato 
            que contiene la siguiente posición sea menor o igual que 
            el dato a insertar.

             */
            Node<T> current = this.head;//
            while (current.getNextNode() != null
                    && d.compareTo(current.getNextNode().getData()) == 1) {
                current = current.getNextNode();
            }
            /*
            Con esto se señala al nodo adecuado, 
            a continuación insertar el nuevo nodo a continuación de él.
             */

            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);

        }

    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String showData() {
        String data = "";
        Node<T> current = this.head;
        while (current != null) {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }

    @Override
    public void addLast(T d) {
        if (isEmpty()) {
            add(d);
        } else {
            Node<T> newNode = new Node<>(d);
            Node<T> current = this.head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }

    }

    @Override
    public void delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            this.head = head.getNextNode();
        }
    }

    @Override
    public void deleteLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            Node<T> current = this.head;
            while (current.getNextNode().getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(null);
        }

    }

}
