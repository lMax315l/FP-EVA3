/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_arreglos_consecutivos_2;

/**
 *
 * @author bisonte
 */
public class EVA3_13_ARREGLOS_CONSECUTIVOS_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int may = 0, men = 100;
      int valores[] = new int[10];
      for(int i = 0; i < valores.length; i++){
         valores[i] = (int)(Math.random() * 100);
      }
      for(int i = 0; i < valores.length; i++){
         System.out.print("[" + valores[i] + "]");
         if(valores[i] < men){
            men = valores[i];
         }
         if(valores[i] > may){
            may = valores[i];
         }
      }
      System.out.println("");
      System.out.println("El numero menor del arreglo es: " + men);
      System.out.println("El numero mayor del arreglo es: " + may);
   }
   
}
