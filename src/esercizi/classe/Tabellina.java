package esercizi.classe;

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
     * Metodo che restituisce il valore delle cifre
     * 
     * @return 
     */
    public String numeroCifre(){
        String testo;
        int i = 0;
        int risultato = numero;
        if (numero == 0){
            testo = "Il numero ha una cifra";
        } else {
            do{
                risultato /= 10;
                i++;
            } while(risultato != 0);
            testo = "Il numero " + numero + " ha " + i + " cifre";
        }
        return testo;
    }
    
    public String fattoriale(){
        String testo;
        int fattoriale = 1;
        if (numero == 0){
            fattoriale = 0;
        } else {
            for (int i = 1; i < (numero + 1); i++){
                fattoriale *= i;
            }
        }
        testo = "Il fattoriale di " + numero + " è " + fattoriale;
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
