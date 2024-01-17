package esercizi.laboratorio;

import java.util.Scanner;

public class MenuTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        TriangoloGenerico t;
        int valore;
        
        do {
            System.out.println("Menu");
            System.out.println("1 - Costruttore senza parametri");
            System.out.println("2 - Costruttore con i parametri");
            System.out.println("3 - Calcolare il perimetro");
            System.out.println("4 - Per uscire dal menu");
            
            System.out.println("Inserire il valore desiderato: ");
            valore = in.nextInt();
            
            switch (valore){
                case 1:
                    t = new TriangoloGenerico();
                    break;
                case 2:
                    float l1,l2,l3;
                    l1 = in.nextFloat();
                    l2 = in.nextFloat();
                    l3 = in.nextFloat();
                    
                    t = new TriangoloGenerico(l1, l2, l3);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("scelta errata!");
            }
            /*
            if (valore < 1 || valore > 4)
                System.out.println("scelta errata!");
            */     
        } while(valore != 4);
    }
}
