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
public class CadastroPetApp {
    public static void main (String[] args){
                
        Cachorro cachorro1 = new Cachorro ("Snoppy" , "Snop", "Rua São Miguel", 2018, "Uelber", "Pastor Alemão", true);    
        Cachorro cachorro2 = new Cachorro ("Leep" , "Leppzz", "Rua São Paulo" , 2017, "Jorge", "Husky Siberiano");
        Cachorro cachorro3 = new Cachorro ("Pyton" , "py", "Rua São Miguel", 2018, "Matilda", "Pitbull", true);    
        Cachorro cachorro4 = new Cachorro ("Mega" , " Meg ", " Rua Alvarez " , 2014, "Marta", "Buldog");
        Cachorro cachorro5 = new Cachorro ("Maga" , "MG", "Avenida Pedro XV", 2015, "Juliana", "Rottweiler", true);    
         
        Gato gato1 = new Gato ("Olla", "Lo", "Rua São Miguel", 2015, "Uelber", "Sphynx cat", 2013);
        Gato gato2 = new Gato ("Malu", "Maluninha", "Rua Alberto Aisten", 2010, "Juliana" , "Ragdool", 2018);
        Gato gato3 = new Gato ("Marinza", "Mazan", "Rua do Comércio", 2015, "Geovana", "Siamese cat", 2013);
        Gato gato4 = new Gato ("Pé pequena", "Pequena", "Rua Plotagem", 2014, "Stefanny", "Persian cat", 2018);
        Gato gato5 = new Gato ("Farinha" , "Acuçar", "Rua Ondina", 2010, "Andreza", "Maine Coon", 2018);
       
      
        cachorro2.setNome("Cachorro2");
        cachorro2.setPolicia(true);
        
        
        System.out.println ("\n-------------------Ficha Cadastral-------------------: \n" + cachorro1.toString() ); 
          
            if (cachorro1.getPolicia()!= false ){
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            } 
            
        System.out.println(" ");
                
        System.out.println ("\n-------------------Ficha Cadastral-------------------: \n" + cachorro2.toString());
        
            if (cachorro2.getPolicia()!= false )
            {
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            }
        
        System.out.println(" ");
            
        System.out.println ("\n-------------------Ficha Cadastral-------------------: \n" + cachorro3.toString());
        
            if (cachorro3.getPolicia()!= false )
            {
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            }
            
        System.out.println(" ");
                 
        System.out.println ("\n-------------------Ficha Cadastral-------------------: \n" + cachorro4.toString());
        
            if (cachorro4.getPolicia()!= false )
            {
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            }
           
        System.out.println(" ");
              
        System.out.println ("\n-------------------Ficha Cadastral-------------------: \n" + cachorro5.toString() + " ");
        
            if (cachorro5.getPolicia()!= false )
            {
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            }
        
        
        
        System.out.println ("--------------------------------------------------------------------------");
        
        
        System.out.println ("Informações do gato: " + gato1.toString());
        
        System.out.println(" ");
        
        System.out.println ("Informações do gato: " + gato2.toString());
        
        System.out.println(" ");
        
        System.out.println ("Informações do gato: " + gato3.toString());
        
        System.out.println(" ");
        
        System.out.println ("Informações do gato: " + gato4.toString());
        
        System.out.println(" ");
        
        System.out.println ("Informações do gato: " + gato5.toString());
        
              
    }
    
}
