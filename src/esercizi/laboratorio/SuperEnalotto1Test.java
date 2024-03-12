package esercizi.laboratorio;

import java.util.Arrays;
import java.util.Scanner;

public class SuperEnalotto1Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] tentativo = new int[6];
        int y = 1;
        
        for (int i = 0; i < tentativo.length; i++) {
            System.out.println("Inserire il " + y + "° numero:");
            tentativo[i] = in.nextInt();
            y++;
        }
        
        System.out.println(SuperEnalotto1.gioco(tentativo));
    }  
}
