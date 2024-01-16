package esercizi;

import java.util.Scanner;

public class MeteoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float temperatura;
        
        System.out.print("Inserire il valore della temperatura: ");
        temperatura = in.nextFloat();
        
        Meteo m = new Meteo(temperatura);
        
        System.out.println(m.consiglio1());
        System.out.println(m.consiglio2());
        System.out.println(m.consiglio3());
        System.out.println(m.consiglio4());
    }
    
}
