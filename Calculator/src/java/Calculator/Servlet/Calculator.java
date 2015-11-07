/*
*Nombre: Calculator.java
*Objetivo: WebServices (GlassFish)
           Formulario html + jsp que calcula las 4 operaciones aritmeticas
           básicas en un Servlet de Java.
*Autor: Ing. Carlos Alberto Cásares Farías
*Fecha: 07/11/2015
 */
package Calculator.Servlet;

/**
 *
 * @author Karlitosh
 */
public class Calculator {
    
    //constructor
    public Calculator (){
    };
    
    //metodo para sumar
    public int sumar(int vA, int vB){
        return vA + vB;
    }
    
    //metodo para restar
    public int restar(int vA, int vB){
        return vA - vB;
    }
    
    //metodo para multiplicar
    public int multiplicar(int vA, int vB){
        return vA * vB;
    }
    
    //metodo para dividir
    public int dividir(int vA, int vB){
        return vA / vB;
    }    
}
