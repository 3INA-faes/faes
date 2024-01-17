/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.laboratorio;

/**
 *
 * @author dennis.faes
 */
public class Tomaselli {
    private String testo;

    public Tomaselli() {
    }

    public Tomaselli(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
    
    public String info(){
        String testo;
        testo = "testo " + this.testo;
        return testo;
    }
    
    public String tomatoma(int n){
        String testo = "";
        for (int i = 0; i < n; i++){
            testo += this.testo + "\n";
        }
        return testo;
    }
}
