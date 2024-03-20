package esercizi.classe;

import java.util.Arrays;

/**
 *
 * @author dennis.faes
 */
public class Alunni {
    private int size;
    private int index;
    private String [] nomi;
    private String [] cognomi;

    public Alunni() {
        
    }

    public Alunni(int size) {
        this.size = size;
        this.index = 0;
        this.nomi = new String[size];
        this.cognomi = new String[size];
    }
    

    public int getSize() {
        return size;
    }

    public String getNomi() {
        return Arrays.toString(nomi);
    }

    public void setNomi(String[] nomi ) {
        this.nomi = nomi;
    }

    public String getCognomi() {
        return Arrays.toString(cognomi);
    }

    public void setCognomi(String[] cognomi) {
        this.cognomi = cognomi;
    }
    
    public boolean inserisci(String n, String c){
        boolean inserito = true;
        nomi[index] = n;
        cognomi[index] = c;
        index++;
        if(this.index == nomi.length){
            inserito = false;
        }
        return inserito;
    }
    
    public String ricercaCognomi(String nome){
        String  testo = "";
        for(int i = 0; i < nomi.length; i ++){
            if(nomi[i].equals(nome)){
                testo += nomi[i] + "\t" + cognomi[i] + "\n";
            }
        }
        return testo;
    }
    
    public String ricercaNomi(String cognome){
        String  testo = "";
        for(int i = 0; i < cognomi.length; i ++){
            if(cognomi[i].equals(cognome)){
                testo += nomi[i] + "\t" + cognomi[i] + "\n";
            }
        }
        return testo;
    }
    
}
