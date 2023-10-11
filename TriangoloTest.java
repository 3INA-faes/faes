package figureGeometriche;

import java.util.Scanner;

public class TriangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float altezza;
        float base;
        float area;
        
        System.out.print("Inserire il valore dell'altezza :");
        altezza = in.nextFloat();
        
        System.out.print("Inserire il valore dell'base :");
        base = in.nextFloat();
        
        Triangolo triangolo = new Triangolo (altezza,base);
        
        altezza = triangolo.h;
        base = triangolo.b;
        area = triangolo.CalcoloArea();
        
        System.out.println("Altezza :" + altezza);
        System.out.println("Base    :" + base);
        System.out.println("Area    :" + area);
    }
    
}
