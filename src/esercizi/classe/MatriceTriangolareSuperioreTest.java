package esercizi.classe;

import java.util.Scanner;

public class MatriceTriangolareSuperioreTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valore;
        int dimensione;

        System.out.println("Inserisci la dimensione della matrice: ");
        dimensione = in.nextInt();

        MatriceTriangolareSuperiore m = new MatriceTriangolareSuperiore(dimensione);

        for(int i = 0; i < dimensione; i++){
          for(int j = 0; j < dimensione; j++){
            System.out.println("Inserisci il valore della matrice nella riga " + i + " colonna " + j + ": ");
            valore = in.nextInt();
            m.riempi(i, j, valore);
          }
        }

        if(m.isTriangolareSuperiore()){
          System.out.println("La matrice è triangolare superiore");
        }else{
          System.out.println("La matrice non è triangolare superiore");
        }
    }
}
