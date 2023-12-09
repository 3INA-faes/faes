package Biglietto;

/**
 * Su una linea ferroviaria, rispetto alla tariffa piena, gli utenti pensionati
 * usufruiscono di uno sconto del 10%, gli studenti del 15% e i disoccupati del
 * 25%. Codificando i pensionati con una P, gli studenti con una S e i disoccupati
 * con una D; scrivere un programma che, richiesto il costo del biglietto e l’eventuale
 * condizione particolare dell’utente, visualizzi l’importo da pagare.
 * @author dennis.faes 3INA 2023
 */
public class BigliettoFerroviario {
    private float tariffa;
    private String condizioneUtente;

    /**
     * Costruttore senza parametri
     * {@link #setTariffa(float) } <br>
     * {@link #setCondizioneUtente(String) } <br>
     */
    public BigliettoFerroviario() {
    }

    /**
     * Costruttore con i parametri
     * @param tariffa
     * @param condizioneUtente 
     */
    public BigliettoFerroviario(float tariffa, String condizioneUtente) {
        this.tariffa = tariffa;
        this.condizioneUtente = condizioneUtente;
    }
    
    /**
     * Metodo che restituisce il valore della tariffa
     * @return 
     */
    public float getTariffa() {
        return tariffa;
    }

    /**
     * Imposta/modifica il valore della tariffa
     * @param tariffa tariffa
     */
    public void setTariffa(float tariffa) {
        this.tariffa = tariffa;
    }

    /**
     * Metodo che restituisce il valore della tariffa
     * @return 
     */
    public String getCondizioneUtente() {
        return condizioneUtente;
    }

    /**
     * Imposta/modifica il valore della tariffa
     * @param condizioneUtente condizioneUtente
     */
    public void setCondizioneUtente(String condizioneUtente) {
        this.condizioneUtente = condizioneUtente;
    }
    
    /**
     * Metodo che restituisce il valore che l'utente dovrà pagare
     * @return 
     */
    public String importo(){
        String i;
        float importo;
        switch (condizioneUtente){
            case "P":
                importo = tariffa-(tariffa*0.10f);
                i = "La tariffa è di: " + importo;
                break;
            case "S": 
                importo = tariffa-(tariffa*0.15f);
                i = "La tariffa è di: " + importo;
                break;
            case "D":
                importo = tariffa-(tariffa*0.25f);
                i = "La tariffa è di: " + importo;
                break;
            case "N":
                importo = tariffa;
                i = "La tariffa è di: " + importo;
                break;
            default:
                i = "Valore inserito non valido";
        }
        return i;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Tariffa: " + tariffa + "\n " +
                "Condizione dell'utente: " + condizioneUtente;
        return info;
    }
}
