package esercizi.laboratorio;

import java.util.Scanner;

public class NumeriPariEDispariTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        int menu;
        

        System.out.println(NumeriPariEDispari.menu());
        System.out.print("Inserire il numero della decisione: ");
        menu = in.nextInt();
        
        NumeriPariEDispari n = null;
        switch(menu){
            case 1: 
                n = new NumeriPariEDispari();
                break;
            case 2:     
                System.out.print("Inserire il valore del numero: ");
                numero = in.nextInt();

                n = new NumeriPariEDispari(numero);
            case 3:
                System.out.println(n.primiNNumeriPari());
                System.out.println(n.primiNNumeriPari1());
                break;
            case 4:
                System.out.println(n.primiNNumeriDispari());
                System.out.println(n.primiNNumeriDispari1());
                break;
            default:
                System.out.println("Il valore inserito è errato");
        }
    } 
}
