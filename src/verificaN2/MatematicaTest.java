package verificaN2;

import java.util.Arrays;
import java.util.Scanner;

public class MatematicaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int dim;

        System.out.println("Inserire il numero di valori di cui si voglia fare il mcm e l'mcd: ");
        dim = in.nextInt();
        if (dim != 0) {
            int[] numeri = new int[dim];

            System.out.println("Inserimento dei numeri decimali: ");
            for (int i = 0; i < numeri.length; i++) {
                System.out.print((i+1) + "° numero: ");
                numeri[i] = in.nextInt();
            }

            System.out.println("Il minimo comune multiplo è: " + Matematica.mcm(numeri));
            System.out.println("Il massimo comune divisore è: " + Matematica.MCD(numeri));
        }

        System.out.println("Inserire il numero di cifre binarie: ");

        dim = in.nextInt();

        int[] bin = new int[dim];

        System.out.println("Inserisci i numeri binari: ");
        for (int i = 0; i < bin.length; i++) {
            System.out.print((i+1) + "° numero binario: ");
            bin[i] = in.nextInt();
        }

        System.out.println("Il numero in decimale é: " + Matematica.convBinToDec(bin));

        int numero;

        System.out.println("Inserire il numero di cui si desidera convertire in binario: ");
        numero = in.nextInt();

        System.out.println("Il numero in binario è: " + Arrays.toString(Matematica.convDecToBin(numero)));
    }

}
