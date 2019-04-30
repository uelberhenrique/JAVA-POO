/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapetshop;

/**
 *
 * @author uelber
 */
public class CadastroPetApp {
    public static void main (String[] args){
                
        Cachorro cachorro1 = new Cachorro (" Snoppy " , " py ", " Rua São Miguel ", 2018, " Uelber ", " Pastor Alemão ", true);    
        Cachorro cachorro2 = new Cachorro (" Leep " , " Leppzz ", " Rua São Paulo " , 2017, " Jorge ", " Vira Lata ");
        Cachorro cachorro3 = new Cachorro (" Pyton " , " py ", " Rua São Miguel ", 2018, " Matilda ", " Pitbull ", true);    
        Cachorro cachorro4 = new Cachorro (" Mega " , " Meg ", " Rua Alvarez " , 2014, " Marta ", " Vira Lata " );
        Cachorro cachorro5 = new Cachorro (" Maga " , " MG ", " Avenida Pedro XV ", 2015, " Juliana ", " Rottweiler ", true);    
         
        Gato gato1 = new Gato (" OLLA ", " LO ", " Rua São Miguel ", 2015, " Uelber ", " Cianês ", 2013);
        Gato gato2 = new Gato (" MAlu ", " Maluninha ", "Rua Alberto Aisten",2010," Juliana " , " vira-lata ", 2018);
        Gato gato3 = new Gato (" Marinza ", " Mazan ", "Rua do Comércio", 2015, "Geovana", " Cianês ", 2013);
        Gato gato4 = new Gato (" Pé pequena ", " Pequena ", "Rua Plotagem", 2014, "Stefanny", " vira-lata ", 2018);
        Gato gato5 = new Gato (" Farinha " , "Acuçar ", " Rua Ondina ", 2010," Andreza ", " vira-lata ", 2018);
        
      
        cachorro2.setNome("Cachorro2");
        cachorro2.setPolicia(false);
        
        
        System.out.println ("Informações do cachorro: " + cachorro1.toString() ) ; 
          
        if (cachorro1.getPolicia()!= false ){
               System.out.println(" É policial: Sim");
        } else {
               System.out.println("É policial: Não");
        } 
        
        System.out.println ("Informações do cachorro: " + cachorro2.toString());
        
        if (cachorro2.getPolicia()!= false )
        {
               System.out.println(" É policial: Sim");
        } else
            
        {
               System.out.println("É policial: Não");
        }
        
        /*
        System.out.println ("Informações do cachorro " + gato1.toString());
        System.out.println ("Informações do cachorro " + gato2.toString());
        */
        
        
        
    }
    
}
