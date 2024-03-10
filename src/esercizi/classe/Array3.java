package esercizi.classe;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Programma che inserisce dei numeri casuali in un vettore dove i numeri pari 
 * devono essere inseriti a partire dalla prima cella libera da sinistra e 
 * i numeri dispari devono essere inseriti a partire dalla prima cella libera da destra.
 * @author denni.faes 3INA 2023
 * @version 1.0
 */
public class Array3 {
    private static int array[];
    
    public static int[] pariDispari(int num){
        array = new int[num];
        int disp = num-1;
        int pari = 0;
        int ins;
        for (int i = 0; i < array.length; i++){
            ins =(int) (Math.random()*99);
            if(ins%2 == 0){
                array[pari] = ins;
                pari++;
            } else {
                array[disp] = ins;
                disp--;
            }
        }
        return array;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.println("Inserire la grandezza del vettore: ");
        num = in.nextInt();
        
        System.out.println(Arrays.toString(Array3.pariDispari(num)));
    }
}

