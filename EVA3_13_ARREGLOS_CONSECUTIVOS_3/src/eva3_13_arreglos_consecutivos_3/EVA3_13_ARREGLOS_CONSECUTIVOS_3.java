/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_arreglos_consecutivos_3;

/**
 *
 * @author bisonte
 */
public class EVA3_13_ARREGLOS_CONSECUTIVOS_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int matriz[][] = new int[5][5];
      for(int i = 0; i < matriz.length; i++){
         for(int j = 0; j < matriz[i].length; j++){
            matriz[i][j] = (int)(Math.random() * 10);
            System.out.print("[" + matriz[i][j] + "]");
         }
         System.out.println("");
      }
      System.out.println("Valores inversos");
         for(int i = 4; i >= 0; i--){
            for (int j = 4; j >= 0; j--){
             System.out.print("[" + matriz[i][j] + "]");
            }
         System.out.println("");
      }
   }
}   

