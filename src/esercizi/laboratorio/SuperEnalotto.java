package esercizi.laboratorio;

/**
 * Realizzare il gioco del SuperEnalotto semplificato consideriamo pertanto le
 * seguenti ipotesi: - i pènumeri univoci da indovinare sono 6, generati
 * casualmente da 1 a 9; - per vincere, i numeri scelti dall'utente devono
 * essere nella stessa sequenza di quelli generati dalla classe.
 *
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class SuperEnalotto {

    public static String gioco() {
        String numeri;
        int num1, num2, num3, num4, num5, num6;
        num1 = (int) (Math.random() * 9) + 1;
        num2 = (int) (Math.random() * 9) + 1;
        num3 = (int) (Math.random() * 9) + 1;
        num4 = (int) (Math.random() * 9) + 1;
        num5 = (int) (Math.random() * 9) + 1;
        num6 = (int) (Math.random() * 9) + 1;
        numeri = num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6 + "\t";
        return numeri;
    }

    public static String gioco1() {
        int num1, num2, num3, num4, num5, num6;
        String testo;
        boolean verifica = false;
        do {
            num1 = (int) (Math.random() * 9) + 1;
            num2 = (int) (Math.random() * 9) + 1;
            num3 = (int) (Math.random() * 9) + 1;
            num4 = (int) (Math.random() * 9) + 1;
            num5 = (int) (Math.random() * 9) + 1;
            num6 = (int) (Math.random() * 9) + 1;
            if ((num1 != num2) && (num1 != num3) && (num1 != num4) && (num1 != num5) && (num1 != num6)
                    && (num2 != num3) && (num2 != num4) && (num2 != num5) && (num2 != num6)
                    && (num3 != num4) && (num3 != num5) && (num3 != num6)
                    && (num4 != num5) && (num4 != num6) && (num5 != num6)) {
                verifica = true;
            }
        } while (verifica == false);
        testo = num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6 + "\t";
        return testo;
    }

    public static int[] gioco2() {
        int[] array = new int[6];
        do {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 99) + 1;
            }
            if ((array[0] != array[1]) && (array[0] != array[2]) && (array[0] != array[3]) && (array[0] != array[4]) && (array[0] != array[5])
                    && (array[1] != array[2]) && (array[1] != array[3]) && (array[1] != array[4]) && (array[1] != array[5])
                    && (array[2] != array[3]) && (array[2] != array[4]) && (array[2] != array[5])
                    && (array[3] != array[4]) && (array[3] != array[5]) && (array[4] != array[5])) {
                break;
            }
        } while (true);
        return array;
    }
}
