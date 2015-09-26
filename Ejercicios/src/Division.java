/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 148
 * * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class Division {
    //atributos
    private float num1,num2,num3;
        
    //constructor
    public Division(){
    }
    
    //metodo set
    private void setDivision(float vnum1,float vnum2,float vnum3){
        num1 = vnum1;
        num2 = vnum2;
        num3 = vnum3;
    }
    
    //metodo get
    private String getDivision(){
        //calcular la division
        if (num1==0){
            return "Num1 es 0";
        } else  {            
            if (num2==0){
                return "Num2 es 0";
            } else{
                return "Resultado de dividir " + num3 + "/" + num2 + " es: " + (float)(num3/num2) + "\nResultado de dividir " + num3 + "/" + num1 + " es: " + (float)(num3/num1);
            }
        }
    }
    
    //metodo main
    public static void main(String [] args){        
        //creando nuevo objeto
        Division div = new Division();
        
        //cargando valores
        div.setDivision(100,20,30);
        
        //operacion de division entre 3 numeros
        System.out.println(div.getDivision());
            
    }
}
