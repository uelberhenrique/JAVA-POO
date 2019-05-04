/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapetshop;

/**
 *
 * @author Uelber Henrique
 */
public class Cachorro extends CadastroPet{
    
    private boolean policia;
    
    
    public Cachorro (String nome, String apelido, String endereco, int anoNascimento, String nomeDono, String raca){
        super(nome, apelido, endereco, anoNascimento, nomeDono, raca);
        this.policia = false;
    }
    
    public Cachorro (String nome, String apelido, String endereco, int anoNascimento, String nomeDono, String raca, boolean policia){
        super(nome, apelido, endereco, anoNascimento, nomeDono, raca);
        this.policia=policia;
    }
  
    public boolean getPolicia(){
        return policia;
    }
    
    public void setPolicia(boolean policia){
        this.policia=policia;
    }
    
    public String toString(){
        return(super.toString() + "\n É policial: " + this.policia);
    }
    
    
}
