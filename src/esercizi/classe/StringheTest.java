package esercizi.classe;

import java.util.Scanner;

public class StringheTest {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   
    String stringa1, stringa2;
    boolean verifica;
   
    Stringhe s = new Stringhe();

    do{
      System.out.print("Inserisci una stringa del primo array: ");
      stringa1 = in.nextLine();
   
      System.out.print("Inserisci una stringa del secondo array: ");
      stringa2 = in.nextLine();

      verifica = s.inserisci(stringa1, stringa2);
     
    }while(verifica);

    System.out.println("C'è una stringa comune? " + s.stringaComune());
    } 
}
