package faes;

import java.util.Scanner;

public class StudenteMatricolaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome1, cognome1, nome2, cognome2;

        System.out.println("Inserire il nome del primo studente: ");
        nome1 = in.next();

        System.out.println("Inserire il cognome del primo studente: ");
        cognome1 = in.next();

        System.out.println("Inserire il nome del secondo studente: ");
        nome2 = in.next();

        System.out.println("Inserire il cognome del secondo studente: ");
        cognome2 = in.next();

        StudenteMatricola s1 = new StudenteMatricola(nome1, cognome1);
        StudenteMatricola s2 = new StudenteMatricola(nome2, cognome2);

        System.out.println(s1.info());
        System.out.println(s2.info());
        
        System.out.println(StudenteMatricola.prossimaMatricola());
        
        System.out.println("Riinserire il nome del primo studente:");
        s1.setNome(in.next());
        System.out.println("Riinserire il cognome del primo studente:");
        s1.setCognome(in.next());
        
        System.out.println(s1.info());
    }

}
