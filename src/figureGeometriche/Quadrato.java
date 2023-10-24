package figureGeometriche;

/**
 * La classe Quadrato serve per calcolare l'area e il perimetro del quadrato
 * @author denni.faes 3INA 2023
 * @version 1.0
 */
public class Quadrato {
    private float l; // attributo
    
    /**
     * Costruttore senza parametri <br>
     * {@link #setLato(float)}     <br>
     */
    public Quadrato(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param lato 
     */
    public Quadrato (float lato){ // parametro del metodo
        l = lato;
    }
    
    /**
     * Restituisce il valore del lato del quadrato
     * @return 
     */
    public String getLato(){
        return ("\n" + "Lato :" + l);
    }
    
    /**
     * Imposta/modifica il valore del lato del quadrato
     * @param lato lato
     */
    public void setLato (float lato){
        l = lato;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    public float calcolaArea (){
        float area;     // variabile locale
        area = l*l;     // espressione
        return area;
    }
    
    /**
     * Restituisce il valore del perimetro
     * @return 
     */
    public float calcolaPerimetro (){
        float perimetro;
        perimetro = l+l+l+l;
        return perimetro;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "\n" + "Lato :" + l;
        return info;
    }
}