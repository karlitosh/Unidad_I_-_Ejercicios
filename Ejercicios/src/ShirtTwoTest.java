/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 215
 * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class ShirtTwoTest {
 
    public static void main (String args[]) {
        //creacion de tres objetos
        ShirtTwo shirtOne = new ShirtTwo();
        ShirtTwo shirtTwo = new ShirtTwo();
        ShirtTwo shirtThree = new ShirtTwo();
        
        //llamando al metodo para cargar valores
        shirtOne.setShirtInfo(100,"Button Down",12.99);
        shirtTwo.setShirtInfo(101,"Long Sleeve Oxford",27.99,'G');
        shirtThree.setShirtInfo(102,"Shirt Sleeve T-Shirt",9.99,'B',50);
        
        //llamando al metodo para imprimir valores
        System.out.print("\tItem ID \tItem description \tColor code \tItem price \tQuantity in stock \n");
        shirtOne.display();
        shirtTwo.display();
        shirtThree.display();
    }
    
}
