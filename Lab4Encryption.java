/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.encryption;
import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class Lab4Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        
    Scanner keyboard=new Scanner(System.in);
    String classified;
    String input, description,letter;
    int shift, key, alphabet, counter = 0, method;
    char code, number;
    
    
   
    
        System.out.println("Please choose your encryption: Caesar or Vignere");
   
    //classified=keyboard.nextLine();
//    if(classified.equalsIgnoreCase("Caesar")){
            System.out.println("Enter a description to encrypt a code");
     letter=keyboard.nextLine();
        System.out.println("key");
        key=keyboard.nextInt();

            
//        }
            
//     if(classified.equalsIgnoreCase("Vignere"));
//            System.out.println("Enter a description to encrypt a code");
//      description=keyboard.nextLine();     
//            System.out.println("alphabet");
//      letter=keyboard.nextLine();
//   
//           
//                     
//     }   
     while(counter<letter.length())
     {
      number=letter.charAt(counter);

       System.out.println(letter.charAt(counter));
      method=key+letter.charAt(counter);
         System.out.println((char)method);
         
         
               counter++;

     }
      
  
        
//        while(counter<=description.length()) 
//        {    
//          code=description.charAt(counter);
//          shift=(int)code;
//            System.out.println(description.charAt(counter+3));
//            counter++;
//            sign=description.charAt(counter+key);
//            System.out.println("sign");
//            
//            
//            
//                 
//        
//        
//     
//   
//        }    
//    
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
