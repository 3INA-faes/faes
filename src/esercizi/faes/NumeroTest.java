package faes;

import java.util.Scanner;

public class NumeroTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.println("Inserire il primo numero: ");
        num1 = in.nextInt();
        
        System.out.println("Inserire il secondo numero: ");
        num2 = in.nextInt();
        
        System.out.println("Inserire il terzo numero: ");
        num3 = in.nextInt();
        
        Numero n = new Numero(num1, num2, num3);
        
        System.out.println("Dati di input: ");
        System.out.println(n.info());
        
        System.out.println("Numeri in ordine decrescente: " + n.ordineDecrescente());
        
        System.out.println("Numeri in ordine decrescente: " + n.ordineCrescente());

    }
    
}
