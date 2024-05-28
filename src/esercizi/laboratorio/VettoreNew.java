package esercizi.laboratorio;

public class VettoreNew {
    public int vettore[];

    public VettoreNew() {

    }

    public VettoreNew(int[] vettore) {
        setVettore(vettore);
    }

    public int[] getVettore() {
        return vettore;
    }

    public void setVettore(int[] vettore) {
        if (isValido(vettore)) {
            this.vettore = new int[vettore.length];
            for (int i = 0; i < vettore.length; i++) {
                this.vettore[i] = vettore[i];
            }
        }
    }

    public void caricaVettoreRandom() {
        for (int i = 0; i < vettore.length; i++) {
            this.vettore[i] = (int) (Math.random() * 100) + 1;
        }
    }
    
    public boolean ricercaElementoPerValore(int valore){
        boolean trovato = false;
        if(isValido(vettore)){
            for (int i = 0; i < vettore.length; i++) {
                if(vettore[i] == valore){
                    trovato = true;
                }
            }
        }
        return trovato;
    }
    
    public String visualizzaVettore() {
        String testo = "";
        for (int i = 0; i < vettore.length; i++) {
            testo += vettore[i] + ",";
        }
        return testo;
    }
    
    public void ordinaCrescente() {
        if (isValido(vettore)) {
            for(int i = 0; i < vettore.length-1; i++) {
                int minimo = i;
                for(int j = i+1; j < vettore.length; j++) {
                    if(vettore[minimo]>vettore[j]) {
                        minimo = j;
                    }
                }
                if(minimo!=i) { 
                    int k = vettore[minimo];
                    vettore[minimo]= vettore[i];
                    vettore[i] = k;
                }
            }
        }
    }
    
    public void ordinaDecrescente() {
        if (isValido(vettore)) {
            int n = vettore[0];  
            for (int j = vettore.length - 2 ; n < j; j++) {  
                int scambio = vettore[j];  
                int i = j+1;  
                while ( (i < vettore.length) && ( vettore[i] > scambio ) ) {  
                    vettore[i-1] = vettore[i];  
                    i++;  
                }  
                vettore[i-1] = scambio;  
            }  
        }
    }
    
    public boolean modificaElemento(int posizione, int valore) {
        boolean scambio = false;
        if (isValido(vettore) && isPosizioneValida(posizione)) {
            vettore[posizione] = valore;
            scambio = true;
        }
        return scambio;
    }
    
    public void aggiungiElemento(int valore) {
        if (isValido(vettore)) {
            int[] newVettore = new int[vettore.length + 1];
            for (int i = 0; i < vettore.length; i++) {
                newVettore[i] = vettore[i];
            }
            newVettore[newVettore.length - 1] = valore;
            vettore = newVettore;
        }
    }
    
    public boolean rimuoviElementoPerPosizione(int posizione) {
        boolean rimosso = false;
        if (isValido(vettore)) {
            if (isPosizioneValida(posizione)) {
                int[] newVettore = new int[vettore.length - 1];
                for (int i = 0, j = 0; i < vettore.length; i++) {
                    if (i != posizione) {
                        newVettore[j] = vettore[i];
                        j++;
                    }
                }
                vettore = newVettore;
                rimosso = true;
            }
        }
        return rimosso;
    }
    
    public boolean rimuoviElementoPerValore(int valore) {
        boolean rimosso = false;
        if (isValido(vettore)) {
            for (int i = 0; i < vettore.length; i++) {
                if (vettore[i] == valore) {
                    int[] nuovoVett = new int[vettore.length - 1];
                    for (int j = 0, k = 0; j < vettore.length; j++) {
                        if (j != i) {
                            nuovoVett[k] = vettore[j];
                            k++;
                        }
                    }
                    vettore = nuovoVett;
                    rimosso = true;
                    break;
                }
            }
        }
        return rimosso;
    }
    
    public void shiftDestro(int nPosizioni){
        if(isValido(vettore)){
            for (int i = 0; i < nPosizioni; i++) {
                int temp = vettore[i];
                vettore[i] = vettore[vettore.length-1-nPosizioni+i];
                vettore[vettore.length-1-nPosizioni+i] = temp;
            }
        }
    }
    
    public void shiftSinistro(int nPosizioni){
        if(isValido(vettore)){
            for (int i = 0; i < nPosizioni; i++) {
                int temp = vettore[vettore.length-1-nPosizioni+i];
                vettore[vettore.length-1-nPosizioni+i] = vettore[i];
                vettore[i] = temp;
            }
        }
    }
    
    public boolean isValido(int[] vettore) {
        boolean valido = false;
        if (vettore != null && vettore.length > 0) {
            valido = true;
        }
        return valido;
    }

    public boolean isPosizioneValida(int posizione) {
        boolean valido = false;
        if (posizione >= 0 && posizione < vettore.length) {
            valido = true;
        }
        return valido;
    }
}
