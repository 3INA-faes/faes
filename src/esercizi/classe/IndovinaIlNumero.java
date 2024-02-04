package esercizi.classe;

/**
 * Classe che fa indovinare il numero
 * @author denni.faes 2023 3INA 
 * @version 1.0
 */
public class IndovinaIlNumero {
    private int numero;
    private int soglia;
    private float soldiPuntati;
    private float conto;

    public IndovinaIlNumero() {
        
    }

    public IndovinaIlNumero(int numero, int soglia, float soldiPuntati, float conto) {
        this.numero = numero;
        this.soglia = soglia;
        this.soldiPuntati = soldiPuntati;
        this.conto = conto;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String gioco(int numeroVincente) {
        String testo = "Non hai indovinato, il numero giusto era: " + numeroVincente;
        float vincita = 0;
        conto -= soldiPuntati;
        switch (soglia){
            case 10:
                if(numeroVincente == numero){
                    vincita = soldiPuntati * soglia;
                    testo = "Congratulazioni hai vinto: " + vincita;
                }    
                break;
            case 20:
                if((numeroVincente-1) >= numero && (numeroVincente+1) <= numero){
                    vincita = soldiPuntati * soglia;
                    testo = "Congratulazioni hai vinto: " + vincita;
                }
                break;
            case 50:
                if((numeroVincente-2) >= numero && (numeroVincente+2) <= numero){
                    vincita = soldiPuntati * soglia;
                    testo = "Congratulazioni hai vinto: " + vincita;
                }
                break;
            case 100:
                if((numeroVincente-5) >= numero && (numeroVincente+5) <= numero){
                    vincita = soldiPuntati * soglia;
                    testo = "Congratulazioni hai vinto: " + vincita;
                }
                break;
            case 200:
                if((numeroVincente-6) >= numero && (numeroVincente+6) <= numero){
                    vincita = soldiPuntati * soglia;
                    testo = "Congratulazioni hai vinto: " + vincita;
                }
                break;
            case 500:
                if((numeroVincente-8) >= numero && (numeroVincente+8) <= numero){
                    vincita = soldiPuntati * soglia;
                    testo = "Congratulazioni hai vinto: " + vincita;
                }
                break;
            case 1000:
                if((numeroVincente-10) >= numero && (numeroVincente+10) <= numero){
                    vincita = soldiPuntati * soglia;
                    testo = "Congratulazioni hai vinto: " + vincita;
                }
                break;
            default:
                testo = "Rinserisci la soglia corretta";
        }
        conto += vincita;
        return testo;
    }
    
    public static String menu(){
        String testo;
        testo = "Seleziona la soglia che desideri tra:" + "\n"
                + "10 - Bisogna indovinare il numero;" + "\n" 
                + "20 - Range di 1 dal numero;" + "\n" 
                + "50 - Range di 2 dal numero;" + "\n" 
                + "100 - Range di 5 dal numero;" + "\n"
                + "200 - Range di 6 dal numero;" + "\n"
                + "500 - Range di 8 dal numero;" + "\n"
                + "1000 - Range di 10 dal numero;";
        return testo;
    }
    
    public String info(){
        String testo;
        testo = "Il tuo conto è ora di: " + conto;
        return testo;
    }
}
