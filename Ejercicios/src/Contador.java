/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Ejercicio enviado por correo 23-Sept-2015
 * @author carlos alberto cásares farías, juan manuel salazar ochoa, antonio moreno jáuregui
 */
public class Contador {
    //atributos
    private int cont;
    
    //constructor
    public Contador(){
    }
    
    //metodo para asignar valor
    private void setContador(int vCont){
        if (vCont < 0){
            System.out.println("El contador es un número negativo [" + vCont + "], se inicializará en cero.");
            cont = 0;
        }
        if (vCont >= 0){
            cont = vCont;
        }
    }
    
    //metodo para desplegar el contador
    private void getContador(){
         for (int i=0; i<cont; i++)
            System.out.println("Posicion [" + i + " de " + cont +"]");
         if (cont==0)
             System.out.println("El contador es cero.");
    }
    
    //metodo para incrementar el conbtador en 1
    private int incContador(){        
        cont++;
        return cont;
    }
    
    //metodo para decrementar el conbtador en 1
    private int decContador(){        
        cont--;
        if (cont < 0)
            cont = 0;
        return cont;
    }
    
    //display valor del contador
    public void displayContador(){
       System.out.println("El valor del contador es: [ " + cont + "]"); 
    }          
    
    //metodo principal
    public static void main(String [] args){
        
        //creando el objeto contador
        Contador conta = new Contador();        
        Contador conta2 = new Contador();
        
        //pasando los valores del contador a la copia del objeto        
        conta2 = conta;
        
        //cargando el valor del contador
        conta.setContador(15);
        
        //obteniendo la immpresion del contador
        conta.getContador();
        
        //pasando los valores del contador a la copia del objeto
        //NOTA: SI NO ASIGNAMOS EL CONTENIDO DEL OBJETO PRINCIPAL A LA COPIA
        //      SE INICIALIZA EL CONTADOR, POR DEFAULT TOMA VALORES DE 0
        conta2 = conta;
        
        //incrementar el contador
        conta.displayContador();
        System.out.println("Se incrementará el valor del contador"); 
        conta.incContador();        
        conta.displayContador();
        
        //decrementar el contador
        conta2.displayContador();
        System.out.println("Se decrementará el valor del contador"); 
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();
        conta2.decContador();   //valor del contador a cero
        conta2.decContador();   //valor del contador -1
        conta2.displayContador();
        
        //obteniendo la immpresion del contador
        //del segundo objeto
        conta2.getContador();        
       
    }
}
