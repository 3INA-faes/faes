package figureGeometriche;

import java.util.Scanner;
/**
 * dati i lati di un triangolo, stabilire il tipo, perimetro e area
 * inoltre verificare se è possibile costruire un triangolo
 * Un triangolo é possibile solo se la lunghezza di ciascun lato è maggiore della somma delle altre due
 * @author dennis.faes 3INA 2023
 * @verion 1.0
 */
public class TriangoloGenerico {
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
     */
    public TriangoloGenerico(float l1, float l2, float l3) {
        this();
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
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
    
    /**
     * Medoto che restituisce il tipo di triangolo
     * @return 
     */
    public String tipo(){
        String tipo = "";
        if ((l1 == l2)&&(l2 == l3))
            tipo = "equilatero";
        if ((l1 == l2 && l2 != l3)||(l1 == l3 && l1 != l2)||(l2 == l3 && l3 != l1)) 
            tipo = "isoscele";
        if ((l1 != l2) && (l2 != l3) && (l1 != l3)) 
            tipo = "scaleno";
        return tipo;
    }
    
    public String tipo1(){
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

    public String tipo2(){
        String tipo ;
        if ((l1 == l2)&&(l2 == l3)){
            tipo = "equilatero";
        } else {
            if ((l1 == l2 && l2 != l3)||(l1 == l3 && l1 != l2)||(l2 == l3 && l3 != l1)) {
                tipo = "isoscele";
            } else {
                tipo = "scaleno";
            }
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
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float l1, l2, l3;
        
        System.out.println("Inserire il valore del primo lato: ");
        l1 = in.nextFloat();
        
        System.out.println("Inserire il valore del secondo lato: ");
        l2 = in.nextFloat();
        
        System.out.println("Inserire il valore del terzo lato: ");
        l3 = in.nextFloat();
        
        TriangoloGenerico t = new TriangoloGenerico(l1, l2, l3);
        
        t.setUnitaMisura("cm");
        
        System.out.println(t.info());
        if(t.isTriangolo() == true){
            System.out.println("Il perimetro è: " + t.perimetro() + " " + t.getUnitaMisura());
            System.out.println("L'area è:       " + t.area() + " " + t.getUnitaMisura());
            System.out.println("Il triangolo è: " + t.tipo());
            System.out.println("Il triangolo è: " + t.tipo1());
            System.out.println("Il triangolo è: " + t.tipo2());
        } else {
            System.out.println("Il triangolo non è possibile");
        }

        
        if(t.isTriangolo() == true){
            System.out.println("Sì");
        } else {
            System.out.println("No");
        }
        
        String testo;
        if(t.isTriangolo() == true){
            testo = "Sì";
        } else {
            testo = "No";
        }
        
        if(t.isTriangolo() == true){
            System.out.println(t.calcolaAltezza());
        } else {
            System.out.println(t.calcolaAltezza());
        }
        
        //operatore ternario o if sdraiato
        testo = t.isTriangolo()? "Sì" : "No";
        System.out.println(testo);
    }
}