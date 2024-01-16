package faes;

import java.util.Scanner;

public class PersonaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nome, cognome, contattoEmail;
        
        System.out.println("Inserire il nome della persona     : ");
        nome = in.nextLine();
        
        System.out.println("Inserire il cognome della persona  : ");
        cognome = in.nextLine();
        
        System.out.println("Inserire il contatto della persona : ");
        contattoEmail = in.nextLine();
        
        Persona p = new Persona(nome, cognome, contattoEmail);
        
        System.out.println("Dati di input sono : ");
        System.out.println(p.info());
        
        System.out.println("Controllo registrazione.....");
        System.out.println(p.registrazioneContatto());
        
        System.out.println("Dati di output sono : ");
        System.out.println(p.info());
    }
    
}
