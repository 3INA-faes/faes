package esercizi.laboratorio;

import java.util.Arrays;
import java.util.Scanner;

public class SuperEnalottoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] tentativo = new int[6];
        int [] soluzione;

        soluzione = SuperEnalotto.gioco2();
        
        for (int i = 1; i <= 6; i ++){
            System.out.println("Inserire il " + i + "° numero:");
            tentativo[i] = in.nextInt();
        }
        
        if (tentativo == soluzione){
            System.out.println("Hai vinto!!!");
        } else {
            System.out.println("Ritenta non hai vinto");
        }
    }
    
}
