package verificaN2;

import java.util.Scanner;

public class DivisoriMultipliTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta, n = 0, m = 0;
        boolean exit = true;

        do {
            System.out.println(DivisoriMultipli.menu());
            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    DivisoriMultipli d = new DivisoriMultipli();
                    System.out.println("Inserire un numero (n): ");
                    n = in.nextInt();
                    System.out.println("Inserire un numero (m): ");
                    m = in.nextInt();
                    break;
                case 2:
                    System.out.println("I divisori positivi di n sono: " + DivisoriMultipli.numeroDivisori(n));
                    break;
                case 3:
                    System.out.println("Gli m multipli di n sono: " + DivisoriMultipli.sommaMultipli(n, m));
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    System.out.println("Il valore inserito non esiste:");
            }
        } while (exit);

    }

}
