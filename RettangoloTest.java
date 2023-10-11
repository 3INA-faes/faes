package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float base;
        float altezza;
        float area;
        float perimetro;
        
        System.out.print("Inserire la base del rettangolo    :");
        base = in.nextFloat();
        
        System.out.print("Inserire la altezza del rettangolo :");
        altezza = in.nextFloat();
        
        Rettangolo rettangolo = new Rettangolo (base,altezza);
        base                  = rettangolo.b;
        altezza               = rettangolo.h;
        area                  = rettangolo.calcolaArea();
        perimetro             = rettangolo.calcolaPerimetro();
        
        System.out.println("Base      :" + base);
        System.out.println("Altezza   :" + altezza);
        System.out.println("Area      :" + area);
        System.out.println("Perimetro :" + perimetro);
    }
    
}
