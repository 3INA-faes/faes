package operazioniMatematiche;

public class Sottrazione {
    private float n1;
    private float n2;
    
    public Sottrazione(float numero1, float numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    public String getNumero1(){
        return ( "\n" + "Numero 1 : " + n1);
    }
    public void setNumero1(float numero1){
        n1 = numero1;
    }
    
    public String getNumero2(){
        return ( "\n" + "Numero 2 : " + n2);
    }
    public void setNumero2(float numero2){
        n2 = numero2;
    }
    
    public float esegui() {
        float sottrazione;
        sottrazione = n1 - n2;
        return sottrazione;
    }
    
    public String info(){
        String info;
        info = "Numero 1 : " + n1 +
               "\n" + "Numero 2 : " + n2;
        return info;
    }
}
