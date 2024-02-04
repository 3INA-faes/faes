package esercizi.classe;

import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumeroTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        
        int numero;
        int soglia;
        float conto;
        float puntata = 0;
        
        System.out.println("Inserire un conto con cui iniziare: ");
        conto = in.nextFloat();
        
        for(;;){
            System.out.println(IndovinaIlNumero.menu());
            System.out.println("Inserire la soglia desiderata: ");
            soglia = in.nextInt();
            
            System.out.println("Inserire quanto si vuole puntare: ");
            puntata = in.nextFloat();
            
            System.out.println("Inserire il proprio numero fortunato: ");
            numero = in.nextInt();
            
            IndovinaIlNumero i = new IndovinaIlNumero(numero, soglia, puntata, conto);
            
            System.out.println(i.gioco(r.nextInt(soglia)+1));
            
            System.out.println(i.info());
            
            System.out.println("Vuoi continuare?" + "\n" + "1 - sì" + "\n" + "2 - no");
            if (in.nextInt() == 2)
                break;
        }
    }
}
