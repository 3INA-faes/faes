package esercizi.laboratorio;

/**
 * Scrivere una classe e il relativo test con menù che, dato un numero n,
 * preveda due metodi: 1 - crea una stringa con i primi n numeri dispari (for) 2
 * - crea una stringa con i primi n numeri pari (while)
 *
 * @author denni.faes 3INA 2023
 * @version 1.0
 */
public class NumeriPariEDispari {

    private int numero;

    /**
     * Costruttore senza parametri{@link #setNumero(int)}
     */
    public NumeriPariEDispari() {
    }

    /**
     * Costruttore con i parametri
     *
     * @param numero numero
     */
    public NumeriPariEDispari(int numero) {
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
     * Imposta/Modifica il valore del numero
     *
     * @param numero numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Metodo che restituisce un menu
     * 
     * @return 
     */
    public static String menu(){
        String testo;
        testo = "1 - Istanziare costruttore senza parametri" + "\n" +
                "2 - Istanziare costruttore con i parametri" + "\n" +
                "3 - visualizzazione dei primi n numeri pari" + "\n" +
                "4 - visualizzazione dei primi n numeri dispari";
        return testo;
    }

    /**
     * Metodo che resituisce i primi n numeri dispari
     *
     * @return
     */
    public String primiNNumeriDispari() {
        String testo = "I primi n numeri dispari sono: \n";
        int risultato;
        risultato = numero;
        int i = 0;

        if ((numero % 2) == 0) {
            risultato += 1;
            testo = risultato + "\n";
            i++;
        }

        for (i = i; i < numero; i++) {
            risultato += 2;
            testo += risultato + "\n";
        }
        return testo;
    }

    /**
     * Metodo che resituisce i primi n numeri pari
     *
     * @return
     */
    public String primiNNumeriPari() {
        String testo = "I primi n numeri pari sono: \n";
        int risultato;
        risultato = numero;
        int i = 0;

        if ((numero % 2) == 1) {
            risultato += 1;
            testo = risultato + "\n";
            i++;
        }

        while (i < numero) {
            risultato += 2;
            testo += risultato + "\n";
            i++;
        }
        return testo;
    }

    /**
     * Metodo che resituisce i primi n numeri dispari
     *
     * @return
     */
    public String primiNNumeriDispari1() {
        String testo = "I primi n numeri dispari sono: \n";
        int risultato = 1;

        for (int i = 0; i < numero; i++) {
            testo += risultato + "\n";
            risultato += 2;
        }
        return testo;
    }

    /**
     * Metodo che resituisce i primi n numeri pari
     *
     * @return
     */
    public String primiNNumeriPari1() {
        String testo = "I primi n numeri pari sono: \n";
        int risultato = 0;
        int i = 0;
        
        while (i < numero) {
            risultato += 2;
            testo += risultato + "\n";
            i++;
        }
        return testo;
    }
    /**
     * Metodo che restituisce il valore degli attributi
     * 
     * @return 
     */
    public String info() {
        String testo;
        testo = "Il numero è: " + numero;
        return testo;
    }
}
