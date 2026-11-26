/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA3_2_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int arreglo[],x,y ; //solo arreglo es un arreglo
      //int[] arreglo,x,x//son todos arreglos
      arreglo = new int [10]; // arreglo con 10 enteros
      arreglo[9] = 100;
      //el uso de arreglos va ligado al uso de ciclos.
      //EN PARTICULAR EL CICLO FOR
      for(int i = 0; i<10; i++){
         arreglo[i] = (int) (Math.random() * 100); //casting
      }
       for(int i = 0; i<10; i++){
          System.out.println(arreglo[i]+ " - "); 
       }
      
   }
   
}
