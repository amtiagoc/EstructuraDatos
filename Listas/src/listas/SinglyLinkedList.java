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
public class SinglyLinkedList implements Ilist {

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    @Override
    public void add(int d) {
        //crear el nuevo nodo
        //el siguiente del nuevo nodo = cabeza
        //actualizar cabeza = nuevo nodo

        Node newNode = new Node(d);
        newNode.setNextNode(this.head);
        this.head = newNode;

    }

    @Override
    public void addOrdered(int d) {
        /*
        Crear un nodo para el nuevo dato.
        Si la lista esta vacía, o el valor del primer elemento de la lista 
        es mayor que el nuevo, insertar el nuevo nodo en la primera posición 
        de la lista y modificar la cabecera respectivamente.

         */
        Node newNode = new Node(d);
        if (isEmpty() || this.head.getData() > d) {
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
            Node current = this.head;
            while (current.getNextNode() != null && current.getNextNode().getData()<d) {
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
        Node current = this.head;
        while (current != null) {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }

}
