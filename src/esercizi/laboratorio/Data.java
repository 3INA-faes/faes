/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.laboratorio;

import java.util.Arrays;
import java.time.LocalDate;

/**
 * 
 * @author dennis.faes
 */
public class Data {
    private int giorno, mese, anno;

    public Data() {
        LocalDate d = LocalDate.now();
        this.giorno = d.getDayOfMonth();
        this.mese = d.getMonthValue();
        this.anno = d.getYear();
    }

    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno; 
    }

    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        if (isDataValida(giorno, mese, anno)){
           this.giorno = giorno; 
        }
    }

    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        if (isDataValida(giorno, mese, anno)){
           this.mese = mese; 
        }
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        if (isDataValida(giorno, mese, anno)){
           this.anno = anno; 
        }
    }

    public boolean isDataValida(int g, int m, int a){
        this.giorno = g;
        this. mese = m;
        this.anno = a;
        
        boolean isAnno = false;
        boolean isMese = false;
        boolean isGiorno = false;
        boolean isData = false;
        
        if ((anno >= 1000) && (anno<= 9999))
            isAnno = true;
        
        if ((mese >= 1) && (mese <= 12))
            isMese = true;
        
        switch (mese){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if ((giorno >= 1) && (giorno <= 31)){
                    isGiorno = true;
                }
                break;
            case 4: case 6: case 9: case 11:
                if ((giorno >= 1) && (giorno <= 30)){
                    isGiorno = true;
                }
                break;
            case 2:
                if (isBisestile() == true){
                    if ((giorno >= 1) && (giorno <= 29))
                        isGiorno = true;
                } else {
                    if ((giorno >= 1) && (giorno <= 28))
                        isGiorno = true;
                }
        }
        
        if (isAnno == true && isMese == true && isGiorno == true){
            isData = true;
        }

        return isData;
    }
    
    public boolean isBisestile(){
        boolean is = false;
        
        if (anno%400 == 0 || (anno%4 == 0 && !(anno%100 == 0))){
            is = true;
        }
        
        return is;
    }
    
    public int nGiorni(int g, int m, int a, int giorno1, int mese1, int anno1){
        this.giorno = g;
        this. mese = m;
        this.anno = a;

        int nGiorni = 0;
        
        int [] primaData = {giorno,mese,anno};
        int [] secondaData = {giorno1,mese1,anno1};
        
        while(true){
            if(Arrays.toString(primaData).equals(Arrays.toString(secondaData))){
                break;
            }
            nGiorni++;
            primaData[0] += 1;
            if(isDataValida(primaData[0], primaData[1], primaData[2]) == false){
                primaData[0] = 0;
                primaData[1] += 1;
                if (primaData[1] == 13){
                    primaData[1] = 1;
                    primaData[2]++;
                }
            }
        }
        return nGiorni;
    }
    
    public String info(){
        String data = "";
        if (isDataValida(giorno, mese, anno) == true){
            if (giorno >= 1  && giorno <= 9){
                data += "0" + giorno + "/";
            } else {
                data += giorno + "/";
            }
            if (mese >= 1  && mese <= 9){
                data += "0" + mese + "/" + anno;
            } else {
                data += mese + "/" + anno;
            }
        } else {
            data = "Data non valida";
        }
        
        return data;
    }  
}
