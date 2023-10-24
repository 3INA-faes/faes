package figureGeometriche;

/**
 * La classe TriangoloScaleno serve per calcolare il valore del perimetro e dell'area del triangolo scaleno
 * @author denni.faes 3INA 2023
 * @versione 1.0
 */
public class TriangoloScaleno {
    private float l1;
    private float l2;
    private float l3;
    
    /**
     * Costruttore senza parametri <br>
     * {@link #setLato1(float) }   <br>
     * {@link #setLato2(float) }   <br>
     * {@link #setLato3(float) }   <br>
     */
    public TriangoloScaleno (){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param lato1
     * @param lato2
     * @param lato3 
     */
    public TriangoloScaleno(float lato1, float lato2, float lato3){
        l1 = lato1;
        l2 = lato2;
        l3 = lato3;
    }
    
    /**
     * Restituisce il valore del lato 1 del triangolo scaleno
     * @return 
     */
    public String getLato1(){
        return ("\n" + "Primo lato : " + l1);
    }
    
    /**
     * Imposta/modifica ilò valore del lato 1 del Triangolo scaleno
     * @param lato1 lato1
     */
    public void setLato1 (float lato1){
        l1 = lato1;
    }
    
    /**
     * Restituisce il valore del lato 2 del triangolo scaleno
     * @return 
     */
    public String getLato2(){
        return ("\n" + "Secondo lato : " + l2);
    }
    
    /**
     * Imposta/modifica ilò valore del lato 1 del Triangolo scaleno
     * @param lato2 lato2
     */
    public void setLato2 (float lato2){
        l2 = lato2;
    }
    
    /**
     * Restituisce il valore del lato 3 del triangolo scaleno
     * @return 
     */
    public String getLato3(){
        return ("\n" + "Terzo lato : " + l3);
    }
    
    /**
     * Imposta/modifica ilò valore del lato 1 del Triangolo scaleno
     * @param lato3 lato3
     */
    public void setLato3 (float lato3){
        l3 = lato3;
    }
    
    /**
     * Restituisce il valore del perimetro
     * @return 
     */
    public float CalcoloPerimetro(){
        float perimetro;
        perimetro = l1+l2+l3;
        return perimetro;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    public float CalcoloArea(){
        float perimetro;
        perimetro = l1+l2+l3;
        float semiperimetro;
        semiperimetro = perimetro/2;
        float area;
        float contenutoRadice;
        contenutoRadice = (semiperimetro)*(semiperimetro-l1)*(semiperimetro-l2)*(semiperimetro-l3);
        area = (float) Math.sqrt(contenutoRadice);
        return area;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    public String info (){
        String info;
        info = "\n" + "Primo lato :" + l1 +
               "\n" + "Secondo lato :" + l2 +
               "\n" + "Terzo lato :" + l3;
        return info;
    }
}
