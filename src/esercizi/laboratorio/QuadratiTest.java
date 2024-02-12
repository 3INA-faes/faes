package esercizi.laboratorio;

import java.util.Scanner;

public class QuadratiTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        int menu;
        boolean ciclo = true;
        
        do{
            do{
                System.out.println("Inserire un numero da 1 a 20: ");
                numero = in.nextInt();
            }while ((numero <= 0) || (numero > 20));
        
            Quadrati q = new Quadrati(numero);
        
        
            System.out.println(q.menu());
            menu = in.nextInt();
            
            switch(menu){
            case 1:
                System.out.println(q.quadratiMinoriDiN());
                break;
            case 2:
                System.out.println(q.quadratiMaggioreDiN());
                break;
            case 3:
                ciclo = false;
                break;
            default:
                System.out.println("Il numero non è corretto");
            }
        }while(ciclo);
    }
}
