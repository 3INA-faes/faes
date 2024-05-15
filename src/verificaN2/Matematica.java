package verificaN2;

/**
 * Classe Matematica che ha il compito di calcolare il mcm, il mcd, la
 * conversione da binario a decimale e viceversa.
 *
 * @author dennis.faes 3INA 2024
 */
public class Matematica {

    /**
     * Metodo che restituisce il valore del minimo comune multiplo
     *
     * @param numeri
     * @return
     */
    public static int mcm(int[] numeri) {
        int mcm = 0;
        boolean ricerca = true;
        if (isValidoDec(numeri)) {
            mcm = numeri[0];
            for (int i = 1; ricerca; i++) {
                ricerca = false;
                for (int j = 1; j < numeri.length; j++) {
                    if ((mcm * i) % numeri[j] != 0) {
                        ricerca = true;
                    }
                }
                if (ricerca == false) {
                    mcm *= i;
                }
            }
        }
        return mcm;
    }

    /**
     * Metodo che restituisce il valore del massimo comune divisore
     *
     * @param numeri
     * @return
     */
    public static int MCD(int[] numeri) {
        int mcd = 0;
        boolean ricerca = true;
        if (isValidoDec(numeri)) {
            mcd = maggiore(numeri);
            for (int i = mcd - 1; ricerca; i--) {
                ricerca = false;
                for (int j = 0; j < numeri.length; j++) {
                    if (numeri[j] % i != 0) {
                        ricerca = true;
                    }
                }
                if (ricerca == false) {
                    mcd = i;
                }
            }
        }

        return mcd;
    }
    
    /**
     * Metodo che restituisce la conversione in decimale del numero binario
     * presente nel vettore
     *
     * @param numeri
     * @return
     */
    public static int convBinToDec(int[] numeri) {
        int dec = 0, j = 0;
        if (isValidoBin(numeri)) {
            for (int i = numeri.length - 1; i >= 0; i--) {
                if (numeri[i] == 1) {
                    dec += Math.pow(2, j);
                }
                j++;
            }
        }
        return dec;
    }

    /**
     * Metodo che restituisce il valore in binario di un numero decimale
     * 
     * @param numeri
     * @return 
     */
    public static int[] convDecToBin(int numeri) {
        int[] binario;
        int i;
        for(i = 0; numeri > Math.pow(2, i); i++){
        }
        binario = new int[i];
        for(int j = i-1; j >= 0; j--){
            if(numeri%2 == 0){
                binario[j] = 0;
            } else {
                binario[j] = 1;
            }
            numeri /= 2;
        }
        return binario;
    }

    
    
    /**
     * Metodo che restituisce il valore maggiore all'interno del vettore
     *
     * @param numeri
     * @return
     */
    public static int maggiore(int[] numeri) {
        int mag = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > mag) {
                mag = numeri[i];
            }
        }
        return mag;
    }
    
    /**
     * Metodo che restituisce se i valori decimali sono validi
     * 
     * @param numeri
     * @return 
     */
    public static boolean isValidoDec(int[] numeri) {
        boolean valido = true;
        if (numeri.length < 2) {
            valido = false;
        } else {
            for (int i = 0; i < numeri.length; i++) {
                if (numeri[i] <= 0) {
                    valido = false;
                }
            }
        }
        return valido;
    }

    /**
     * Metodo che restituisce se un vettore di numeri binari è valido
     *
     * @param numeri
     * @return
     */
    public static boolean isValidoBin(int[] numeri) {
        boolean valido = true;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] != 0 && numeri[i] != 1) {
                valido = false;
            }
        }
        return valido;
    }
}
