/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//
//        DoubleNode<Integer> n1 = new DoubleNode<>(55);
//        DoubleNode<Integer> n2 = new DoubleNode<>(66,n1,null);
//        DoubleNode<Integer> n3 = new DoubleNode<>(77,n2,null);
//        n1.setNextNode(n2);
//        n2.setNextNode(n3);
        DoublyLinkedList<Integer> myDoublelist = new DoublyLinkedList<>();
        myDoublelist.addOrdered(66);
        myDoublelist.addOrdered(11);
        myDoublelist.addOrdered(99);
        myDoublelist.addOrdered(33);
        myDoublelist.addOrdered(44);
        myDoublelist.addOrdered(22);
        myDoublelist.addOrdered(101);

        System.out.println(myDoublelist.showData());
        System.out.println(myDoublelist.searchData(77));
        
        
        
        try {
            myDoublelist.deleteLast();
            myDoublelist.deleteLast();
            myDoublelist.delete();
            myDoublelist.deleteLast();
            myDoublelist.deleteLast();
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(myDoublelist.showData());
        System.out.println(myDoublelist.showDataReverse());

//        Node n1 = new Node(55);
//        Node n2 = new Node(66);
//        Node n3 = new Node(77);
//        Node n4 = new Node(88);
//        Node n5 = new Node(99);
//        
//        n1.setNextNode(n2);
//        n2.setNextNode(n3);
//        n3.setNextNode(n4);
//        n4.setNextNode(n5);
        SinglyLinkedList<Integer> miLista = new SinglyLinkedList<>();
        miLista.addOrdered(11);
        miLista.addOrdered(33);
        miLista.addOrdered(4);
        miLista.addOrdered(88);
        miLista.addOrdered(99);
        miLista.addOrdered(22);
        miLista.deletaData(88);
        
        SinglyLinkedList<Integer> miLista2 = new SinglyLinkedList<>();
        miLista2.addOrdered(11);
        miLista2.addOrdered(33);
        miLista2.addOrdered(4);
        miLista2.addOrdered(88);
        miLista2.addOrdered(99);
        miLista2.addOrdered(22);
        miLista2.deletaData(88);
        
        System.out.println("Son iguales?:" + miLista.checkEqualList(miLista2));
        
        SinglyLinkedList<Double> miListica = new SinglyLinkedList<>();
        miListica.addOrdered(1.1);
        miListica.addOrdered(3.3);
        miListica.addOrdered(4.0);
        miListica.addOrdered(8.8);
        miListica.addOrdered(9.9);
        miListica.addOrdered(2.2);
        miListica.addLast(6.6);
        miListica.addLast(7.7);
        
        try {
            miListica.averageList();
         
        }catch(ArithmeticException exA) {
            System.out.println("Error: " + exA.getMessage());
        }
        catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            miListica.deleteLast();
            miListica.deleteLast();
            miListica.deleteLast();
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(miListica.showData());

    }

}
