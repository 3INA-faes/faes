package verificaN2;

/**
 * Scrivere una classe per la risoluzione di un'equazione di II grado
 * @author denni.faes 3INA
 * @verisione 1.0
 */
public class EquazioneSecondoGrado {
    private float a, b, c;

    /**
     * Costruttore senza parametri <br>
     * {@link #setA(float) }       <br>
     * {@link #setB(float) }       <br>
     * {@link #setC(float) }       <br>
     */
    public EquazioneSecondoGrado() {
    }

    /**
     * Costruttore con i parametri
     * @param a
     * @param b
     * @param c 
     */
    public EquazioneSecondoGrado(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * Restituisce il valore di a
     * @return 
     */
    public float getA() {
        return a;
    }

    /**
     * Modifica/Imposta il valore di a
     * @param a a
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Restituisce il valore di b
     * @return 
     */
    public float getB() {
        return b;
    }

    /**
     * Modifica/Imposta il valore di b
     * @param b b
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Restituisce il valore di c
     * @return 
     */
    public float getC() {
        return c;
    }

    /**
     * Modifica/Imposta il valore di c
     * @param c c
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Metodo che restituisce il valore del delta
     * @return 
     */
    public float delta(){
        float delta;
        delta = (b*b)-4*a*c;
        return delta;
    }

    /**
     * Metodo che restituisce il valore di x1
     * @return 
     */
    public float x1(){
        float x1;
        if (delta() > 0){
            x1 = (float)(-b + Math.sqrt(delta()))/2;
        } else {
            if (delta() == 0){
                x1 = -b/2*a;
            } else {
                x1 = 0;
            }
        }
        return x1;
    }

    /**
     * Metodo che restituisce il valore di x2
     * @return 
     */
    public float x2(){
        float x2;
        if (delta() > 0){
            x2 = (float)(-b - Math.sqrt(delta()))/2;
        } else {
            if (delta() == 0){
                x2 = -b/2*a;
            } else {
                x2 = 0;
            }
        }
        return x2;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String testo;
        testo = "\n" + "Valore di a: " + a +
                "\n" + "Valore di b: " + b +
                "\n" + "Valore di c: " + c;
        return testo;
    }
}
