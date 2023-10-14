package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float lato1, lato2, lato3;
        
        System.out.print("Inserire il primo lato   : ");
        lato1 = in.nextFloat();
       
        System.out.print("Inserire il secondo lato : ");
        lato2 = in.nextFloat();
        
        System.out.print("Inserire il terzo lato   : ");
        lato3 = in.nextFloat();
        
        TriangoloScaleno triangoloS = new TriangoloScaleno (lato1,lato2,lato3);
        
        System.out.print("Dati di input  : ");
        System.out.println(triangoloS.info());
        
        System.out.println("Dati di output : ");
        System.out.println("perimetro      : " + triangoloS.CalcoloPerimetro());
        System.out.println("area           : " + triangoloS.CalcoloArea());
    }
}
