package numero;

/**
 * Scrivere una classe per la risoluzione di una equazione di primo grado del tipo ax = b, sapendo che:
 * se a è maggiore di zero x=b/a;
 * se a e b sono uguali a zero l'equazione è indeterminata;
 * se a è uguale a zero e b è diverso da zero l'equazione è impossibile.
 * @author denni.faes 3INA 2023
 * @version 1.0
 */
public class EquazioneDiPrimoGrado {
    private float a, b, x;
    
    /**
     * Costruttore senza parametri
     * {@link #setA(float) } <br>
     * {@link #setB(float) } <br>
     * {@link #setX(float) } <br>
     */
    public EquazioneDiPrimoGrado(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param a
     * @param b 
     */
    public EquazioneDiPrimoGrado(float a, float b){
        this.a = a;
        this.b = b;
    }

    /**
     * Restituisce il valore di a
     * @return 
     */
    public float getA() {
        return a;
    }

    /**
     * Imposta/Modifica il valore di a 
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
     * Imposta/Modifica il valore di a 
     * @param b b
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Restituisce il valore di x
     * @return 
     */
    public float getX() {
        return x;
    }

    /**
     * Imposta/Modifica il valore di a 
     * @param x x
     */
    public void setX(float x) {
        this.x = x;
    }
    
    /**
     * Metodo che verifica se il valore di x è maggiore,minore o uguale a 0
     * @return 
     */
    public String risoluzioneEquazione(){
        String ris;
        this.x = b/a;
        if (x > 0){
            ris = "La variabile (x) è maggiore di zero: " + x;
        } else if (x == 0){
            ris = "La variabile (x) è uguale a zero: " + x;
        } else {
            ris = "La variabile (x) è minore di zero: " + x;
        }
        return ris;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Valore di a: " + a + "\n" +
                "Valore di b: " + b + "\n" +
                "Valore di x: " + x;
        return info;
    }
    
}
