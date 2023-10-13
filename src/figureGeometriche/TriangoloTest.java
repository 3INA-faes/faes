package figureGeometriche;

import java.util.Scanner;

public class TriangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float altezza, base, area;
        
        System.out.print("Inserire il valore dell'altezza : ");
        altezza = in.nextFloat();
        
        System.out.print("Inserire il valore dell'base    : ");
        base = in.nextFloat();
        
        Triangolo triangolo = new Triangolo (altezza,base);
        
        System.out.print("Dati di input  : ");
        System.out.println(triangolo.info());
        
        System.out.println("Dati di output : ");
        System.out.println("Area           : " + triangolo.CalcoloArea());
    }
    
}
