package figureGeometriche;

public class PiramideBaseQuadrata {
    private float latoBase;
    private float altezza;
    
    private float areaB;
    private float volume;
    
    public PiramideBaseQuadrata (float latoBase,float altezza){
        this.latoBase = latoBase;
        this.altezza = altezza;
    }
    
    public String getLatoBase (float latoBase){
        return ("Il valore del lato della base è : " + latoBase);
    }
    public void setLatoBase(float latoBase){
        this.latoBase = latoBase;
    }
    
    public String getAltezza(float altezza){ 
        return  ("Il valore dell'altezza è : " + altezza);
    }
    public void setAltezza(float altezza){
        this.altezza = altezza;
    }
    
    public float calcolaAreaBase(){
        areaB = latoBase * latoBase;
        return areaB;
    }
    
    public float calcolaVolume(){
        volume = areaB * altezza/3;
        return volume;
    }
    
    public double calcolaSuperficie(){
        double superficieDiBase;
        double superficieLaterale;
        double superficieTotale;
        double apotema;
        float raggioBase;
        raggioBase = latoBase/2;
        apotema = Math.sqrt(altezza*altezza + raggioBase*raggioBase);
        superficieDiBase = 3*volume/altezza;
        superficieLaterale = (4*latoBase)*apotema/2;
        superficieTotale = superficieDiBase + superficieLaterale;
        return superficieTotale;
    }
    public String info(){
        String info;
        info = "Il valore del lato della base è : " + latoBase + "\n" +
               "Il valore dell'altezza è : " + altezza;
        return info;
    }
}
