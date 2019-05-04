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
public class Gato  extends CadastroPet{
    
    private int anoUltimaVacina;
    
    public Gato (String nome, String apelido, String endereco, int anoNascimento, String nomeDono, String raca, int anoUltimaVacina){
        super(nome, apelido, endereco, anoNascimento, nomeDono, raca);
        this.anoUltimaVacina=anoUltimaVacina;
    }
    
    public int getAnoUtimaVacina(){
        return anoUltimaVacina;
    }
    
    public void setAnoUltimaVacina(){
        this.anoUltimaVacina=anoUltimaVacina;
    }
    
    public String toString(){
        return(super.toString() + "\n Ano da Última Vacina: " + this.anoUltimaVacina);
    }
}
