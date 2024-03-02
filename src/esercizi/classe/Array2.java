package esercizi.classe;

public class Array2 {
    private int [] array;
    private final int lung;

    public Array2() {
        this.lung = 10;
    }

    public Array2(int[] array) {
        this.array = array;
        this.lung = 10;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLung() {
        return lung;
    }
    
    public int verificaMag(){
        int num = array[0];
        for(int i = 1; i < array.length; i++){
            if(num < array[i]){
                num = array[i];
            }
        }
        return num;
    }
    
    public int verificaMin(){
        int num = array[0];
        for(int i = 1; i < array.length; i++){
            if(num > array[i]){
                num = array[i];
            }
        }
        return num;
    }
    
    public String indirizzo(){
        String testo = "Num Mag \t" + "Indirizzo \n";
        for (int i = 0; i < array.length; i++){
            if (array[i] == verificaMag()){
                testo += verificaMag() + "\t\t" + i + "\n";
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == verificaMin()){
                testo += verificaMin() + "\t\t" + i + "\n";
            }
        }
        return testo;
    }
}

