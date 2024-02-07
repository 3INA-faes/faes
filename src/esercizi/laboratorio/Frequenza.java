package esercizi.laboratorio;

/**
 * 
 * @author denni
 */
public class Frequenza {
    private int dato1;
    private int dato2;
    private int dato3;
    private int dato4;

    /**
     * Costruttore senza parametri
     * {@link #setDato1(int) } <br>
     * {@link #setDato2(int) } <br>
     * {@link #setDato3(int) } <br>
     * {@link #setDato4(int) } 
     */
    public Frequenza() {
    }

    /**
     * Costruttore con i parametri
     * @param dato1 dato1
     * @param dato2 dato2
     * @param dato3 dato3
     * @param dato4 dato4
     */
    public Frequenza(int dato1, int dato2, int dato3, int dato4) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
        this.dato4 = dato4;
    }

    /**
     * Restituisce il valore del primo dato
     * 
     * @return 
     */
    public int getDato1() {
        return dato1;
    }

    /**
     * Imposta/modifica il primo dato
     * 
     * @param dato1 dato1
     */
    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    /**
     * Restituisce il valore del secondo dato
     * 
     * @return 
     */
    public int getDato2() {
        return dato2;
    }

    /**
     * Imposta/modifica il secondo dato
     * 
     * @param dato2 dato2
     */
    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    /**
     * Restituisce il valore del terzo dato
     * 
     * @return 
     */
    public int getDato3() {
        return dato3;
    }

    /**
     * Imposta/modifica il terzo dato
     * 
     * @param dato3 dato3
     */
    public void setDato3(int dato3) {
        this.dato3 = dato3;
    }

    /**
     * Restituisce il valore del quarto dato
     * 
     * @return 
     */
    public int getDato4() {
        return dato4;
    }

    /**
     * Imposta/modifica il quarto dato
     * 
     * @param dato4 dato4
     */
    public void setDato4(int dato4) {
        this.dato4 = dato4;
    }
    
    public String frequenzaRelativaEPercentuale(int dato1, int dato2, int dato3, int dato4){
        String testo = "";
        int totale = (dato1 + dato2 + dato3 + dato4);
        float risultato;
        float freqperc;
        for (int i = 0; i < 4; i++){
            switch (i){
                case 0:
                    risultato = dato1 / totale;
                    freqperc = risultato * 100;
                    testo = "La frequenza relativa del primo dato è: " + risultato + "\n" +
                            "La frequenza percentuale del primo dato è: " + freqperc + "\n";
                    break;
                case 1:
                    risultato = dato2/totale;
                    freqperc = risultato * 100;
                    testo += "La frequenza relativa del secondo dato è: " + risultato + "\n" +
                            "La frequenza percentuale del secondo dato è: " + freqperc + "\n";
                    break;
                case 2:
                    risultato = dato3/totale;
                    freqperc = risultato * 100;
                    testo += "La frequenza relativa del terzo dato è: " + risultato + "\n" +
                            "La frequenza percentuale del terzo dato è: " + freqperc + "\n";
                    break;
                case 3: 
                    risultato = dato4/totale;
                    freqperc = risultato * 100;
                    testo += "La frequenza relativa del quarto dato è: " + risultato + "\n" +
                            "La frequenza percentuale del quarto dato è: " + freqperc;
                    break;
                default:
                    testo = "";
            }
        }
        return testo;
    }
    
    public String info(){
        String testo ;
        testo = "Frequenza assoluta primo dato: " + dato1 + "\n" +
                "Frequenza assoluta secondo dato: " + dato2 + "\n" +
                "Frequenza assoluta terzo dato: " + dato3 + "\n" +
                "Frequenza assoluta quarto dato: " + dato4;
        return testo;
    }
}
