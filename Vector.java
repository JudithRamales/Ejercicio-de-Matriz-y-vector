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
public class Vector {
    public void NumAleatorios_vectores(){
          
      Random random= new Random();
      Scanner sc=new Scanner (System.in);
     
      System.out.println("Ingrese el tamaño del vector: ");
      int tam=sc.nextInt();
      int suma=0;
      int[] Mat = new int[tam];
		llenaVector(Mat);
		imprimeVector(Mat);
	}
        
        public static int[] llenaVector(int[] Mat){
		for(int i=0;i<Mat.length;i++){ //// Si se cumple "i" es menor al número que se pido continua dando un número para la matriz
                Mat[i] = new Random().nextInt(200-100+1)+100; //Para el rango entre 100-200
                // Basado en return new Random().ints(min, max + 1)
               }
		return Mat;
	}
	public static void imprimeVector(int[] Mat){
		System.out.println("Imprimiendo vector....");
		for(int i=0;i<Mat.length;i++){                     
                System.out.print(Mat[i]+" ");
		}
                //Operacion para la suma del vector 
                int suma=0;
                for(int i=0;i<Mat.length;i++){  
                suma+=Mat[i];
                }
                System.out.println(" ");
                System.out.println("La suma de los números es: "+ suma);
        System.out.println(" ");
	}    
}


