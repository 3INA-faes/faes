package esercizi.laboratorio;

/**
 * Scrivere un classe che date le temperature di una settimana, ne calcoli la
 * media e ne restituisca i giorni con la temperatura più bassa e alta
 *
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Temperature {

    private float[] valoriTemperature;
    private String[] giorni;
    private final static int LUNGHEZZA = 7;
    private int indice = 0;
    private int prova;

    public Temperature() {
        valoriTemperature = new float[7];
        giorni = new String[]{"lunedì","martedì","mercoledì","giovedì","venerdì","sabato","domenica"};
    }

    public int getProva() {
        return prova;
    }

    public void setProva(int prova) {
        this.prova = prova;
    }
    
    public float[] getValoriTemperature() {
        float [] temp = new float[7];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = valoriTemperature[i];
        }
        return temp;
    }
    
    public void setValoriTemperature(float[] valTemp) {
        if (isValido(valTemp)) {
            //System.arraycopy(valTemp, 0, this.valoriTemperature, 0, valoriTemperature.length);
            for (int i = 0; i < valoriTemperature.length; i++) {
                this.valoriTemperature[i] = valTemp[i];
            }
        }
    }

    public int getIndice() {
        return indice;
    }

    public static int getLUNGHEZZA() {
        return LUNGHEZZA;
    }
    
    public boolean riempi(float temp){
        boolean vuoto = true;
        valoriTemperature [indice] = temp;
        indice ++;
        if(indice >= valoriTemperature.length){
            vuoto = false;
        }
        return vuoto;
    } 

    public boolean isValido(float[] controllo) {
        boolean valido = false, tempValida = true;
        if (controllo.length == 7) {
            for (int i = 0; i < controllo.length; i++) {
                if (controllo[i] < -90 || controllo[i] > 60) {
                    tempValida = false;
                    break;
                }
            }
            if (tempValida == true) {
                valido = true;
            }
        }
        return valido;
    }

    public float mediaTemperaturaSettimanale() {
        float media = 0;
        for (int i = 0; i < valoriTemperature.length; i++) {
            media += valoriTemperature[i];
        }
        media /= valoriTemperature.length;
        return media;
    }

    /*
    public String temperaturaPiuBassa() {
        String testo = "";
        float tempPiuBassa = valoriTemperature[0];
        for (int i = 1; i < valoriTemperature.length; i++) {
            if (tempPiuBassa > valoriTemperature[i]) {
                tempPiuBassa = valoriTemperature[i];
                testo = tempPiuBassa + giorni[i];
            }
        }
        return testo;
    }

    public String temperaturaPiuAlta() {
        String testo = "";
        float tempPiuAlta = valoriTemperature[0];
        for (int i = 1; i < valoriTemperature.length; i++) {
            if (tempPiuAlta < valoriTemperature[i]) {
                tempPiuAlta = valoriTemperature[i];
                testo = tempPiuAlta + giorni[i];
            }
        }
        return testo;
    }
    */
    public String temperaturaPiuBassa() {
        String testo = "";
        ordinaCrescente();
        testo += giorni[0] + "\t" + valoriTemperature[0];
        return testo;
    }
    
    public String temperaturaPiuAlta() {
        String testo = "";
        ordinaDecrescente();
        testo += giorni[0] + "\t" + valoriTemperature[0];
        return testo;
    }
    
    private void ordinaCrescente() {
        String testo;
        float temp;
        boolean scambio;
        int k = valoriTemperature.length - 1;
        do {
            scambio = false;
            for (int y = 0; y < k; y++) {
                if (valoriTemperature[y] > valoriTemperature[y + 1]) {
                    temp = valoriTemperature[y];
                    valoriTemperature[y] = valoriTemperature[y + 1];
                    valoriTemperature[y + 1] = temp;
                    testo = giorni[y];
                    giorni[y] = giorni[y +1];
                    giorni[y +1] = testo;
                    scambio = true;
                }
            }
            k--;
        } while (scambio == true);

    }
    
    private void ordinaDecrescente() {
        String testo;
        float temp;
        boolean scambio;
        int k = valoriTemperature.length - 1;
        do {
            scambio = false;
            for (int y = 0; y < k; y++) {
                if (valoriTemperature[y] < valoriTemperature[y + 1]) {
                    temp = valoriTemperature[y];
                    valoriTemperature[y] = valoriTemperature[y + 1];
                    valoriTemperature[y + 1] = temp;
                    testo = giorni[y];
                    giorni[y] = giorni[y +1];
                    giorni[y +1] = testo;
                    scambio = true;
                }
            }
            k--;
        } while (scambio == true);

    }

    public boolean aggiungiTemperatura(String giorno, float temperatura) {
        boolean isPresente = false;
        float temp;
        giorno = giorno.toLowerCase();
        int numgiorno = 7;
        switch (giorno) {
            case "lunedì":
                numgiorno = 0;
                break;
            case "martedì":
                numgiorno = 1;
                break;
            case "mercoledì":
                numgiorno = 2;
                break;
            case "giovedì":
                numgiorno = 3;
                break;
            case "venerdì":
                numgiorno = 4;
                break;
            case "sabato":
                numgiorno = 5;
                break;
            case "domenica":
                numgiorno = 6;
                break;
            default:  
        }
        if (numgiorno >= 0 && numgiorno < 7){
            temp = valoriTemperature[numgiorno];
            if (temp == temperatura) {
                isPresente = true;
            }
        }
        
        return isPresente;
    }
    
    public void modificaProva(){
        prova = 100;
    }
}
