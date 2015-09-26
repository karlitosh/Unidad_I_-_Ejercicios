/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 148
 * * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class DayOfWeek {
    //atributos
    private int day;
    
    //constructor
    public DayOfWeek(){
    }
    
    //metodo set para el dia
    private void setDay(int vday){
        day = vday;
    }
    
    //metodo   que  imprime el dia de la semana
    private String getDay(){
        String cadena=null;
        //por medio de estructura case imprimos el dia        
        if (day==1) cadena="Domingo";
        if (day==2) cadena="Lunes";
        if (day==3) cadena="Martes";
        if (day==4) cadena="Miercoles";
        if (day==5) cadena="Jueves";
        if (day==6) cadena="Viernes";
        if (day==7) cadena="Sabado";
        if (day<1) cadena="Error el dia de la semana sale del rango de 1-7.";
        if (day>7) cadena="Error el dia de la semana sale del rango de 1-7.";
        
        return cadena;    
    }
    
    //metodo principal
    public static void main(String [] args){
        //creando objeto
        DayOfWeek sem = new DayOfWeek();
        
        sem.setDay(5);
        
        System.out.println("El dia de la semana es: " + sem.getDay());
        
    }
    
}
