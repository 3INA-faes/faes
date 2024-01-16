package faes;

import java.util.Scanner;

public class CalendarioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String giornoSettimana;
        int mese, anno;
        
        System.out.println("Inserire il giorno della settimana: ");
        giornoSettimana = in.nextLine();
        
        System.out.println("Inserire il mese: ");
        mese = in.nextInt();
        
        System.out.println("Inserire l'anno: ");
        anno = in.nextInt();
        
        Calendario c = new Calendario(giornoSettimana, mese, anno);
        
        System.out.println("Dati input: ");
        System.out.println(c.info());
        
        System.out.println(c.giorniMese());
        System.out.println(c.mostraTipoGiorno());
    }
    
}
