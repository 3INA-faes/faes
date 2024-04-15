package esercizi.laboratorio;

import java.util.Scanner;

public class ConvBinToDecTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int bit, lunghezza;
        
        System.out.println("Inserisci il numero bit: ");
        lunghezza = in.nextInt();
        
        ConvBinToDev c = new ConvBinToDev(lunghezza);
        
        System.out.println("Inserisci uno alla volta i bit a partire da sinistra: ");
        
        do{
            bit = in.nextInt();
        }while(c.riempi(bit));
        
        System.out.println("Il valore in decimale è: " + c.conversione());
    }
    
}
