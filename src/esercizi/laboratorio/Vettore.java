package esercizi.laboratorio;

public class Vettore {

    public int vettore[];

    public Vettore() {

    }

    public Vettore(int[] vettore) {
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

    public String visualizzaVettore() {
        String testo = "";
        for (int i = 0; i < vettore.length; i++) {
            testo += vettore[i] + ",";
        }
        return testo;
    }

    public void ordinaVettore() {
        if (isValido(vettore)) {
            int y, temp;
            boolean scambio;
            int k = vettore.length - 1;
            do {
                scambio = false;
                for (y = 0; y < k; y++) {
                    if (vettore[y] > vettore[y + 1]) {
                        temp = vettore[y];
                        vettore[y] = vettore[y + 1];
                        vettore[y + 1] = temp;
                        scambio = true;
                    }
                }
                k--;
            } while (scambio == true);
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
