package figureGeometriche;

public class TriangoloScaleno {
    public float l1;
    public float l2;
    public float l3;
    
    public TriangoloScaleno(float lato1, float lato2, float lato3){
        l1 = lato1;
        l2 = lato2;
        l3 = lato3;
    }
    public float CalcoloPerimetro(){
        float perimetro;
        perimetro = l1+l2+l3;
        return perimetro;
    }
    public float CalcoloArea(){
        float perimetro;
        perimetro = l1+l2+l3;
        float semiperimetro;
        semiperimetro = perimetro/2;
        float area;
        float contenutoRadice;
        contenutoRadice = (semiperimetro)*(semiperimetro-l1)*(semiperimetro-l2)*(semiperimetro-l3);
        area = (float) Math.sqrt(contenutoRadice);
        return area;
    }
}
