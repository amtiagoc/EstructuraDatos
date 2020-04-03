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
        try {
            pino.Add(3);
            pino.Add(9);
            pino.Add(6);
            pino.Add(2);
            pino.Add(11);
            pino.Add(1);
            pino.InOrden();
            pino.Delete(3);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");

        pino.InOrden();
        //System.out.println(pino.Search(88));
    }

}
