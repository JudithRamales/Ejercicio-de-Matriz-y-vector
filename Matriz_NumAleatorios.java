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
      System.out.println("Ingrese el tamaño de la matriz: ");
      int tam=sc.nextInt();
    
      int [][] Mat= new int [tam][tam]; //Con el valor que se ingreso sera la matriz
       for (int n=0;n<tam; n++){ // Si se cumple "n" es menor al numero que se pido continua dando un numero
        for (int m=0; m<tam; m++){ // Si se cumple "m" es menor al numero que se pido continua dando un numero
            Mat [n][m] =random.nextInt(100); // En los espacio de la matriz imprimira numeros alteatorios del 0-100
        }
    }
       //Impirmir la matriz 
        System.out.println("La matriz es: ");
        for (int n=0; n<tam; n++){
        for (int m=0; m<tam; m++){
            
            System.out.print (" " + Mat[n][m]);
            
        }
        System.out.println(" ");
        }
    }
}
