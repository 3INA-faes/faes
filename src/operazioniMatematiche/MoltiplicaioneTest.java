package operazioniMatematiche;

import java.util.Scanner;

public class MoltiplicaioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float n1;
        float n2;
        float m;
        
        System.out.print("inserire il primo numero :");
        n1 = in.nextFloat();
        
        System.out.print("inserire il secondo numero :");
        n2 = in.nextFloat();
        
        Moltiplicazione moltiplicazione = new Moltiplicazione(n1,n2);
        
        n1 = moltiplicazione.n1;
        n2 = moltiplicazione.n2;
        m = moltiplicazione.esegui();
        
        System.out.println("numero 1        :" + n1);
        System.out.println("numero 2        :" + n2);
        System.out.println("moltiplicazione :" + m);
    }
    
}
