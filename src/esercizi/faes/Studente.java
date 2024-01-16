package faes;

/**
 * Classe che calcola l'esito di una verifica per colmare la carenza
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Studente {
    
    private String nome, cognome;
    private float voto;
    
    public Studente(){
        
    }
    
    public Studente (String nome, String cognome, float voto){
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getCognome (){
        return cognome;
    }
    
    public void setCognome (String cognome){
        this.cognome = cognome;
    }
    
    public float getVoto (){
        return voto;
    }
    
    public void setVoto (float voto){
        this.voto = voto;
    }
    
    public String calcolaEsito(){
        String esito;
        if (voto >= 6){
            esito = "positivo";
            System.out.print("La carenza è stata colmata: ");
        } else {
            esito = "negativo";
            System.out.print("La carenza non è stata colmata: ");
        }
        return esito;
    }
    
    public String info(){
            String info;
            info = "Il nome dello studente è    : " + nome + "\n" +
                   "Il cognome dello studente è : " + cognome + "\n" +
                   "Il voto della verifica è    : " + voto;
            return info;
    }
}
