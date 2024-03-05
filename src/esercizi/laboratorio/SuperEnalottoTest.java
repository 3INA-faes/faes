package esercizi.laboratorio;

import java.util.Arrays;
import java.util.Scanner;

public class SuperEnalottoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] tentativo = new int[6];
        int[] soluzione;

        soluzione = SuperEnalotto.gioco2();
        
        System.out.println(Arrays.toString(soluzione));
        
        for (int i = 0; i < tentativo.length; i++) {
            System.out.println("Inserire il " + i + "° numero:");
            tentativo[i] = in.nextInt();
        }
        
        System.out.println(Arrays.toString(tentativo));
        
        if (Arrays.toString(tentativo).equals(Arrays.toString(soluzione))) {
            System.out.println("Hai vinto!!!");
        } else {
            System.out.println("Ritenta non hai vinto");
        }
    }

}
