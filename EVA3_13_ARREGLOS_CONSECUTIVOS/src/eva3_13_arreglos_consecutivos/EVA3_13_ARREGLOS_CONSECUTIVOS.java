/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_arreglos_consecutivos;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_ARREGLOS_CONSECUTIVOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int val;
      int contador = 0;
      int valores[] = new int[10];
      for(int i = 0; i < valores.length; i++){
         valores[i] = (int)(Math.random() * 9);
      }
      for(int i = 0; i < valores.length; i++){
         System.out.print("[" + valores[i] + "]");
      }
      System.out.println("");
      System.out.println("Escribe un valor del 0 al 9");
      val = captu.nextInt();
      for(int i = 0; i < valores.length; i++){
         if(val == valores[i]){
            contador++;
            
         }
      }
      System.out.println("Tu valor se repite " + contador + " veces");
   }
   
}
