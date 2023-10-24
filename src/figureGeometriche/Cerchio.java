package figureGeometriche;

/**
 * La classe Cerchio serve per calcolare l'area ed il perimetro di un cerchio
 * @author denni.faes 3INA 2023
 * @version 1.0
 */

public class Cerchio {
    private float r;
    
    /**
     * Custruttore senza parametri <br>
     * {@link #setRaggio(float)}   <br>
     */
    public Cerchio (){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param raggio 
     */
    public Cerchio (float raggio){
        r = raggio;
    }
    
    /**
     * Restituisce il valore del raggio
     * @return 
     */
    public String getRaggio(){
        return("Raggio :" + r);
    }
    
    /**
     * imposta/modifica il valore del raggio
     * @param raggio raggio
     */
    public void setRaggio(float raggio){
        r = raggio;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    public float calcolaArea (){
        float area;
        area = 3.14f*(r*r);
        return area;
    }
    
    /**
     * Restituisce il valore del perimetro
     * @return 
     */
    public float calcolaPerimetro (){ //funzione per calcolare perimetro
        float perimetro;
        perimetro = 3.14f*(r*2);
        return perimetro;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info (){
        String informazioni;
        informazioni = "\n" +"Raggio: " + r;
        return informazioni;
    }
}
