package faes;

import java.util.Scanner;

public class OrarioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s, m, o, s1, m1, o1;

        System.out.println("Inserire i secondi: ");
        s = in.nextInt();

        System.out.println("Inserire i minuti: ");
        m = in.nextInt();

        System.out.println("Inserire le ore: ");
        o = in.nextInt();

        Orario orario = new Orario(s, m, o);

        System.out.println("L'orario è: " + orario.info());

        System.out.println("I secondi totali sono: " + orario.secondiEquivalenti(s, m, o));
        System.out.println("I minuti totali sono: " + orario.minutiEquivalenti());
        System.out.println("Le ore totali sono: " + orario.oreEquivalenti());

        System.out.println("Inserire i secondi: ");
        s1 = in.nextInt();

        System.out.println("Inserire i minuti: ");
        m1 = in.nextInt();

        System.out.println("Inserire le ore: ");
        o1 = in.nextInt();

        System.out.println("La differenza tra i due orari è " + orario.differenzaSecondi(s1, m1, o1) + " secondo.");
    }

}
