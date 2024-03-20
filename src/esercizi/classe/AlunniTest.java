package esercizi.classe;

import java.util.Scanner;

public class AlunniTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int size;
        String nomi,cognomi;
        
        System.out.println("Inserire la lunghezza degli array");
        size = Integer.parseInt(in.nextLine());
        
        Alunni a = new Alunni(size);
        
        for(int i = 0; i < size; i++){
            System.out.println("Inserisci nome e cognome: ");
            nomi = in.nextLine();
            cognomi = in.nextLine();
            a.inserisci(nomi, cognomi);
        }
        
        System.out.println("Ricerca nome: ");
        nomi = in.nextLine();
        System.out.println(a.ricercaCognomi(nomi));
        
        System.out.println("Ricerca cognome: ");
        cognomi = in.nextLine();
        System.out.println(a.ricercaNomi(cognomi));
        
    }
    
}
