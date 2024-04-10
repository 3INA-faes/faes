package esercizi.laboratorio;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        String giorno;
        float temperatura;
        
        Scanner in = new Scanner(System.in);
        
        Temperature t = new Temperature();
        
        int i = 1;
        do{
            System.out.println("Inserire la " + i + "° temperatura del " + i + "° giorno della settimana: ");
            temperatura = in.nextFloat();
            i++; 
        }while(t.riempi(temperatura));

        
        System.out.println(t.mediaTemperaturaSettimanale());
        System.out.println(t.temperaturaPiuAlta());
        System.out.println(t.temperaturaPiuBassa());
        
        System.out.println("Inserisci il giorno: ");
        in.nextLine();
        giorno = in.nextLine();
        System.out.println("Inserisci la temperatura: ");
        temperatura = in.nextFloat();
        
        if(t.aggiungiTemperatura(giorno, temperatura) == true){
            System.out.println("La temperatura è già presente ");
        } else {
            System.out.println("La temperatura non è presente ");
        }

    }
}
