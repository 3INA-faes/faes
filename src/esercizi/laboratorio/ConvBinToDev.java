package esercizi.laboratorio;

public class ConvBinToDev {
    /*
    private int binario[];
    private int lunghezza;
    private int indice = 0;

    public ConvBinToDev() {
    }

    public ConvBinToDev(int lunghezza) {
        binario = new int[lunghezza];
    }

    public int[] getBinario() {
        return binario;
    }

    public boolean setBinario(int[] bit) {
        boolean valido = true;
        for(int i = 0; i < binario.length; i++){
            if(isValido(bit[i]) == false){
                valido = false;
                break;
            }
        }
        if(valido){
            //System.arraycopy(bit, 0, this.binario, 0, binario.length);
            for(int j = 0; j < binario.length;j++){
                this.binario[j] = bit[j]; 
            }
        }
        return valido;
    }

    public int getLunghezza() {
        return lunghezza;
    }
    
    public boolean riempi(int bit){
        boolean vuoto = true;
        if(isValido(bit)){
            binario[indice] = bit;
            indice ++;
            if(indice >= binario.length){
                vuoto = false;
            }
        } else {
            vuoto = false;
        }
        return vuoto;
    }
    
    public boolean isValido(int bit){
        boolean valido = false;
        if(bit == 0 || bit == 1){
            valido = true;
        }
        return valido;
    }
    
    public int conversione(){
        int decimale = 0;
        int j = binario.length - 1;
        for(int i = 0; i < binario.length; i++){
            if(binario[i] == 1){
                decimale += Math.pow(2, j);
            }
            j--;
        }
        return decimale;
    }
    */
    private String binario;

    public ConvBinToDev() {
    }

    public ConvBinToDev(String binario) {
        this.binario = binario;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }
    
    public int conversione(){
        int decimale = 0, bit;
        int i = binario.length() - 1;
        int j = 0;
        while(i >= 0){
            bit = this.binario.charAt(i) - '0';
            i--;
            if(bit == 1){
                decimale += Math.pow(2, j);
            }
            j++;
        }
        return decimale;
    }
    
}
