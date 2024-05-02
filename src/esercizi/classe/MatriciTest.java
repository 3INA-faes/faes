package esercizi.classe;

import java.util.Scanner;

public class MatriciTest {
    public static void main(String[] args) {
      int [] array1 = new int [2], array2 = new int [2];

      Scanner in = new Scanner(System.in);

      for(int i = 0; i < array1.length; i++){
        System.out.println("Inserisci il valore della posizione " + i + " dell'array 1");
        array1[i] = in.nextInt();
      }

      for(int i = 0; i < array2.length; i++){
        System.out.println("Inserisci il valore della posizione " + i + " dell'array 2");
        array2[i] = in.nextInt();
      }

      Matrici matrice = new Matrici();

      matrice.riempiMatriceDoppia(array1, array2);

      System.out.println("Il determinante della matrice è: " + matrice.calcoloDeterminante());
    }
}