package figureGeometriche;

public class Rettangolo {
    private float b;
    private float h;
    
    public Rettangolo (float base,float altezza){
        b = base;
        h = altezza;
    }
    
    public String getBase(){
        return ("\n" + "Base :" + b);
    }
    
    public void setBase (float base){
        b = base;
    }
    
    public String getAltezza(){
        return ("\n" + "Altezza :" + h);
    }
    
    public void setAltezza (float altezza){
        h = altezza;
    }
    
    public float calcolaArea (){
        float area;
        area = b*h;
        return area;
    }
     public float calcolaPerimetro (){
        float perimetro;
        perimetro = (b*2)+(h*2);
        return perimetro;
    }
    
    public String info(){
        String info;
        info = "\n" + "Base :" + b +
               "\n" + "Altezza :" + h;
        return info;
    }
}
