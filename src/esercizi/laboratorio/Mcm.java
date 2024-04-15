package esercizi.laboratorio;

public class Mcm {
    private int num1, num2;

    public Mcm(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
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
    
    public int calcoloMCM(){
        int mcm = 0;
        for(int i = 1; i > 0; i++){
            if((this.num1*i)%this.num2 == 0){
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
}
