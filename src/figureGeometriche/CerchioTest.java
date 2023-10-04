package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float raggio;
        float area;
        float perimetro;
        
        System.out.print("Inserire il raggio del cerchio :");
        raggio = in.nextFloat();
        
        Cerchio cerchio = new Cerchio(raggio);
        
        raggio = cerchio.r;
        area = cerchio.calcolaArea ();
        perimetro = cerchio.calcolaPerimetro();
        
        System.out.println("Raggio    :" + raggio);
        System.out.println("Area      : %.2f/n" + area);
        System.out.println("Perimetro : %.2f/n" + perimetro);
    }
    
}
