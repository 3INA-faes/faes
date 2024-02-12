package esercizi.laboratorio;

/**
 * Classe che, dato un numero intero compreso tra 1 e 20, per tutti gli interi
 * non negativi minori di n, ne restituisca il quadrato.
 *
 * @author denni.faes 3INA 2024
 * @version 1.0
 */
public class Quadrati {

    private int numero;

    /**
     * Costruttore senza parametri
     *
     * {@link #setNumero(int) }
     */
    public Quadrati() {
    }

    /**
     * Costruttore con i parametri
     *
     * @param numero
     */
    public Quadrati(int numero) {
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
     * Modifica/Imposta il valore del numero
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Restituisce i quadrati minori di N
     *
     * @return
     */
    public String quadratiMinoriDiN() {
        String testo = "Numeri" + "\t" + "Quadrato" + "\n";
        int contatore = numero;
        int quadrato;
        while (contatore > 1) {
            contatore--;
            quadrato = contatore * contatore;
            testo += contatore + "\t" + quadrato + "\n";
        }
        return testo;
    }

    /**
     * Restituisce i quadrati maggiori di N
     *
     * @return
     */
    public String quadratiMaggioreDiN() {
        String testo = "Numeri" + "\t" + "Quadrato" + "\n";
        int contatore = numero;
        int quadrato;
        while (contatore < 20) {
            contatore++;
            quadrato = contatore * contatore;
            testo += contatore + "\t" + quadrato + "\n";
        }
        return testo;
    }

    public String menu() {
        String testo;
        testo = "1 - quadrati minori di N" + "\n"
                + "2 - quadrati maggiori di N" + "\n"
                + "3 - esci da programma";
        return testo;
    }

    /**
     * Restituisce il valore degli attributi
     *
     * @return
     */
    public String info() {
        String testo;
        testo = "Numero: " + numero;
        return testo;
    }
}
