package faes;

import java.util.Scanner;

public class StudenteTest {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        String nome, cognome;
        float voto;
        
        System.out.println("Inserire il nome dello studente: ");
        nome = in.nextLine();
        
        System.out.println("Inserire il cognome dello studente: ");
        cognome = in.nextLine();
        
        System.out.println("Inserire il voto dello studente: ");
        voto = in.nextFloat();
        
        Studente s = new Studente(nome, cognome, voto);
        
        System.out.println("I dati di input sono: ");
        System.out.println(s.info());
        
        System.out.println("L'esito della prova risulta: ");
        System.out.println(s.calcolaEsito());
        
        System.out.println("I dati di output sono: ");
        System.out.println(s.info());
    }
    
}
