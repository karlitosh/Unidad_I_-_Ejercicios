

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Diapo 97
 * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class Temperature {
    //atributo
    private float gradosF;
    
    //constructor
    public Temperature(){
    }
    
    //metodo convierte grados
    public float calculateCelsius(float vGrados){
        gradosF = (((vGrados * 9) / 5) + 32);
        return gradosF;
    }
    
    //metodo set
    public void setCalculateFarenheit(){
        System.out.println("Grados Farenheith: " + gradosF);
    }
    
    public static void main(String[] args){
        //creando objeto
        Temperature tmp = new Temperature();
        
        System.out.println("Covertir grados Celsius a Grados Farenheith. \nGrados Celcius: 74");
        
        tmp.calculateCelsius(74);
        tmp.setCalculateFarenheit();
    }    
    
}
