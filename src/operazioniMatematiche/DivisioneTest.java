package operazioniMatematiche;

import java.util.Scanner;

public class DivisioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1;
        float n2;
        float d;
        
        System.out.print("Inserisci il primo numero   :");
        n1 = in.nextFloat();
        
        System.out.print("Inserisci il secomdo numero :");
        n2 = in.nextFloat();
        
        Divisione divisione = new Divisione (n1,n2);
        
        n1 = divisione.n1;
        n2 = divisione.n2;
        d = divisione.esegui();
        
        System.out.println("numero1   :" + n1);
        System.out.println("numero2   :" + n2);
        System.out.println("divisione :" + d);
    }
    
}
