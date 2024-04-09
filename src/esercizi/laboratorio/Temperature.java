package esercizi.laboratorio;

/**
 * Scrivere un classe che date le temperature di una settimana, ne calcoli la
 * media e ne restituisca i giorni con la temperatura più bassa e alta
 *
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Temperature {

    private static float[] valoriTemperature;
    private final static int LUNGHEZZA = 7;
    private static int indice = 0;

    public Temperature() {
        valoriTemperature = new float[7];
    }
    
    public float[] getValoriTemperature() {
        return valoriTemperature;
    }
    
    public void setValoriTemperature(float[] valTemp) {
        if (isValido(valTemp)) {
            this.valoriTemperature = valTemp;
        }
    }

    public int getIndice() {
        return indice;
    }

    public static int getLUNGHEZZA() {
        return LUNGHEZZA;
    }
    
    public static boolean riempi(float temp){
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
        if (controllo.length > 7) {
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

    public float temperaturaPiuBassa() {
        float tempPiuBassa = valoriTemperature[0];
        for (int i = 1; i < valoriTemperature.length; i++) {
            if (tempPiuBassa > valoriTemperature[i]) {
                tempPiuBassa = valoriTemperature[i];
            }
        }
        return tempPiuBassa;
    }

    public float temperaturaPiuAlta() {
        float tempPiuAlta = valoriTemperature[0];
        for (int i = 1; i < valoriTemperature.length; i++) {
            if (tempPiuAlta < valoriTemperature[i]) {
                tempPiuAlta = valoriTemperature[i];
            }
        }
        return tempPiuAlta;
    }

    public boolean aggiungiTemperatura(String giorno, float temperatura) {
        boolean isPresente = false;
        float temp;
        giorno = giorno.toLowerCase();
        int numgiorno = 7;
        switch (giorno) {
            case "lunedì ":
                numgiorno = 0;
                break;
            case "martedì ":
                numgiorno = 1;
                break;
            case "mercoledì ":
                numgiorno = 2;
                break;
            case "giovedì ":
                numgiorno = 3;
                break;
            case "venerdì ":
                numgiorno = 4;
                break;
            case "sabato ":
                numgiorno = 5;
                break;
            case "domenica ":
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
}
