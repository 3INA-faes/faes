package figureGeometriche;

public class TriangoloScaleno {
    private float l1;
    private float l2;
    private float l3;
    
    public TriangoloScaleno(float lato1, float lato2, float lato3){
        l1 = lato1;
        l2 = lato2;
        l3 = lato3;
    }
    
    public String getLato1(){
        return ("\n" + "Primo lato : " + l1);
    }
    public void setLato1 (float lato1){
        l1 = lato1;
    }
    
    public String getLato2(){
        return ("\n" + "Secondo lato : " + l2);
    }
    public void setLato2 (float lato2){
        l2 = lato2;
    }
    
    public String getLato3(){
        return ("\n" + "Terzo lato : " + l3);
    }
    public void setLato3 (float lato3){
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
    
    public String info (){
        String info;
        info = "\n" + "Primo lato :" + l1 +
               "\n" + "Secondo lato :" + l2 +
               "\n" + "Terzo lato :" + l3;
        return info;
    }
}
