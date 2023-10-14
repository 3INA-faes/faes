package operazioniMatematiche;

import java.util.Scanner;

public class DivisioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1, n2;
        
        System.out.print("Inserisci il primo numero   : ");
        n1 = in.nextFloat();
        
        System.out.print("Inserisci il secomdo numero : ");
        n2 = in.nextFloat();
        
        Divisione divisione = new Divisione (n1,n2);
        
        System.out.println("Dati di input : ");
        System.out.println(divisione.info());
        
        System.out.println("Dati di output : ");
        System.out.println("divisione      : " + divisione.esegui());
    }
    
}
