package esercizi.classe;

import java.util.Scanner;

public class Array2Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] array = new int[10];
        
        for (int i = 0; i < array.length; i++){
            System.out.println("Inserire un valore: ");
            array[i] = in.nextInt();
        }
        
        Array2 a = new Array2(array);
        
        System.out.println(a.indirizzo());
    }
    
}
