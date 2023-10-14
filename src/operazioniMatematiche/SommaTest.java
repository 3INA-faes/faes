package operazioniMatematiche;

import java.util.Scanner;

public class SommaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
               
        float n1, n2;
        
        System.out.print("Inserire il primo numero   : ");
        n1 = in.nextFloat();
        
        System.out.print("Inserire il secondo numero : ");
        n2 = in.nextFloat();
        
        Somma somma = new Somma (n1,n2);
        
        System.out.println("Dati di input : ");
        System.out.println(somma.info());
        
        System.out.println("Dati di output : ");
        System.out.println("Somma          : " + somma.esegui());
    }
    
}
