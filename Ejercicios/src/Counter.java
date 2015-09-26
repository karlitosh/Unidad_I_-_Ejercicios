/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 166 y 167
 * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class Counter {
    private int max_count;
    //constructor
    public Counter(){    
    }
    
    //metodo set para obtener valor maximo
    private void setCount(int vMax_Count){
        max_count = vMax_Count;
    }            
    
    //metodo para desplegar valores del ciclo
    private void displayCount(){
        //declaramos variable
        int i=0;
        
        //inicia el ciclo para impresion de contador
        while (i < max_count){            
            System.out.println("Posicion [" + i + " de " + max_count +"]");
            i++;
        }        
    }
    
    //metodo principal
    public static void main(String [] args){
        //creando el objeto        
       Counter cont = new Counter();
       
       //cargando el valor maximo
       cont.setCount(20);
       
       //desplegando el valor de 0 a max_count
       cont.displayCount();
        
    }
    
}
