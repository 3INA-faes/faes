package esercizi;

/**
 * Data la  classe Numero prevedere un metodo che restituisca la tabellina di un
 * numero.
 * @author denni.faes 3INA
 * @version 1.0
 */
public class Tabellina {
    private int numero;

    /**
     * Costruttore senza parametri 
     * {@link #setNumero(int)}
     */
    public Tabellina() {
    }

    /**
     * Costruttore con i parametri
     *
     * @param numero
     */
    public Tabellina(int numero) {
        this.numero = numero;
    }

    /**
     * Restituisce il valore del numero
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Imposta/ Modifica il valore del numero
     *
     * @param numero numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Metodo che restituisce la tabellina del numero inserito
     * 
     * @return 
     */
    public String tabellina(){
        String testo = "";
        int i = 1;
        int risultato ;
        while(i<11){
            risultato = numero * i;
            testo +=  numero + "*" + i + " è uguale a " + risultato + "\n";
            i++;
        }
        return testo;
    }
    
    /**
     * Restituisce il valore degli attributi
     *
     * @return String
     */
    public String info() {
        String testo;
        testo = "il numero è: " + numero;
        return testo;
    }
}
