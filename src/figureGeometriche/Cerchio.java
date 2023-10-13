package figureGeometriche;

public class Cerchio {
    private float r;
    
    public Cerchio (float raggio){
        r = raggio;
    }
    
    public void setRaggio(float raggio){
        r = raggio;
    }
    public String getRaggio(float r){
        return("Raggio :" + r);
    }
    
    public float calcolaArea (){
        float area;
        area = 3.14f*(r*r);
        return area;
    }
    public float calcolaPerimetro (){ //funzione per calcolare perimetro
        float perimetro;
        perimetro = 3.14f*(r*2);
        return perimetro;
    }
    public String info (){
        String informazioni;
        informazioni = "\n" +"Raggio: " + r;
        return informazioni;
    }
}
