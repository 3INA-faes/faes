package figureGeometriche;

/**
 * La classe Triangolo serve per calcolare il valore dell'area di un triangolo
 * @author denni.faes 3INA 2023
 * @versione 1.0
 */
public class Triangolo {
    private float h;
    private float b;
    
    /**
     * Costruttore senza parametri <br>
     * {@link #setAltezza(float) } <br>
     * {@link #setBase(float) }    <br>
     */
    public Triangolo(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param altezza
     * @param base 
     */
    public Triangolo (float altezza,float base){
        h = altezza;
        b = base;
    }
    
    /**
     * Restituisce il valore della base del triangolo
     * @return 
     */
    public String getBase(){
        return ("\n" + "Base :" + b);
    }
    
    /**
     * Imposta/modifica il valore della base de4l triangolo
     * @param base base
     */
    public void setBase (float base){
        b = base;
    }
    
    /**
     * Restituisce il valore dell'altezza del triangolo
     * @return 
     */
    public String getAltezza(){
        return ("\n" + "Altezza :" + h);
    }
    
    /**
     * Imposta/modifica il valore dell'altezza del triangolo
     * @param altezza altezza
     */
    public void setAltezza (float altezza){
        h = altezza;
    }
    
    /**
     * Restituisce il valore dell'area del triangolo
     * @return 
     */
    public float CalcoloArea (){
        float area;
        area = (b*h)/2;
        return area;
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
