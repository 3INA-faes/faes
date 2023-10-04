package figureGeometriche;

public class Cerchio {
    public float r;
    
    public Cerchio (float raggio){
        r = raggio;
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
}
