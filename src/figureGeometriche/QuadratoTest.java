package figureGeometriche;

import java.util.Scanner;
// java é un package dove util è una sottocartella che contiene varie classi
public class QuadratoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // (System.in) non varia è una scritta di sistema
        // sintassi: nome classe, nome dell'oggetto,=, parola chiave per istanziare una classe. 
        float lato;
        // variabili locali
        System.out.print("Inserire il lato :");
        lato = in.nextFloat(); // notazione puntata = metodo
        // assegnazione alle variabili locali i valori interni alla classe
        Quadrato quadrato = new Quadrato (lato);
        // viene istanziato l'oggetto quadrato dalla classe Quadrato
        
        System.out.print("Dati di input  :");
        System.out.println(quadrato.info());
        
        System.out.println("Dati di output         : ");
        System.out.println("area del quadrato      : " + quadrato.calcolaArea());
        System.out.println("perimetro del quadrato : " + quadrato.calcolaPerimetro());
    }
    
}
