package esercizi.laboratorio;

import java.util.Scanner;

public class MenuPoligonoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        MenuPoligono m = null;
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
                    m = new MenuPoligono();
                    break;
                case 2:
                    
                    m = new MenuPoligono();
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

