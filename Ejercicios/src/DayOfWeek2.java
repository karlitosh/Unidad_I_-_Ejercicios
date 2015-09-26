/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 149
 * * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class DayOfWeek2 {
    //atributos
    private int day;
    
    //constructor
    public DayOfWeek2(){
    }
    
    //metodo set para el dia
    private void setDay(int vday){
        day = vday;
    }
    
    //metodo   que  imprime el dia de la semana
    private String getDay(){
        String cadena=null;
        //por medio de estructura case imprimos el dia
        switch(day){
            case 1: cadena="Domingo"; break;
            case 2: cadena="Lunes"; break;
            case 3: cadena="Martes"; break;
            case 4: cadena="Miercoles"; break;
            case 5: cadena="Jueves"; break;
            case 6: cadena="Viernes"; break;
            case 7: cadena="Sabado"; break;
            default: cadena="Error el dia de la semana sale del rango de 1-7."; break;
        }
        return cadena;    
    }
    
    //metodo principal
    public static void main(String [] args){
        //creando objeto
        DayOfWeek2 sem = new DayOfWeek2();
        
        sem.setDay(5);
        
        System.out.println("El dia de la semana es: " + sem.getDay());
        
    }
    
}