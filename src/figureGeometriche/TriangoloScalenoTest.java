package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float lato1;
        float lato2;
        float lato3;
        float perimetro;
        float area;
        
        System.out.print("Inserire il primo lato   :");
        lato1 = in.nextFloat();
       
        System.out.print("Inserire il secondo lato :");
        lato2 = in.nextFloat();
        
        System.out.print("Inserire il terzo lato   :");
        lato3 = in.nextFloat();
        
        TriangoloScaleno triangoloS = new TriangoloScaleno (lato1,lato2,lato3);
        
        lato1     = triangoloS.l1;
        lato2     = triangoloS.l2;
        lato3     = triangoloS.l3;
        perimetro = triangoloS.CalcoloPerimetro();
        area      = triangoloS.CalcoloArea();
        
        System.out.println("lato 1    :" + lato1);
        System.out.println("lato 2    :" + lato2);
        System.out.println("lato 3    :" + lato3);
        System.out.println("perimetro :" + perimetro);
        System.out.println("area      :" + area);
    }
}
