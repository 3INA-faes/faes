package esercizi.laboratorio;

import java.util.Scanner;

public class DataTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int giorno, mese, anno, giorno1, mese1, anno1;
        
        Data d = new Data();
        
        do{
            System.out.println("Inserire il giorno: ");
            giorno = in.nextInt();
        
            System.out.println("Inserire il mese: ");
            mese = in.nextInt();
        
            System.out.println("Inserire il anno: ");
            anno = in.nextInt();
        
            Data d1 = new Data(giorno, mese, anno);
            d = d1;

            System.out.println(d1.info());
            
        }while(d.isDataValida() == false);
        
        System.out.println(d.contaGiorni());
    }
    
}
