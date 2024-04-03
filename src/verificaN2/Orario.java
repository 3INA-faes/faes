package verificaN2;

import java.time.LocalTime;

/**
 * Progettare, implementare e curare la documentazione di una classe che, dato
 * un orario composto da ore, minuti e secondi, preveda metodi, oltre quelli di
 * default, per effettuare le seguenti operazioni: - secondi equivalenti; -
 * minuti equivalenti; - ore equivalenti; - differenza in secondi con un altro
 * orario.
 *
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Orario {
    LocalTime l = LocalTime.now();

    private int s, m, o;

    /**
     * costruttore senza parametri null null     {@link #setS(int) }
     * {@link #setM(int) }
     * {@link #setO(int) }
     */
    public Orario() {
        s = l.getSecond();
        m = l.getMinute();
        o = l.getHour();
    }

    /**
     * Costruttore con i parametri
     *
     * @param s s
     * @param m m
     * @param o o
     */
    public Orario(int s, int m, int o) {
        setS(s); //this.s = s;
        setM(m); //this.m = m;
        setO(o); //this.o = o;
    }

    /**
     * Restituisce il valore di s
     *
     * @return s
     */
    public int getS() {
        return s;
    }

    /**
     * Imposta/modifica il valore di s
     *
     * @param s s
     */
    public void setS(int s) {
        if(isValido())
            this.s = s;
    }

    /**
     * Restituisce il valore di m
     *
     * @return m
     */
    public int getM() {
        return m;
    }

    /**
     * Imposta/modifica il valore di m
     *
     * @param m m
     */
    public void setM(int m) {
        if(isValido())
            this.m = m;
    }

    /**
     * Restituisce il valore di o
     *
     * @return o
     */
    public int getO() {
        return o;
    }

    /**
     * Imposta/modifica il valore di o
     *
     * @param o o
     */
    public void setO(int o) {
        if(isValido())
            this.o = o;
    }

    /**
     * Metodo che restituisce se l'orario è valido
     * 
     * @return 
     */
    public boolean isValido(){
        boolean valido = false;
        
        valido = isValido(s, m, o);
        
        return valido;
    }
    
    /**
     * Metodo che restituisce se l'orario è valido
     * @param secondi
     * @param minuti
     * @param ore
     * @return 
     */
    public static boolean isValido(int secondi, int minuti, int ore){
        boolean valido = false;
        
        //if(ore >= 0 && ore <= 23 && minuti >= 0 && minuti <= 59 && secondi >= 0 && secondi <= 59){
        
        if(ore >= 0 && ore <= 23){
            if(minuti >= 0 && minuti <= 59){
                if(secondi >= 0 && secondi <= 59){
                    valido = true;
                }
            }
        }
        return valido;
    }
    
    /**
     * Metodo che restituisce il totale dei secondi
     *
     * @param s
     * @param m
     * @param o
     * @return totSecondi
     */
    public static int secondiEquivalenti(int s, int m, int o) {
        int totSecondi = 0;
        if (isValido(s, m, o))
            totSecondi = s + (m * 60) + (o * 60 * 60);
        return totSecondi;
    }

    /**
     * Metodo che restituisce il totale dei minuti
     *
     * @return totMinuti
     */
    public int minutiEquivalenti() {
        int totMinuti = secondiEquivalenti(s, m, o) / 60;
        return totMinuti;
    }

    /**
     * Metodo che restituisce il totale delle ore
     *
     * @return totOre
     */
    public int oreEquivalenti() {
        int totOre = minutiEquivalenti() / 60;
        return totOre;
    }

    /**
     * Metodo che restituisce la differenza tra due orari
     * @param sec
     * @param min
     * @param ore
     * @return 
     */
    public int differenzaSecondi(int sec, int min, int ore) {
        int diff = 0;

        if(isValido() == true && isValido(sec, min, ore) == true){
            diff = Math.abs(secondiEquivalenti(this.s, this.m, this.o) - secondiEquivalenti(sec, min, ore));
        }
        return diff;
    }

    public int differenzaInsecondiNew(Orario o){
        int diff = 0;

        if(isValido() == true && isValido(o.getS(), o.getM(), o.getO()) == true){
            diff = Math.abs(secondiEquivalenti(this.s, this.m, this.o) - secondiEquivalenti(o.getS(), o.getM(), o.getO()));
        }
        return diff;
    }
    
    /**
     * Metodo che restituisce l'orario nella corretta forma
     *
     * @return testo
     */
    public String info() {
        String testo = "Data non valida ";
        if(isValido()){
            if (o < 10) {
                testo = "0" + o + ":";
            } else {
                testo = o + ":";
            }
            if (m < 10) {
                testo += "0" + m + ":";
            } else {
                testo += m + ":";
            }
            if (s < 10) {
                testo += "0" + s;
            } else {
                testo += s;
            } 
        }
        return testo;
    }
}
