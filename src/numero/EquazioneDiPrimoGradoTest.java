package numero;

import java.util.Scanner;

public class EquazioneDiPrimoGradoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float a, b;
        
        System.out.println("Inserire il valore numerico di a: ");
        a = in.nextFloat();
        
        System.out.println("Inserire il valore b: ");
        b = in.nextFloat();
        
        EquazioneDiPrimoGrado e = new EquazioneDiPrimoGrado(a, b);
        
        System.out.println("Dati di input: ");
        System.out.println(e.info());
        
        System.out.println("Soluzione dell'equazione: "+ e.risoluzioneEquazione());
        
        System.out.println("Dati di output: ");
        System.out.println(e.info());
    }
}
