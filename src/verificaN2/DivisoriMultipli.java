package verificaN2;

/**
 * Implementare una classe che abbia i seguenti metodi statici: - dato un numero
 * intero n, calcolare il numero dei suoi divisori positivi. (while) - dato un
 * numero intero n, calcolare la somma dei primi m multipli di n. (for) Fare una
 * classe test che preveda un menù per l’utilizzo della suddetta classe.
 *
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class DivisoriMultipli {
    /**
     * costruttore senza parametri
     * {@link #setM(int) }
     * {@link #setN(int) }
     */
    public DivisoriMultipli() {
    }
    
    /**
     * Metodo che restituisce il numero dei divisori positivi di un numero
     * @param n
     * @return 
     */
    public static int numeroDivisori(int n) {
        int numDiv = 0;
        int i = 0;
        while (i <= n) {
            i++;
            if (n % i == 0) {
                numDiv++;
            }
        }
        return numDiv;
    }

    /**
     * Metodo che restittuisce il valore della somma dei multipli dei primi m
     * multipli di n
     * @param n
     * @param m
     * @return 
     */
    public static int sommaMultipli(int n, int m) {
        int somma = 0;
        int y = 2;
        for (int i = 0; i < m; i++) {
            somma += n * y;
            y++;
        }
        return somma;
    }

    /**
     * Metodo che ha funzione di Menu a tendina
     *
     * @return testo
     */
    public static String menu() {
        String testo = "Menu:" + "\n"
                + "Premere 1 per --> Inserire i valori alle variabili;" + "\n"
                + "Premere 2 per --> Sapere i divisori positivi del numero;" + "\n"
                + "Premere 3 per --> Sapere la somma dei primi m multipli del numero;" + "\n"
                + "Premere 4 per --> Uscire dal programma.";
        return testo;
    }
}
