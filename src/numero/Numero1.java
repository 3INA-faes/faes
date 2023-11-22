package numero;

/**
 * Costruire una classe che, dato un numero intero, stabilisca se è pari o dispari e se è maggiore, minore o uguale a 0.
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Numero1 {
    private int numero1;
    
    /**
     * costruttore senza parametri <br>
     * {@link #setNumero1 } <br>
     */
    public Numero1 (){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param numero1 numero1
     */
    public Numero1 (int numero1){
        this.numero1 = numero1;
    }
    
    /**
     * Restituisce il valore del primo numero
     * @return 
     */
    public int getNumero1 (){
        return numero1;
    }
    
    /**
     * Imposta/modifica il valore del primo numero
     * @param numero1 numero1
     */
    public void setNumero1 (int numero1){
        this.numero1 = numero1;
    }
    
    /**
     * Metodo che restituisce come risultato se il numero e pari o è dispari
     * @return 
     */
    public String pariDispari (){
        String risultato;
        int i = numero1%2;
        if (i == 1){
            risultato = "dispari";
        } else {
            risultato = "pari";
        }
        return risultato;
    }
    
    /**
     * Metodo che restituisce come risultato se il numero è maggiore, minore o uguale a 0
     * @return 
     */
    public String maggioreMinoreUgualeAZero (){
        String risultato;
        if (numero1 > 0){
            risultato = "maggiore";
        } else if (numero1 == 0) {
            risultato = "uguale a 0";
        } else {
            risultato = "minore";
        }
        return risultato;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Il valore del primo numero è: " + numero1;
        return info;
    }
    
}
