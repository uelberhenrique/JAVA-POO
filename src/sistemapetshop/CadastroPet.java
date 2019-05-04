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
public class CadastroPet {
    
    private String nome;
    private String apelido;
    private String endereco;
    private int anoNascimento;
    private String nomeDono;
    private String raca;
    
    
    public CadastroPet (String nome, String apelido, String endereco, int anoNascimento, String nomeDono, String raca){
        this.nome=nome;
        this.apelido=apelido;
        this.endereco=endereco;
        this.anoNascimento=anoNascimento;
        this.nomeDono=nomeDono;
        this.raca=raca;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getApelido(){
        return apelido;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public int getAnoNascimento(){
        return anoNascimento;
    }
    
    public String getNomeDono(){
        return nomeDono;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setApelidp(String apelido){
        this.apelido=apelido;
    }
    
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento=anoNascimento;
    }
    
    public void setNomeDono(String nomeDono){
        this.nomeDono=nomeDono;
    }    
    
    public void setRaca(String raca){
        this.raca=raca;
    }
    
    
    public String toString(){
        return ("\n Nome: " + this.nome + "\n Apelido: " + this.apelido + " \n Ano de Nascimento: " + this.anoNascimento + "\n Nome do Dono: " + this.nomeDono + "\n Raça: " + this.raca);
    }
}
