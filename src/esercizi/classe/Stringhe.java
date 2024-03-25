/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.classe;

/**
 *
 * @author denni
 */
public class Stringhe {
    private String [] stringa1, stringa2;
  private int index = 0;
  private final static int DIMENSIONE = 6;

  public Stringhe(){
    this.stringa1 = new String[DIMENSIONE];
    this.stringa2 = new String[DIMENSIONE];
  }

  public String [] getStringa1(){
    return this.stringa1;
  }

  public void setStringa1(String [] stringa1){
    this.stringa1 = stringa1;
  }
 
  public String [] getStringa2(){
    return this.stringa2;
  }
 
  public void setStringa2(String [] stringa2){
    this.stringa2 = stringa2;
  }

  public int getIndex(){
    return this.index;
  }

  public boolean inserisci(String str1, String str2){
    boolean inserito = true;
    stringa1[index] = str1;
    stringa2[index] = str2;
    index++;
    if (index > stringa1.length-1){
      inserito = false;
    }
    return inserito;
  }
 
  public String stringaComune(){
    String stringaCom = "No";
    for (int i = 0; i < DIMENSIONE; i++){
      for (int j = 0; j < DIMENSIONE; j++){
        if (stringa1[i].equals(stringa2[j])){
          stringaCom = "Yes" + "\t" + "la prima stringa in comune è " + stringa1[i];
          i = DIMENSIONE;
          j = DIMENSIONE;
        }
      }
    }
    return stringaCom;
  }
}
