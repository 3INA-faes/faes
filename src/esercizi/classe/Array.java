package esercizi.classe;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int num;
        int risultato;
    
        System.out.println("Inserci un numero: ");
        num = in.nextInt();

        int [] array = new int[num]; 
        int j = 0;
    
        for(int i = 0; i < array.length; i++){
            array[i] = j ;
            j += 2;
        }
    
        for(int i = 0; i < num; i += 2){
            System.out.println(array[i]);
        }
        System.out.println("Il prodotto tra il valore con indice 2 e n-1: ");
        risultato = array[2] * array[num-1];
        System.out.println(risultato);

        System.out.println("Il valore minimo dell’array è: " + array[0]);

    }
    
}
