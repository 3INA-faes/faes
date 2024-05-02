package esercizi.classe;

public class Matrici{
      private int [][] matrice = new int[2][2];

      public Matrici(){

      }

      public void setMatrice(int [][] matrice){
        this.matrice = matrice;
      }

      public int [][] getMatrice(){
        return this.matrice;
      }

      public void riempiMatriceDoppia(int [] array1, int [] array2){
        for(int i = 0; i < array1.length; i++){
          matrice[0][i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++){
          matrice[1][i] = array2[i];
        }
      }

      public int calcoloDeterminante(){
        int determinante;
        determinante = matrice[0][0] * matrice[1][1] - matrice[0][1] *   matrice[1][0];
        return determinante;
      }
}