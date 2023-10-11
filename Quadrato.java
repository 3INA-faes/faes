package figureGeometriche;

public class Quadrato {
    public float l; // attributo

    public Quadrato (float lato){ // parametro del metodo
        l = lato;
    }
    
    public float calcolaArea (){
        float area;     // variabile locale
        area = l*l;     // espressione
        return area;
    }
    
    public float calcolaPerimetro (){
        float perimetro;
        perimetro = l+l+l+l;
        return perimetro;
    }
}
