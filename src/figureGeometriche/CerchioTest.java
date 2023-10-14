package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float raggio;
        
        System.out.print("Inserire il raggio del cerchio :");
        raggio = in.nextFloat();
        
        Cerchio cerchio = new Cerchio(raggio);
        
        System.out.print("Dati di input  :");
        System.out.println(cerchio.info());
        
        System.out.print("Dati di output :");
        System.out.println("Area         :" + cerchio.calcolaArea());
        System.out.println("Perimetro    :" + cerchio.calcolaPerimetro());
    }
    
}
