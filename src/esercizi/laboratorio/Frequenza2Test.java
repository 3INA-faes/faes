package esercizi.laboratorio;

import java.util.Scanner;
import java.util.Random;

public class Frequenza2Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        
        int tot;
        
        System.out.println("Inserisci il totale dei numeri random");
        tot = in.nextInt();
        
        System.out.println(Frequenza2.frequenze(tot));
    }
    
}
