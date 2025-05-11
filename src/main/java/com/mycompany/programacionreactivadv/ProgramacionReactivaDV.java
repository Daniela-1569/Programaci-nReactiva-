/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionreactivadv;

import java.util.Observable;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class ProgramacionReactivaDV {

    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de num_1");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de num_2");
        double num2 = scanner.nextDouble();
       System.out.println("Ingrese el valor de num_3");
        double num3 = scanner.nextDouble();
        
        double promedio = DoubleStream.of(num1,num2,num3);
                          .average();
                          .orElse(0.0);
        System.out.println(" El promedio delas 3 notas es:" +promedio);
        scanner.close();
        
        
    
         
         
    }

}
