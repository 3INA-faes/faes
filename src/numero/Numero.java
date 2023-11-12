package numero;

/**
 * La classe numero serve per fare la differenza tra due numeri interi
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Numero {
    
    private int numero1, numero2;
    
    /**
     * costruttore senza parametri
     * {@link #setNumero1(int)} <br>
     * {@link #setNumero2(int)} <br>
     */
    public Numero (){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param numero1
     * @param numero2 
     */
    public Numero (int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
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
     * Restituisce il valore del secondo numero
     * @return 
     */
    public int getNumero2 (){
        return numero2;
    }
    
    /**
     * Imposta/modifica il valore del secondo numero
     * @param numero2 numero2
     */
    public void setNumero2 (int numero2){
        this.numero2 = numero2;
    }
    
    /**
     * Restituisce la differenza tra primo e secondo numero
     * @return 
     */
    public int differenza(){
        int differenza;
        if(numero1 >= numero2){
            differenza = numero1 - numero2;
        } else {
            differenza = numero2 - numero1;
        }
        return differenza;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Il primo numero è   : " + numero1 + "\n" +
               "Il secondo numero è : " + numero2;
        return info;
    }   
}
