/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        int num1, num2, suma;
        System.out.println("Ingrese dos numeros enteros:");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        suma=num1+num2;
        System.out.println("La suma es. "+suma);
        
        
        
    }
    
}
