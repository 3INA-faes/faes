/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faes;

/**
 * Classe che ha lo scopo di visualizzare degli appositi messaggi a seconda del
 * tipo di giorno selezionato, e di visualizzare in base al numero che 
 * rappresenta un mese (es. 10 per il mese di ottobre) la totalità dei giorni di
 * cui è composto, facendo attenzione di visualizzare, per il mese di febbraio,
 * 29 o 28 giorni, a seconda che l’anno sia bisestile o meno.
 * @author denni.faes 3INA 2023
 * @version 1.0
 */
public class Calendario {
    private String giornoSettimana;
    private int mese, anno;

    public Calendario() {
    }

    public Calendario(String giornoSettimana, int mese, int anno) {
        this.giornoSettimana = giornoSettimana;
        this.mese = mese;
        this.anno = anno;
    }

    public String getGiornoSettimana() {
        return giornoSettimana;
    }

    public void setGiornoSettimana(String giornoSettimana) {
        this.giornoSettimana = giornoSettimana;
    }

    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    public String mostraTipoGiorno(){
        String testo;
        switch(giornoSettimana){
            case "lunedi":
                testo = "Inizio settimana lavorativa";
                break;
            case "martedi": case "mercoledi": case "giovedi":
                testo = "Metà settimana lavorativa";
                break;
            case "venerdi":
                testo = "Fine settimana lavorativa";
                break;
            case "sabato": case "domenica":
                testo = "Weekend";
                break;
            default: 
                testo = "Errore nell' inserimento del giorno della settimana";
        }
        return testo;
    }
    
    public String giorniMese(){
        String testo;
        switch (mese){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                testo = "Il mese a 31 giorni";
                break;
            case 4: case 6: case 9: case 11:
                testo = "Il mese a 30 giorni";
                break;
            case 2:
                if (anno%4==0 && anno!=1900)
                    testo = "Il mese è bisestile ha 29 giorni";
                else
                    testo = "Il mese non è bisestile ha 28 giorni";
                break;
            default:
                testo = "Errore nell' inserimento del mese";
        }
        return testo;
    }
    
    public String info(){
        String testo;
        testo = "Il giorno è: " + giornoSettimana + "\n" +
                "Il mese è: " + mese + "\n" +
                "L'anno è: " + anno;
        return testo;
    }
}
