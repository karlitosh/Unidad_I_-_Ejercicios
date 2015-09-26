/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 213
 * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class ShirtTwo {
    //atributos
    private int shirtID = 0;                                 // Default ID for the shirt
    private String description = "-description required-";   // default
    
    // The color codes are R=Red, B=Blue, G=Green, U=Unset
    private char colorCode = 'U';
    private double price = 0.0;                              // Default price for all items
    private int quantityInStock = 0;                         // Default quantity for all items

    //metodo para guardar los valores de tres variables
    public void setShirtInfo(int ID,String desc,double cost){
        shirtID = ID;
        description = desc;
        price = cost;
    }
    
    //metodo para guardar los valores de cuatro variables
    //nota: tiene el mismo nombre que el anterior
    public void setShirtInfo(int ID,String desc,double cost,char color){
        shirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
    }
    
    //metodo para guardar valores de cinco variables
    //nota: tiene el mismo nombre que el anterior
    public void setShirtInfo(int ID,String desc,double cost,char color,int vQ) {
        shirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
        quantityInStock = vQ;
    }
    
    // This method displays the values for an item
    public void display() {
        System.out.print("\t" + shirtID);
        System.out.print("\t\t" + description);
        System.out.print("\t\t" + colorCode);
        System.out.print("\t\t" + price);
        System.out.print("\t\t" + quantityInStock + "\n");
    } // end of display method
        
}
    
    
    

