/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //int total = 0;
        System.out.println("hola Github");
        System.out.println("ingrese el tipo de operacion \n 1)Suma \n 2)Resta \n 3)Multiplicacion \n 4)Divicion");
        int opcion=entrada.nextInt();
        
        System.out.println("ingrese primer valor");
        int val1=entrada.nextInt();
        
        System.out.println("ingrese segundo valor");
        int val2=entrada.nextInt();
      
        if (opcion==1) {
            suma(val1, val2);
        }
        if (opcion==2) {
            resta(val1, val2);
        }
        if (opcion==3) {
            multiplicacion(val1, val2);
        }
        if (opcion==4) {
            divicion(val1, val2);
        }
        
    }
    public static int suma(int val1,int val2){
        int total=val1+val2;
        mostrar(total);
        return total;
    }
    
    public static int resta(int val1,int val2){
        int total=val1-val2;
        mostrar(total);
        return total;
    }
      
    public static int multiplicacion(int val1,int val2){
        int total=val1*val2;
        mostrar(total);
        return total;
    }
    
    public static int divicion(int val1,int val2){
        int total=val1/val2;
        mostrar(total);
        return total;
    }
    
    public static void mostrar(int total){
        System.out.println(" el resltado de la operacion es : "+total);
    }
}
