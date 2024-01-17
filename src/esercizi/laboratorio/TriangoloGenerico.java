package esercizi.laboratorio;

/**
 * dati i lati di un triangolo, stabilire il tipo, perimetro e area
 * inoltre verificare se è possibile costruire un triangolo
 * Un triangolo é possibile solo se la lunghezza di ciascun lato è maggiore della somma delle altre due
 * @author dennis.faes 3INA 2023
 * @verion 1.0
 */
public class TriangoloGenerico{
    final private float NF_TE;
    private float l1, l2 ,l3;
    private String unitaMisura;

    /**
     * Costruttore senza parametri <br>
     * {@link #setL1(float) }      <br>
     * {@link #setL2(float) }      <br>
     * {@link #setL3(float) }      <br>
     */
    public TriangoloGenerico() {
        NF_TE = 0.289f;
        unitaMisura = "";
    }

    /**
     * Costruttore con i parametri
     * 
     * @param l1
     * @param l2
     * @param l3
     */
    public TriangoloGenerico(float l1, float l2, float l3) {
        l1 = this.l1;
        l2 = this.l2;
        l3 = this.l3;
        NF_TE = 0.289f;
        unitaMisura = "";
    }

    /**
     * Metodo che restituisce il valore di NF_TE
     * @return 
     */
    public float getNF_TE() {
        return NF_TE;
    }
    
    /**
     * Metodo che restituisce il valore del primo lato
     * @return 
     */
    public float getL1() {
        return l1;
    }

    /**
     * Imposta/Modifica il valore del primo lato
     * @param l1 l1
     */
    public void setL1(float l1) {
        this.l1 = l1;
    }

    /**
     * Metodo che restituisce il valore del secondo lato
     * @return 
     */
    public float getL2() {
        return l2;
    }

    /**
     * Imposta/Modifica il valore del primo lato
     * @param l2 l2
     */
    public void setL2(float l2) {
        this.l2 = l2;
    }

    /**
     * Metodo che restituisce il valore del terzo lato
     * @return 
     */
    public float getL3() {
        return l3;
    }

    /**
     * Imposta/Modifica il valore del primo lato
     * @param l3 l3
     */
    public void setL3(float l3) {
        this.l3 = l3;
    }

    /**
     * Metodo che restituisce il valore dell'unità di misura
     * @return 
     */
    public String getUnitaMisura() {
        return unitaMisura;
    }

    /**
     * Imposta/Modifica il valore del primo lato
     * @param unitaMisura unitaMisura
     */
    public void setUnitaMisura(String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }
    
    
    /**
     * Metodo che calcola il valore del perimetro del triangolo
     * @return 
     */
    public float perimetro(){
        float perimetro;
        perimetro = l1 + l2 + l3;
        return perimetro;
    }
    
    /**
     * Metodo che restituisce il valore del semiperimetro del triangolo
     * @return 
     */
    private float semiPerimetro(){
        float semiPerimetro;
        semiPerimetro = perimetro()/2;
        return semiPerimetro;
    }
    
    
    /**
     * Metodo che restituisce il valore dell'area del triangolo
     * @return 
     */
    public float area(){
        float area;
        float sP = semiPerimetro();
        area = (float) Math.sqrt(sP*(sP-l1)*(sP-l2)*(sP-l3));
        return area;
    }
    
    
    public String tipo(){
        String tipo;
        if ((l1 == l2)&&(l2 == l3)){
            tipo = "equilatero";
        } else if ((l1 == l2 && l2 != l3)||(l1 == l3 && l1 != l2)||(l2 == l3 && l3 != l1)) {
            tipo = "isoscele";
        } else {
            tipo = "scaleno";
        }
        return tipo;
    }
    
    public boolean isTriangolo(){
        boolean possibile = false;
        if ((l1+l2 > l3) && (l2+l3 > l1) && (l1+l3 > l2))
            possibile = true;
        return possibile;
    }
    
    public float apotema(){
        float a;
        if(tipo().equals("equilatero"))
            a = l1 * NF_TE;
        else
            a = 0;
        return a;
    }
    
    public float calcolaAltezza(){
        float altezza;
        if(tipo().equals("equilatero"))
            altezza = l1 * (float)(Math.sqrt(3)/2);
        else
            altezza = 0;
        return altezza;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "lato 1: " + l1 + "\n" +
               "lato 2: " + l1 + "\n" +
               "lato 3: " + l1 + "\n";
        return info;
    }
    
    public String menu(){
        String menu;
        menu = "";
        return menu;
    }
}