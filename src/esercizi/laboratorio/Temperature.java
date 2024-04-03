package esercizi.laboratorio;

/**
 * Scrivere un classe che date le temperature di una settimana, ne calcoli la 
 * media e ne restituisca i giorni con la temperatura più bassa e alta
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Temperature {
    private int[] valoriTemperature;
    private int giorni = 0;

    public Temperature(){
        
    }
    
    public Temperature(int[] valTemp) {
        if(isValido(valTemp)){
            this.valoriTemperature = valTemp;
        }
    } 
    
    public int[] getValoriTemperature() {
        return valoriTemperature;
    }

    
    public boolean isValido(int[] controllo){
        boolean valido = false, tempValida = true;
        if(controllo.length > 7){
            for(int i = 0; i < controllo.length; i++){
                if(controllo[i] < -90 || controllo[i] > 60){
                    tempValida = false;
                    break;
                }
            }
            if (tempValida == true){
                valido = true;
            }
        }
        return valido;
    }
    
    public float mediaTemperaturaSettimanale(){
        float media = 0;
        for (int i = 0; i < valoriTemperature.length; i++){
            media += valoriTemperature[i];
        }
        media /= valoriTemperature.length;
        return media;
    }
    
    public int temperaturaPiuBassa(){
        int tempPiuBassa = valoriTemperature[0];
        for(int i = 1; i < valoriTemperature.length; i++){
            if (tempPiuBassa > valoriTemperature[i]){
                tempPiuBassa = valoriTemperature[i];
            }
        }
        return tempPiuBassa;
    }
    
    public int temperaturaPiuAlta(){
        int tempPiuAlta = valoriTemperature[0];
        for(int i = 1; i < valoriTemperature.length; i++){
            if (tempPiuAlta < valoriTemperature[i]){
                tempPiuAlta = valoriTemperature[i];
            }
        }
        return tempPiuAlta;
    }
}
