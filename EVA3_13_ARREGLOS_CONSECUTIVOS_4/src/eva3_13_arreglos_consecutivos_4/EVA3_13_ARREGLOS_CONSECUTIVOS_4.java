/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_arreglos_consecutivos_4;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_ARREGLOS_CONSECUTIVOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
      int estudiante1,estudiante2,estudiante3,asis1 = 0,asis2 = 0,asis3 = 0; 
      int in1 = 0, in2 = 0,in3 = 0;
      int d = 1;
      Scanner captu = new Scanner(System.in);
      
      do {
         for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
            System.out.println("¿El estudiante 1 asistio hoy? 1=Si 0=No");
            estudiante1 = captu.nextInt();
            captu.nextLine();
            System.out.println("¿El estudiante 2 asistio hoy? 1=Si 0=No");
            estudiante2 = captu.nextInt();
            captu.nextLine();
            System.out.println("¿El estudiante 3 asistio hoy? 1=Si 0=No");
            estudiante3 = captu.nextInt();
            captu.nextLine();
            d++;
            
            if (estudiante1 == 1){
            asis1++;
            
            }if (estudiante1 == 0){
            in1++;
            
            }if (estudiante2 == 1){
            asis2++;
            
            }if (estudiante2 == 0){
            in2++;
            
            }if (estudiante3 == 1){
            asis3++;
            
            }if (estudiante3 == 0){
            in3++;
            }
         }
      } while (d <= dias.length);
      
      System.out.println("El estudiante1 asistio " + asis1 + " dias");
      System.out.println("El estudiante1 falto " + in1 + " dias");
      System.out.println("El estudiante2 asistio " + asis2 + " dias");
      System.out.println("El estudiante2 falto " + in2 + " dias");
      System.out.println("El estudiante3 asistio " + asis3 + " dias");
      System.out.println("El estudiante3 falto " + in3  + " dias");
   }
    
}
