/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faes;

/**
 *
 * @author dennis.faes
 */
public class StudenteMatricola {
    private static int ultimaMatricola;
    
    private String nome;
    private String cognome;
    private int matricola;

    public StudenteMatricola() {
        
    }

    public StudenteMatricola(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        
        ultimaMatricola++;
        
        this.matricola = ultimaMatricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public static int getUltimaMatricola() {
        return ultimaMatricola;
    }

    public int getMatricola() {
        return matricola;
    }
    

    public String info(){
        String testo;
        testo = "Nome: " + nome + " Cognome: " + cognome +
                " Matricola: " + matricola;
        return testo;
    }
    
    public static int prossimaMatricola(){
        return StudenteMatricola.ultimaMatricola+1;
    }
}
