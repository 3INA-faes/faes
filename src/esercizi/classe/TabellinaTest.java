package esercizi.classe;

import java.util.Scanner;

public class TabellinaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Inserire il valore del numero: ");
        numero = in.nextInt();
        
        Tabellina t = new Tabellina(numero);
        
        System.out.println(t.tabellina());
        System.out.println(t.numeroCifre());
        System.out.println(t.fattoriale());
    }
}
