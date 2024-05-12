package esercizi.classe;

/**
 * Scrivere un programma che, data una matrice quadrata di interi, dica all’utente se la matrice è
 * triangolare superiore oppure no. Si ricordi che una matrice quadrata è triangolare superiore se tutti gli 
 * elementi al di sotto della diagonale principale sono uguali a zero.
 * @author denni
 */
public class MatriceTriangolareSuperiore {
    private int [][]  matQuadrata;
    private static int DIM;

    public MatriceTriangolareSuperiore(int dim){
      DIM = dim;
      matQuadrata = new int[DIM][DIM];
    }

    public boolean riempi(int i, int j, int val){
      boolean isValido = false;
      if(i < DIM && j < DIM){
        matQuadrata[i][j] = val;
        isValido = true;
      }
      return isValido;
    }

    public boolean isTriangolareSuperiore(){
      boolean isTriangolareSuperiore = true;
      int r = 0;
      for(int colonna = 0; colonna < DIM; colonna++){
        for(int riga = 1+r; riga < DIM; riga++){
          r++;
          if(matQuadrata[riga][colonna] != 0){
            isTriangolareSuperiore = false;
          }
        }
      }
      return isTriangolareSuperiore;
    }
}

