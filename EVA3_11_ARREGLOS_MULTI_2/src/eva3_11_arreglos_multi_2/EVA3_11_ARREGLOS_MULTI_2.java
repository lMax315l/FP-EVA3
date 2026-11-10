/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_arreglos_multi_2;

/**
 *
 * @author Usuario
 */
public class EVA3_11_ARREGLOS_MULTI_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int cubo[][][] = new int[2][3][4];
      
      for(int i = 0; i < cubo.length; i++){
         for(int j = 0; j < cubo[i].length; j++){
            for(int k = 0; k < cubo[i][j].length; k++){
               cubo[i][j][k] = (int)(Math.random() * 100);
            }
         }
      }
      for(int i = 0; i < cubo.length; i++){
         for(int j = 0; j < cubo[i].length; j++){
            for(int k = 0; k < cubo[i][j].length; k++){
               System.out.print("[" + cubo[i][j][k] + "]");
            }
            System.out.println("");
         }
         System.out.println("");
      }
   }
   
}
