/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_23_sobrecarga;

/**
 *
 * @author bisonte
 */
public class EVA3_23_SOBRECARGA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      imprimir("Hola mundo");
      imprimir("hola", "derek");
      imprimir (1000);
      
      
   }
   
   //SOBRECARGA DE METODOS 
                      //FIRMA
   public static void imprimir(String mensaje){//imprimir (String)
   
      System.out.println(mensaje);
   
   }
   public static void imprimir(String mensaje, String mensaje2){//imprimir (String)
      
      
      System.out.println(mensaje + " - " + mensaje2);
   
   
   
   }
   public static void imprimir(int mensaje){//imprimir (String)
      
      
      System.out.println(mensaje);
   
   
   
   }
}
