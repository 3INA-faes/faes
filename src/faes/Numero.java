package faes;

/**
 * Definire una classe Numero di cui si vogliono considerare tre attributi di tipo intero: num1,
 * num2 e num3.
 * Prevedere:
 * a) un metodo per ordinare in ordine crescente i valori di num1, num2 e num3.
 * b) un metodo per ordinare in ordine decrescente i valori di num1, num2 e num3.
 * @author denni.faes 3INA 2023
 * @version 1.0
 */
public class Numero {
    
    private int num1, num2, num3;
    
    /**
     * Costruttore senza parametri <br>
     * {@link #setNum1(int)} <br>
     * {@link #setNum2(int)} <br>
     * {@link #setNum3(int)} <br>
     */
    public Numero(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param num1
     * @param num2
     * @param num3 
     */
    public Numero(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    /**
     * Restituisce il valore di num1
     * @return 
     */
    public int getNum1() {
        return num1;
    }
    
    /**
     * Imposta/modifica il valore di num1
     * @param num1 
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Restituisce il valore di num2
     * @return 
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Imposta/modifica il valore di num1
     * @param num2 
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * Restituisce il valore di num3
     * @return 
     */
    public int getNum3() {
        return num3;
    }

    /**
     * Imposta/modifica il valore di num1
     * @param num3 
     */
    public void setNum3(int num3) {
        this.num3 = num3;
    }
    
    public String ordineCrescente(){
        String ordine;
        if ((num1<=num2)&&(num1<=num3)){
            if (num2<=num3){
                ordine = "Primo numero: " + num1 + "\n" +
                        "Secondo numero: " + num2 + "\n" +
                        "Terzo numero: " + num3;
            } else {
                ordine = "Primo numero: " + num1 + "\n" +
                        "Secondo numero: " + num3 + "\n" +
                        "Terzo numero: " + num2;
            }
        } else if ((num2<=num1)&&(num2<=num3)){
            if (num1<=num3){
                ordine = "Primo numero: " + num2 + "\n" +
                        "Secondo numero: " + num1 + "\n" +
                        "Terzo numero: " + num3;
            } else {
                ordine = "Primo numero: " + num2 + "\n" +
                        "Secondo numero: " + num3 + "\n" +
                        "Terzo numero: " + num1;
            }
        } else {
            if (num1<=num2){
                ordine = "Primo numero: " + num3 + "\n" +
                        "Secondo numero: " + num1 + "\n" +
                        "Terzo numero: " + num2;
            } else {
                ordine = "Primo numero: " + num3 + "\n" +
                        "Secondo numero: " + num2 + "\n" +
                        "Terzo numero: " + num1;
            }
        }
        return ordine;
    }
    /**
     * Metodo che ordina i numeri in ordine decrescente
     * @return 
     */
    public String ordineDecrescente(){
        String ordine;
        if ((num1>=num2)&&(num1>=num3)){
            if (num2>=num3){
                ordine = "Primo numero: " + num1 + "\n" +
                        "Secondo numero: " + num2 + "\n" +
                        "Terzo numero: " + num3;
            } else {
                ordine = "Primo numero: " + num1 + "\n" +
                        "Secondo numero: " + num3 + "\n" +
                        "Terzo numero: " + num2;
            }
        } else if ((num2>=num1)&&(num2>=num3)){
            if (num1>=num3){
                ordine = "Primo numero: " + num2 + "\n" +
                        "Secondo numero: " + num1 + "\n" +
                        "Terzo numero: " + num3;
            } else {
                ordine = "Primo numero: " + num2 + "\n" +
                        "Secondo numero: " + num3 + "\n" +
                        "Terzo numero: " + num1;
            }
        } else {
            if (num1>=num2){
                ordine = "Primo numero: " + num3 + "\n" +
                        "Secondo numero: " + num1 + "\n" +
                        "Terzo numero: " + num2;
            } else {
                ordine = "Primo numero: " + num3 + "\n" +
                        "Secondo numero: " + num2 + "\n" +
                        "Terzo numero: " + num1;
            }
        }
        return ordine;
    }
    
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Il primo numero è: " + num1 + "\n" +
                "Il secondo numero è: " + num2 + "\n" +
                "Il terzo numero è: " + num3;
        return info;
    }
}
