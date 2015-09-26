/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Diapo 223
 * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class Area {
    //atributos
    private double longitud=0.0;
    private double altura=0.0;
    private double base=0.0;
    private double radio=0.0;
    private double amplitud=0.0;
    
    //primer metodo de area para el circulo
    public double setArea(double vRadio){
        radio = vRadio;
        return (Math.PI * (radio * radio));
    }
    
    //segundo metodo de area para el triangulo
    public double setArea(double vMedia,double vBase,double vAltura){        
        base = vBase;
        altura = vAltura;
        double media = vMedia;
        return ((base * altura) / 2);
    }
    
    //tercer metodo de area para el rectangulo
    public double setArea(double vLongitud,double vAmplitud){
        longitud = vLongitud;
        amplitud = vAmplitud;
        return (longitud * amplitud);
    }
    
    //cuarto metodo de area para el cilindro
    public double setArea(double vPi,double vRadio,double vAltura,double vVar){
        double pi = vPi;
        radio = vRadio;
        altura = vAltura;
        return (pi * ((radio * radio) * altura));
    }
}
