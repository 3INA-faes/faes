package operazioniMatematiche;

/**
 * La classe Divisione serve per calcolare la divisione tra due numeri
 * @author denni.faes 3INA 2023
 * @versione
 */
public class Divisione {
    
    private float n1;
    private float n2;
    
    /**
     * Copstruttore senza parametri <br>
     * {@link #setNumero1(float) }  <br>
     * {@link #setNumero2(float) }  <br>
     */
    public Divisione(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param numero1
     * @param numero2 
     */
    public Divisione (float numero1,float numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    /**
     * Restituisce il valore del numero 1
     * @return 
     */
    public String getNumero1(){
        return ( "\n" + "Numero 1 : " + n1);
    }
    
    /**
     * Imposta/modifica il valore del numero 1
     * @param numero1 numero1
     */
    public void setNumero1(float numero1){
        n1 = numero1;
    }
    
    /**
     * Restituisce il valore del numero 2
     * @return 
     */
    public String getNumero2(){
        return ( "\n" + "Numero 2 : " + n2);
    }
    
    /**
     * Imposta/modifica il valore del numero 1
     * @param numero2 numero2
     */
    public void setNumero2(float numero2){
        n2 = numero2;
    }
    
    /**
     * Restituisce il valore della divisione 
     * @return 
     */
    public float esegui(){
        float divisione;
        divisione = n1 / n2 ;
        return divisione;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Numero 1 : " + n1 +
               "\n" + "Numero 2 : " + n2;
        return info;
    }
}
