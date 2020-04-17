/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

import java.util.ArrayList;

/**
 *
 * @author samaniw
 */
public class MaxHeap {
    
    private ArrayList<Integer> dataHeap;

    public MaxHeap() {
        dataHeap = new ArrayList<>();
        dataHeap.add(null);
    }
    
    private void swap(int son, int father){
        int temp = getDataHeap().get(son);
        getDataHeap().set(son, getDataHeap().get(father));
        getDataHeap().set(father,temp);        
    }
    
    private int parent(int son){
        return son/2;
    }
    
    public void insert(int element){
        getDataHeap().add(element);
        int i = getDataHeap().size()-1;
        while (i > 1 && getDataHeap().get(parent(i))< getDataHeap().get(i)){
            swap(i,parent(i));
            i = parent(i);
        }


    }

    /**
     * @return the dataHeap
     */
    public ArrayList<Integer> getDataHeap() {
        return dataHeap;
    }

    
}
