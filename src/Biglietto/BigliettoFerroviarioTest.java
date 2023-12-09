package Biglietto;

import java.util.Scanner;

public class BigliettoFerroviarioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float tariffa;
        String condizioneUtente;
        
        System.out.println("Inserire la tariffa del biglietto: ");
        tariffa = in.nextFloat();
        
        System.out.println("Se l'utente é pensionato inserire un (P), se è uno "
                + "studente inserire (S), se é disoccupato inserire (D) e se non"
                + " riguarda queste caratteristiche inserire (N): ");
        in.nextLine();
        condizioneUtente = in.nextLine();
        
        BigliettoFerroviario b = new BigliettoFerroviario(tariffa,condizioneUtente);
        
        System.out.println("Dati di input: " + b.info());
        
        System.out.println(b.importo());
    }
    
}
