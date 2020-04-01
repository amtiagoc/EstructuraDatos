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
public class EstructurasNoLineales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinarySearchTree pino = new BinarySearchTree(8);
        pino.Add(3);
        pino.Add(9);
        pino.Add(2);
        pino.Add(11);
        System.out.println("");
        
        pino.InOrden();
        System.out.println(pino.Search(88));
    }
    
}
