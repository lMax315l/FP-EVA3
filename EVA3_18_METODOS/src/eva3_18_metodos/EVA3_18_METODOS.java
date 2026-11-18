/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author bisonte
 */
public class EVA3_18_METODOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      mostrarMensaje("Jola");
      mostrarMensaje("Max Hernandez");
      mostrarMensaje("FUND-PROG");
      mostrarMensaje("ISC");
      int resultado = sumar(10, 20);
      System.out.println("Suma de 10 + 20 = " + resultado); //1
      System.out.println("Suma de 10 + 20 = " + sumar(10, 20)); //2
      sumar(10, 20); //3
   }
   
   public static void mostrarMensaje(String mensaje){
      System.out.println(mensaje);  
   }
   
   public static int sumar(int val1, int val2){
      int resu = val1 + val2;
      return resu;
   }

}
