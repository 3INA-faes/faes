package esercizi.laboratorio;

public class TemperatureTest {

    public static void main(String[] args) {
        Temperature t = new Temperature();
        int a = 15;
        
        float temp[];
        temp = new float[]{3,9,12};
        
        t.setValoriTemperature(temp);
        
        System.out.println(t.getValoriTemperature()[0]);
        
        t.setProva(a);
        t.modificaProva();
        System.out.println(t.getProva());
        System.out.println(a);
    }
    
}
