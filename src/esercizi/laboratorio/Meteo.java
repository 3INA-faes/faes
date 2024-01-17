package esercizi.laboratorio;

/**
 * La classe meteo serve per dare dei consigli in base alla temperatura
 *
 * @author dennis.faes 3INA 2024
 * @version 1.0
 */
public class Meteo {

    private float temperatura;

    /**
     * Costruttore senza parametri {@link #setTemperatura(float)}
     */
    public Meteo() {
    }

    /**
     * Costruttore con i parametri
     *
     * @param temperatura
     */
    public Meteo(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Restituisce il valore della temperatura
     *
     * @return
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * Imposta/ Modifica il valore della temperatura
     *
     * @param temperatura temperatura
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Metodo che restituisce un consiglio
     *
     * @return
     */
    public String consiglio1() {
        String testo = "";
        
        if (temperatura < 0)
            testo = "attenti al ghiaccio!";
        
        if (temperatura == 0)
            testo = "Si va a sciare!";
        
        if ((temperatura > 0) && (temperatura <= 5))
            testo = "ci vuole il cappellino!";
        
        if ((temperatura > 5) && (temperatura <= 10))
            testo = "basta il piumino!";
        
        if ((temperatura > 10) && (temperatura <= 15))
            testo = "solo il maglioncino!";
        
        if ((temperatura > 15) && (temperatura <= 20))
            testo = "magari!";
        
        if ((temperatura > 20) && (temperatura <= 25))
            testo = "tutti al mare!";
        
        if (temperatura > 25)
            testo = "condizionatore a manetta!";

        return testo;
    }

    /**
     * Metodo che restituisce un consiglio
     *
     * @return
     */
    public String consiglio2() {
        String testo ;
        
        if (temperatura < 0){
            testo = "attenti al ghiaccio!";
            
        } else if (temperatura == 0){
            testo = "Si va a sciare!";
            
        } else if ((temperatura > 0) && (temperatura <= 5)){
            testo = "ci vuole il cappellino!";
            
        } else if ((temperatura > 5) && (temperatura <= 10)){
            testo = "basta il piumino!";
            
        } else if ((temperatura > 10) && (temperatura <= 15)){
            testo = "solo il maglioncino!";
            
        } else if ((temperatura > 15) && (temperatura <= 20)){
            testo = "magari!";
            
        } else if ((temperatura > 20) && (temperatura <= 25)){
            testo = "tutti al mare!";
            
        } else {
            testo = "condizionatore a manetta!";
        }
        return testo;
    }

    /**
     * Metodo che restituisce un consiglio
     *
     * @return
     */
    public String consiglio3() {
        String testo;
        if (temperatura >= 0){
            if (temperatura > 0){
                if (temperatura >5){
                    if (temperatura > 10){
                        if (temperatura > 15){
                            if(temperatura > 20){
                                if (temperatura > 25){
                                    testo = "condizionatore a manetta!";
                                } else {
                                    testo = "tutti al mare!";
                                }
                            } else {
                                testo = "magari!";
                            }
                        } else {
                            testo = "solo il maglioncino!"; 
                        }
                    } else {
                        testo = "basta il piumino!"; 
                    }
                } else {
                    testo = "ci vuole il cappellino!";
                }
            } else {
                testo = "Si va a sciare!";
            }
        } else {
            testo = "attenti al ghiaccio!";
        }
        return testo;
    }

    /**
     * Metodo che restituisce un consiglio
     *
     * @return
     */
    public String consiglio4() {
        String testo;
        if (temperatura <= 25){
            if (temperatura <= 20){
                if (temperatura <= 15){
                    if (temperatura <= 10){
                        if (temperatura<= 5){
                            if(temperatura <= 0){
                                if (temperatura == 0){
                                    testo = "Si va a sciare!";
                                } else {
                                    testo = "attenti al ghiaccio!";
                                }
                            } else {
                                testo = "ci vuole il cappellino!";
                            }
                        } else {
                            testo = "basta il piumino!";
                        }
                    } else {
                        testo = "solo il maglioncino!";    
                    }
                } else {
                    testo = "magari!";
                }
            } else {
               testo = "tutti al mare!"; 
            }
        } else {
            testo = "condizionatore a manetta!";
        }
        return testo;
    }

    /**
     * Restituisce il valore degli attributi
     *
     * @return String
     */
    public String info() {
        String testo;
        testo = "La temperatura é: " + temperatura;
        return testo;
    }
}
