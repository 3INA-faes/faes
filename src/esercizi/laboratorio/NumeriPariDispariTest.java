package esercizi.laboratorio;

import java.util.Scanner;

public class NumeriPariDispariTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        int menu;
        
        System.out.print("Inserire il valore del numero: ");
        numero = in.nextInt();

        System.out.println(NumeriPariDispari.menu());
        System.out.print("Inserire il numero della decisione: ");
        menu = in.nextInt();
        
        switch(menu){
            case 1:
                System.out.println(NumeriPariDispari.primiNNumeriPari(numero));
                System.out.println(NumeriPariDispari.primiNNumeriPari1(numero));
                break;
            case 2:
                System.out.println(NumeriPariDispari.primiNNumeriDispari(numero));
                System.out.println(NumeriPariDispari.primiNNumeriDispari1(numero));
                break;
            default:
                System.out.println("Il valore inserito è errato");
        }
    } 
}