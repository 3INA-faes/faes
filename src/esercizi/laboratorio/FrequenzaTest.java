package esercizi.laboratorio;

import java.util.Random;

public class FrequenzaTest {

    public static void main(String[] args) {
        Random r = new Random();
        
        int dato1,dato2,dato3,dato4;
        
        dato1 = r.nextInt(11)+1;
        dato2 = r.nextInt(11)+1;
        dato3 = r.nextInt(11)+1;
        dato4 = r.nextInt(11)+1;
        
        Frequenza f = new Frequenza(dato1, dato2, dato3, dato4);
        
        System.out.println(f.info());
        System.out.println(f.frequenzaRelativaEPercentuale(dato1, dato2, dato3, dato4));
    }
}
