package figureGeometriche;

import java.util.Scanner;

public class TriangoloRettangoloTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double base,altezza,lato;
        
        System.out.print("Base    :");
        base    = in.nextDouble();
        
        System.out.print("Altezza :");
        altezza = in.nextDouble();
        
        System.out.print("Lato    :");
        lato    = in.nextDouble();
        
        TriangoloRettangolo t = new TriangoloRettangolo (base, altezza, lato);
        
        System.out.print("Dati di input  :");
        System.out.println(t.info());
        
        System.out.println(t.getAltezza());
        
        t.setAltezza(5.5);
        
        System.out.println(t.getAltezza());
        
        System.out.print("Dati di output :");
        System.out.println(t.info());
        System.out.println("Perimetro :" + t.calcolaPerimetro());
        System.out.println("Area      :" + t.calcolaArea());
    }
    
}
