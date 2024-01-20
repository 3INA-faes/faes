package verificaN2;

import java.util.Scanner;

public class PoligonoTest1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        int nLati;
        float lunghezza;
        
        System.out.println("Inserire il valore del numero dei lati:      ");
        nLati = in.nextInt();
        
        System.out.println("Inserire il valore della lunghezza del lato: ");
        lunghezza = in.nextFloat(); 
        
        Poligono p = new Poligono(nLati, lunghezza);
        
        while (p.isPoligono1() == false){
            System.out.println("Il valore di uno dei valori non è corretto");
            
            System.out.println("Rinserire il valore del numero dei lati:      ");
            p.setNLati(in.nextInt());
            
            System.out.println("Rinserire il valore della lunghezza del lato: ");
            p.setLunghezza(in.nextFloat());
        }
        System.out.println("Dati di input: " + p.info());
        
        System.out.println(p.isPoligono());
        System.out.println(p.perimetro());
        */
        
        int nLati = 0;
        float lunghezza = 0;

        Poligono p = new Poligono(nLati, lunghezza);
        
        do {
        System.out.println("Inserire il valore del numero dei lati:      ");
        p.setNLati(in.nextInt());
        
        System.out.println("Inserire il valore della lunghezza del lato: ");
        p.setLunghezza(in.nextFloat());
        
        if (p.isPoligono().equals(false)){
            System.out.println("Dati errati reinserire: ");
        }
        } while (p.isPoligono().equals(false));
        
        System.out.println("Dati di input: " + p.info());
        
        System.out.println(p.isPoligono());
        System.out.println(p.perimetro());
    }
    
}


