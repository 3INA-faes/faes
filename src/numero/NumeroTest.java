package numero;

import java.util.Scanner;

public class NumeroTest {

    public static void main(String[] args) {
        
        int numero1, numero2;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserire il valore del primo numero: ");
        numero1 = in.nextInt();
        
        System.out.println("Inserire il valore del secondo numero: ");
        numero2 = in.nextInt();
        
        Numero n = new Numero(numero1, numero2);
        
        System.out.println("Dati di input sono: ");
        System.out.println(n.info());
        
        System.out.println("I dati di output sono: ");
        System.out.println("La differenza è: " + n.differenza());
    }
    
}
