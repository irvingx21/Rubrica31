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
        int total = 0;
        System.out.println("hola Github");
        System.out.println("ingrese primer valor");
        int val1=entrada.nextInt();
        System.out.println("ingrese segundo valor");
        int val2=entrada.nextInt();
        System.out.println("ingrese el tipo de operacion \n 1)Suma \n 2)Resta \n 3)Multiplicacion \n 4)Divicion");
        int opcion=entrada.nextInt();
        if (opcion==1) {
            total=val1+val2;
        }
        if (opcion==2) {
           total=val1-val2; 
        }
        if (opcion==3) {
           total=val1*val2; 
        }
        if (opcion==4) {
           total=val1/val2; 
        }
        
        System.out.printf(" el resltado de la operacion es :%d",total);
        
    }
    
}
