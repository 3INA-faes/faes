package figureGeometriche;

/**
 * La classe Rettangolo serve per calcolare l'area e il perimetro del rettangolo
 * @author denni.faes 3INA 2023
 * @versione 1.0
 */
public class Rettangolo {
    private float b;
    private float h;
    
    /**
     * Costruttore senza parametri  <br>
     * {@link #setAltezza(float) }  <br>
     * {@link #setBase(float) }     <br>
     */
    public Rettangolo(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param base
     * @param altezza 
     */
    public Rettangolo (float base,float altezza){
        b = base;
        h = altezza;
    }
    
    /**
     * Restituisce il valore della base del rettangolo
     * @return 
     */
    public String getBase(){
        return ("\n" + "Base :" + b);
    }
    
    /**
     * Imposta/modifica il valore della base del rettangolo
     * @param base base
     */
    public void setBase (float base){
        b = base;
    }
    
    /**
     * Restituisce il valore dell'altezza del rettangolo
     * @return 
     */
    public String getAltezza(){
        return ("\n" + "Altezza :" + h);
    }
    
    /**
     * Imposta/modifica il valore dell'altezza del rettangolo
     * @param altezza altezza
     */
    public void setAltezza (float altezza){
        h = altezza;
    }
    
    /**
     * Restituisce il valore dell'area del rettangolo
     * @return 
     */
    public float calcolaArea (){
        float area;
        area = b*h;
        return area;
    }
    
    /**
     * Restituisce il valore del perimetro del rettangolo
     * @return 
     */
     public float calcolaPerimetro (){
        float perimetro;
        perimetro = (b*2)+(h*2);
        return perimetro;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "\n" + "Base :" + b +
               "\n" + "Altezza :" + h;
        return info;
    }
}
