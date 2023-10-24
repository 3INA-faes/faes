package operazioniMatematiche;

public class Moltiplicazione {
    private float n1;
    private float n2;
    
    /**
     * Copstruttore senza parametri <br>
     * {@link #setNumero1(float) }  <br>
     * {@link #setNumero2(float) }  <br>
     */
    public Moltiplicazione(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param numero1
     * @param numero2 
     */
    public Moltiplicazione(float numero1,float numero2){
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
     * Restituisce il valore della moltiplicazione
     * @return 
     */
    public float esegui(){
        float moltiplicazione;
        moltiplicazione = n1*n2;
        return moltiplicazione;
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
