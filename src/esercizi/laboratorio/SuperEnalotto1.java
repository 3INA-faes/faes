
package esercizi.laboratorio;

import java.util.Arrays;

/**
 * Progettare ed implementare una classe superEnalotto che oltre all'estrazione dei numero abbia al suo interno anche un metodo per la vincita
 * @author dennis.faes
 */
public class SuperEnalotto1 {
    public static String gioco(int [] num) {
        int[] array = new int[6];
        String testo = "Non hai vinto pagliaccio butta via altri soldi" + "\n";
        do {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 99) + 1;
            }
            if ((array[0] != array[1]) && (array[0] != array[2]) && (array[0] != array[3]) && (array[0] != array[4]) && (array[0] != array[5])
                    && (array[1] != array[2]) && (array[1] != array[3]) && (array[1] != array[4]) && (array[1] != array[5])
                    && (array[2] != array[3]) && (array[2] != array[4]) && (array[2] != array[5])
                    && (array[3] != array[4]) && (array[3] != array[5]) && (array[4] != array[5])) {
                
                boolean isVinto = true, primoControllo = true;
                for(int i = 0; i < array.length; i++){
                    if(primoControllo == true){
                        for(int y = 0; y < num.length; y++){
                            primoControllo = false;
                            if(array[y] == num[i]){
                                primoControllo = true;
                                break;
                            }
                        }
                    } else {
                        isVinto = false;    
                    }
                }
                if(isVinto == true){
                    testo = "Hai vinto";
                }
                break;
            }
        } while (true);
        return testo;
    }
}
