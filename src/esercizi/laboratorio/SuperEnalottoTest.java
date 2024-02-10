package esercizi.laboratorio;

import java.util.Scanner;

public class SuperEnalottoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        String tentativo = "";
        String soluzione;

        soluzione = SuperEnalotto.gioco1();
        
        for (int i = 1; i <= 6; i ++){
            System.out.println("Inserire il " + i + "° numero:");
            numero = in.nextInt();
            tentativo += Integer.toString(numero) + "\t";
        }
        
        if (tentativo.equals(soluzione)){
            System.out.println("Hai vinto!!!");
        } else {
            System.out.println("Ritenta non hai vinto");
        }
    }
    
}
