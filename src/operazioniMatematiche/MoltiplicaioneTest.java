package operazioniMatematiche;

import java.util.Scanner;

public class MoltiplicaioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float n1, n2;
        
        System.out.print("inserire il primo numero   : ");
        n1 = in.nextFloat();
        
        System.out.print("inserire il secondo numero : ");
        n2 = in.nextFloat();
        
        Moltiplicazione moltiplicazione = new Moltiplicazione(n1,n2);
        
        System.out.println("Dati di input : ");
        System.out.println(moltiplicazione.info());
        
        System.out.println("Dati di output  : ");
        System.out.println("Moltiplicazione : " + moltiplicazione.esegui());
    }
    
}
