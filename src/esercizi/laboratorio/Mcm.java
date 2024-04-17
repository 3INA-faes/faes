package esercizi.laboratorio;

public class Mcm {
    /*
    private int num1, num2, num3;

    public Mcm(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Mcm() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    
    public int calcoloMCM(){
        int mcm = 0;
        for(int i = 1; i > 0; i++){
            if((this.num1*i)%this.num2 == 0 && (this.num1*i)%this.num3 == 0){
                mcm = this.num1*i;
                break;
            }
        }
        return mcm;
    }
    
    public String info(){
        String testo = "Primo numero: " + num1 + "\n" +
                "Secondo numero: " + num2;
        return testo;
    }
    */
    
    private int [] num;
    private final int LUNGHEZZA;
    private int indice = 0;
    
    public Mcm(int lunghezza) {
        this.num = new int[lunghezza];
        this.LUNGHEZZA = lunghezza;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int getLUNGHEZZA() {
        return LUNGHEZZA;
    }

    public int getIndice() {
        return indice;
    }
    
    public boolean riempiVettoreNumeri(int numero){
        boolean vuoto = true;
        num[indice] = numero;
        indice++;
        if(indice >= num.length){
            vuoto = false;
        }
        return vuoto;
    }
    
    public int calcoloMCM(){
        int mcm = 0;
        boolean isMCM;
        int primoNum = num[0];
        for(int i = 1; i > 0; i++){
            isMCM = true;
            for(int y = 1; y < num.length; y++){
                if(primoNum*i%num[y] != 0){
                    isMCM = false;
                }
            }
            if(isMCM){
                mcm = primoNum*i;
                break;
            }
        }
        return mcm;
    }
    
}
