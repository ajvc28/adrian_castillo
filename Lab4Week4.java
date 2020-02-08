/* Adrian Castillo
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.week.pkg4;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Adrian
 */
public class Lab4Week4 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)  throws Exception {
        // TODO code application logic here
    
     
      String item1, items2, item3, items4;  
      int days;
      double sales;
 
        
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print(" What would be the number of sales figures? ");
        days = keyboard.nextInt();
        sales = 500;
        
        
        keyboard.nextLine();
        System.out.print("items.txt");
        item1 = keyboard.nextLine();
        
        PrintWriter outputFile = new PrintWriter("items.txt");
            for (int count= 1; count<= days; count++) {
                
        {
         
            System.out.println(" How many sales figures are there ");
          String item2 = keyboard.nextLine();
          
          keyboard.nextLine();
          System.out.println("items.txt");
          item3 = keyboard.nextLine();
                
          while(!keyboard.hasNextDouble()) {
          String item4 = keyboard.next();
              System.out.println(" The total sales would be 500 ");
           
              outputFile.println(item4);
              outputFile.close();
              
           
              System.out.println("Data written to file");
        
          }
        
    }   
              
          
              
          
        
            
     
     
        
      
            
          
        
                
                
                
                
                
                
            
    
    
    
    
    
    
    
  

