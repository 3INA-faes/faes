package figureGeometriche;

/**
 * La classe PiramideBaseQuadrata serve per calcolare l'area, la superficie e il volume della piramide a base quadrata
 * @author denni.faes 3INA 2023
 * @version 1.0
 */
public class PiramideBaseQuadrata {
    private float latoBase;
    private float altezza;
    
    private float areaB;
    private float volume;
    
    /**
     * Costruttore senza parametri <br>
     * {@link #setAltezza(float) } <br>
     * {@link #setLatoBase(float)} <br>
     */
    public PiramideBaseQuadrata(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param latoBase
     * @param altezza 
     */
    public PiramideBaseQuadrata (float latoBase,float altezza){
        this.latoBase = latoBase;
        this.altezza = altezza;
    }
    
    /**
     * Restituisce il valore del lato della base
     * @return 
     */
    public String getLatoBase (){
        return ("Il valore del lato della base è : " + latoBase);
    }
    
    /**
     * Imposta/modifica il valore della base del lato
     * @param latoBase latoBase
     */
    public void setLatoBase(float latoBase){
        this.latoBase = latoBase;
    }
    
    /**
     * Restituisce il valore dell'altezza
     * @return 
     */
    public String getAltezza(){ 
        return  ("Il valore dell'altezza è : " + altezza);
    }
    
    /**
     * Imposta/modifica il valore dell'altezza 
     * @param altezza altezza
     */
    public void setAltezza(float altezza){
        this.altezza = altezza;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    public float calcolaAreaBase(){
        areaB = latoBase * latoBase;
        return areaB;
    }
    
    /**
     * Restituisce il valore del Volume
     * @return 
     */
    public float calcolaVolume(){
        volume = areaB * altezza/3;
        return volume;
    }
    
    /**
     * Restituisce il valore della superficie
     * @return 
     */
    public double calcolaSuperficie(){
        double superficieDiBase;
        double superficieLaterale;
        double superficieTotale;
        double apotema;
        float raggioBase;
        raggioBase = latoBase/2;
        apotema = Math.sqrt(altezza*altezza + raggioBase*raggioBase);
        superficieDiBase = 3*volume/altezza;
        superficieLaterale = (4*latoBase)*apotema/2;
        superficieTotale = superficieDiBase + superficieLaterale;
        return superficieTotale;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Il valore del lato della base è : " + latoBase + "\n" +
               "Il valore dell'altezza è : " + altezza;
        return info;
    }
}
