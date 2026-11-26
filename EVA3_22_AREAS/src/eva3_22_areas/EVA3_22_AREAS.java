/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_22_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        System.out.println("dime el radio del ciruclo");
        double radio = captu.nextDouble();
        Double areaCir = areaCirculo(radio);
        System.out.println("el area del circulo es = " + areaCir );
        
        System.out.println("dime la base del rectangulo" );
        double baseRec = captu.nextDouble();
        System.out.println("dime la altura del rectangulo");
        double alturaRec = captu.nextDouble();
        double areaRec = areaRectangulo(baseRec, alturaRec);
        System.out.println("el area del rectangulo es = " + areaRec);
        
        System.out.println("dime la base del triangulo" );
        double baseTri = captu.nextDouble();
        System.out.println("dime la altura del triangulo");
        double alturaTri = captu.nextDouble();
        double areaTri = areaTriangulo(baseTri, alturaTri);
         System.out.println("el area del rectangulo es = " + areaTri );
        
        
    }
    public static double areaCirculo(double radio){
        double area = radio * radio * 3.1416;
        return(area);
    }
    public static double areaRectangulo(double baseRec, double alturaRec ){
        double area = baseRec * alturaRec;
        return(area);
    }
    public static double areaTriangulo(double baseTri, double alturaTri ){
        double area = (baseTri * alturaTri) / 2;
        return(area);
    }    
    
    
}
