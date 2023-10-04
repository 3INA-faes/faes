package figureGeometriche;

public class Triangolo {
    public float h;
    public float b;
    
    public Triangolo (float altezza,float base){
        h = altezza;
        b = base;
    }
    public float CalcoloArea (){
        float area;
        area = (b*h)/2;
        return area;
    }
}
