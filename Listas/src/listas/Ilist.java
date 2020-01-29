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
public interface Ilist {
    
    /*
    *Agregar un dato al inicio
    *@param el dato
    */
    
    public void add(int d);
    
    /*
    *Agregar un dato ordenado de menor a mayor
    *@param el dato
    */
    
    public void addOrdered(int d);
    
    /*
    *Verificar si la lisa esta vacia
    *@return verdadero si esta vacia
    */
    
    public boolean isEmpty();
    
    /*
    *Mostrar todos los datos de la lista
    *@return String con todos los datos
    */
    
    public String showData();           
    
}
