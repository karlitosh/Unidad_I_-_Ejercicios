/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 223
 * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class User {
    
    public static void main(String [] args){
        //creando objetos de area
        Area a1 = new Area();
        Area a2 = new Area();
        Area a3 = new Area();
        Area a4 = new Area();
        
        //calculando el area de un circulo
        System.out.println("El área de un circulo de radio 12 es: " + a1.setArea(12));
        
        //calculando el area de un triangulo
        System.out.println("El área de un triángulo de base 8 y altura 12 es: " + a2.setArea(0.5, 8, 15));
        
        //calculando el area de un rectangulo
        System.out.println("El área de un rectángulo de longitud 10 y amplitud 7 es: " + a3.setArea(10, 7));
        
        //calculando el area de un cilindro
        System.out.println("El área de un cílindro de radio 6 y altura 19 es: " + a4.setArea(Math.PI, 6, 19, 0));
    }
}
