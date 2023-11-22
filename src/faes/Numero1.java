package faes;

import java.util.Scanner;

public class Numero1 {

    private int n1;

    public Numero1() {
    }

    public Numero1(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public String positivoNegativoUgualeAZero() {
        String testo = "";
        if (n1 >= 0) {
            if (n1 == 0) {
                testo = "zero";
            } else {
                testo = "positivo";
            }
        } else {
            testo = "negativo";
        }

        return testo;
    }

    public String positivoNegativoUgualeAZero1() {
        String testo;
        if (n1 > 0) {
            testo = "positivo";
        } else if (n1 == 0) {
            testo = "zero";
        } else {
            testo = "negativo";
        }
        return testo;
    }

    public String positivoNegativoUgualeAZero2() {
        String testo;
        if (n1 > 0) {
            testo = "positivo";
        } else if (n1 == 0) {
            testo = "zero";
        } else {
            testo = "negativo";
        }

        return testo;
    }

    public String positivoNegativoUgualeAZero3() {
        String testo = "";
        if (n1 > 0) {
            testo = "positivo";
        }

        if (n1 == 0) {
            testo = "zero";
        }

        if (n1 < 0) {
            testo = "negativo";
        }

        return testo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1;
        
        System.out.println("Inserire un numero: ");
        n1 = in.nextInt();
                
        Numero1 n = new Numero1(n1);
        
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero());
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero1());
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero2());
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero3());
    }
}
