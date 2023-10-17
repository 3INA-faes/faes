package figureGeometriche;

import java.util.Scanner;

public class PiramideBaseQuadrataTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float latoBase;
        float altezza;
        
        System.out.println("Inserire la lunghezza del lato della base della piramide : ");
        latoBase = in.nextFloat();
        
        System.out.println("Inserire l'altezza della piramide : ");
        altezza = in.nextFloat();
        
        PiramideBaseQuadrata piramide = new PiramideBaseQuadrata(latoBase , altezza);
        
        System.out.print("I dati di input sono : " + "\n" + piramide.info());
        
        System.out.println("I dati di output sono : ");
        System.out.println("Il valore dell'area della base della piramide è : " + piramide.calcolaAreaBase());
        System.out.println("Il valore del volume della piramide è : " + piramide.calcolaVolume());
        System.out.println("Il valore della superficie totale della piramide è : " + piramide.calcolaSuperficie());
    }
    
}
