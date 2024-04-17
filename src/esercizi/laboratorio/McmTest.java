package esercizi.laboratorio;

import java.util.Scanner;

public class McmTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lunghezza, num;
        
        System.out.println("Inserisci i numeri di cui si voglia trovare il minimo comune multiplo: ");
        lunghezza = in.nextInt();
        
        Mcm m = new Mcm(lunghezza);
        
        do{
            System.out.println("Inserisci i valori dei numeri: ");
            num = in.nextInt();
        }while(m.riempiVettoreNumeri(num));
        
        System.out.println("Il minimo comune multiplo é : " + m.calcoloMCM());
    }
    
}
