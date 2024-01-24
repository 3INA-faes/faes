package esercizi.laboratorio;

import java.util.Random;

public class ProvaRandom {
    
    public static void main(String[] args) {
        Random r = new Random();
        double numero;
        int intero;
        
        /*
        for(int i = 0;i < 10; i++){
            numero = Math.random()*5;
            
            intero = (int)numero;
            
            System.out.println("Numero : " + numero);
            System.out.println(intero);
            //numeri da 0 a 4.9999999
        }
        */
        
        /*
        for(int i = 0;i < 10; i++){
            numero = (Math.random()*5) + 1;
            
            intero = (int)numero;
            
            System.out.println("Numero : " + numero);
            System.out.println(intero);
            //numeri compresi tra 1 e 5.9999999
        }
        */
        
        for(int i = 0;i < 10; i++){
            intero = r.nextInt(5) + 1;
            System.out.println("Numero : " + intero);
        }
    }
}
