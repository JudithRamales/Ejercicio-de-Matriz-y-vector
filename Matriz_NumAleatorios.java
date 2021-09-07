/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Judith Ramales
 */
public class Matriz_NumAleatorios {
      public void Numeros_Aleatorios(){
          
      Random random= new Random();
      Scanner sc=new Scanner (System.in);
      System.out.println("Ingrese el tamaño de N: ");
      int n=sc.nextInt();
      System.out.println("Ingrese el tamaño de M: ");
      int m=sc.nextInt();
      
      int [][] Mat= new int [n][m]; //Con el valor que se ingreso sera la matriz
       for (int i=0;i<Mat.length; i++){ // Si se cumple "i" es menor al numero que se pido continua dando un numero
        for (int j=0;j<Mat.length; j++){ // Si se cumple "j" es menor al numero que se pido continua dando un numero
            Mat [i][j] =random.nextInt(100); // En los espacio de la matriz imprimira numeros alteatorios del 0-100
        }
    }
       //Impirmir la matriz 
        System.out.println("La matriz es: ");
        for (int i=0;i<Mat.length; i++){ // Si se cumple "i" es menor al numero que se pido continua dando un numero
        for (int j=0;j<Mat.length; j++){ // Si se cumple "j" es menor al numero que se pido continua dando un numero
            System.out.print (" " + Mat[i][j]);
            
        }
        System.out.println(" ");
        }
    }
}
