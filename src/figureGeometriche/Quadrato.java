package figureGeometriche;

public class Quadrato {
    private float l; // attributo

    public Quadrato (float lato){ // parametro del metodo
        l = lato;
    }
    
    public String getLato(){
        return ("\n" + "Lato :" + l);
    }
    
    public void setLato (float lato){
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
    
    public String info(){
        String info;
        info = "\n" + "Lato :" + l;
        return info;
    }
}