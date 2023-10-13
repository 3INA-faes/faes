package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float base, altezza, area, perimetro;
        
        System.out.print("Inserire la base del rettangolo    : ");
        base = in.nextFloat();
        
        System.out.print("Inserire la altezza del rettangolo : ");
        altezza = in.nextFloat();
        
        Rettangolo rettangolo = new Rettangolo (base,altezza);
        
        System.out.print("Dati di input  :");
        System.out.println(rettangolo.info());
        
        System.out.println("Dati di output : ");
        System.out.print("Area             : " + rettangolo.calcolaArea());
        System.out.print("Perimetro        : " + rettangolo.calcolaPerimetro());
    }
    
}
