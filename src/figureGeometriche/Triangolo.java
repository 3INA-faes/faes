package figureGeometriche;

public class Triangolo {
    private float h;
    private float b;
    
    public Triangolo (float altezza,float base){
        h = altezza;
        b = base;
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
    
    public float CalcoloArea (){
        float area;
        area = (b*h)/2;
        return area;
    }
    
    public String info(){
        String info;
        info = "\n" + "Base :" + b +
               "\n" + "Altezza :" + h;
        return info;
    }
}
