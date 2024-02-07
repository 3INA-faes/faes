package esercizi.laboratorio;


/**
 * classe che calcola le frequenze assolute, relative e percentuali con cui
 * sono stati generati casualmente 100000 numeri compresi tra 1 e 9.
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Frequenza2 {
    //ATTRIBUTI
    
    public static String frequenze(int tot){
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0;
        String testo;
        int numero;
        for (int i = 1; i < tot; i++){
            numero =(int) (Math.random()*9)+1;
            switch(numero){
                case 1:
                    num1 ++;
                    break;
                case 2:
                    num2 ++;
                    break;
                case 3:
                    num3 ++;
                    break;
                case 4:
                    num4 ++;
                    break;
                case 5:
                    num5 ++;
                    break;
                case 6:
                    num6 ++;
                    break;
                case 7:
                    num7 ++;
                    break;
                case 8:
                    num8 ++;
                    break;
                case 9:
                    num9 ++;
                    break;
            }  
        }
        /*
        testo += "La frequenza assoluta di 1 è: " + num1 + "\n" +
                "La frequenza relativa di 1 é: " + num1/tot + "\n" +
                "La frequenza percentuale di 1 é: " + (num1/tot)*100 +
                "La frequenza assoluta di 2 è: " + num2 + "\n" +
                "La frequenza relativa di 2 é: " + num2/tot + "\n" +
                "La frequenza percentuale di 2 é: " + (num2/tot)*100 +
                "La frequenza assoluta di 3 è: " + num3 + "\n" +
                "La frequenza relativa di 3 é: " + num3/tot + "\n" +
                "La frequenza percentuale di 3 é: " + (num3/tot)*100 +
                "La frequenza assoluta di 4 è: " + num4 + "\n" +
                "La frequenza relativa di 4 é: " + num4/tot + "\n" +
                "La frequenza percentuale di 4 é: " + (num4/tot)*100 +
                "La frequenza assoluta di 5 è: " + num5 + "\n" +
                "La frequenza relativa di 5 é: " + num5/tot + "\n" +
                "La frequenza percentuale di 5 é: " + (num5/tot)*100 +
                "La frequenza assoluta di 6 è: " + num6 + "\n" +
                "La frequenza relativa di 6 é: " + num6/tot + "\n" +
                "La frequenza percentuale di 6 é: " + (num6/tot)*100 +
                "La frequenza assoluta di 7 è: " + num7 + "\n" +
                "La frequenza relativa di 7 é: " + num7/tot + "\n" +
                "La frequenza percentuale di 7 é: " + (num7/tot)*100 +
                "La frequenza assoluta di 8 è: " + num8 + "\n" +
                "La frequenza relativa di 8 é: " + num8/tot + "\n" +
                "La frequenza percentuale di 8 é: " + (num8/tot)*100 +
                "La frequenza assoluta di 9 è: " + num9 + "\n" +
                "La frequenza relativa di 9 é: " + num9/tot + "\n" +
                "La frequenza percentuale di 9 é: " + (num9/tot)*100;
        */
        
        testo = "Frequenza assoluta: " + "\t" + num1 + "\t" + num2 + "\t" + num3 
                + "\t" + num4 + "\t" + num5 + "\t" + num6 + "\t" + num7 + "\t" + num8 + "\t" + num9 + "\n" + 
                "Frequenza relativa: " + "\t" + (float)num1/tot + "\t" + (float)num2/tot + "\t" 
                + (float)num3/tot + "\t" + (float)num4/tot + "\t" + (float)num5/tot + "\t" +
                (float)num6/tot + "\t" + (float)num7/tot + "\t" + (float)num8/tot + "\t" + (float)num9/tot + "\n" +
                "Frequenza percentuale: " + "\t" + (num1*100)/tot + "\t" + (num2*100)/tot +
                "\t" + (num3*100)/tot + "\t" + (num4*100)/tot + "\t" + (num5*100)/tot +
                "\t" + (num6*100)/tot + "\t" + (num7*100)/tot + "\t" + (num8*100)/tot +
                "\t" + (num9*100)/tot;
        return testo;
    }
}
