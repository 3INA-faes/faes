package faes;

/**
 * Questa classe serve per ricavere dell informazioni su una persona e verificare l'effettuata registrazione
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Persona {
    
    private String nome, cognome, contattoEmail;
    
    /**
     * Costruttore senza parametri
     * {@link #
     */
    public Persona(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param nome
     * @param cognome
     * @param contattoEmail 
     */
    public Persona(String nome,String cognome,String contattoEmail){
        this.nome = nome;
        this.cognome = cognome;
        this.contattoEmail = contattoEmail;
    }
    
    /**
     * Restituisce il valore del nome della persona
     * @return 
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * imposta/modifica il valore del nome della persona
     * @param nome nome
     */
    public void setNome (String nome){
        this.nome = nome;
    }
    
    /**
     * Restituisce il valore del cognome della persona
     * @return 
     */
    public String getCognome(){
        return cognome;
    }
    
    /**
     * imposta/modifica il valore del cognome della persona
     * @param cognome cognome
     */
    public void setCognome (String cognome){
        this.cognome = cognome;
    }
    
    /**
     * Restituisce il valore del contatto della persona
     * @return 
     */
    public String getContattoEmail(){
        return contattoEmail;
    }
    
    /**
     * imposta/modifica il valore del contatto della persona
     * @param contattoEmail contattoEmail
     */
    public void setContattoEmail (String contattoEmail){
        this.contattoEmail = contattoEmail;
    }
    
    /**
     * Metodo che verifica la registrazione del contatto
     * @return 
     */
    public boolean registrazioneContatto (){
        boolean registrazione = true;
        
        if(contattoEmail.equals("")){
            registrazione = false;
        }
        
        return registrazione;
    }
    
    /**
     * Il metodo restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Il nome è     : " + nome + "\n" +
               "Il cognome é  : " + cognome + "\n";
        
               if(registrazioneContatto() == true){
                   info += "Il contatto é  : " + contattoEmail;
               } else {
                   info += "L' Email non è stata registrata ";
               }
        return info;
    }
}
