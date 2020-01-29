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
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        SinglyLinkedList miLista = new SinglyLinkedList();
        miLista.addOrdered(99);
        miLista.addOrdered(66);
        miLista.addOrdered(55);
        miLista.addOrdered(88);
        miLista.addOrdered(77);
        miLista.addOrdered(22);
        miLista.addOrdered(44);
                
        System.out.println(miLista.showData());
        
    }
    
}
