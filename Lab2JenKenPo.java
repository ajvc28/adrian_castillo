/* Adrian Castillo
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.jen.ken.po;

/**
 *
 * @author Adrian
 */
public class Lab2JenKenPo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
  
        
   
            
        
        
    String r;
    String p;
    String s;
    String y;
    String n;
    char ini1,ini2,ini3;
    char JenKenPo = 0;
    
    
    
    r = "rock";
    p = "paper";
    s = "scissors";
    y = "yes";
    n = "no";
    ini1 = 'r';

    
    if(JenKenPo>='0'&&JenKenPo<='9')
    System.out.println("What would you choose?");
    else if (JenKenPo>='A'&&JenKenPo<='Z') 
    System.out.println("I choose rock!");
    else
    System.out.println("Oops... it seems you just lost the gamae");
    System.out.println("Thanks for playing!");

    
    System.out.println(r + "\n");
    System.out.println(p + "\n");
    System.out.println(s + "\n");
    System.out.println("I choose: " + ini1 + "." + "\n");
        
        
            
        
    }      
        
    
}
