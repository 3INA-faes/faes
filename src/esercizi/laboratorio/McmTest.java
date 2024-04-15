package esercizi.laboratorio;

import java.util.Scanner;

public class McmTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Inserire il primo numero: ");
        num1 = in.nextInt();
        
        System.out.println("Inserire il secondo numero: ");
        num2 = in.nextInt();
        
        Mcm m = new Mcm(num1, num2);
        
        System.out.println("Il minimo comune multiplo é : " + m.calcoloMCM());
    }
    
}
