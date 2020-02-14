/*
   Adrian Castillo
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionprogram;
import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class ConversionProgram { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
    
    
   
    int meters, option;
    double distance = 0;
    double menu = 0;
    
    
    
    
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your option");
    option = keyboard.nextInt();
    System.out.print("Insert distance in meters");
    distance = keyboard.nextDouble();
    distance = 0;
    
    
   
      
    while (distance < 0){
        
    }
        System.out.println("Distance can't be negative");
        System.out.println("Insert distance in meters");
        distance = keyboard.nextDouble();
        
   while (menu < 0){
       
   }
       System.out.println("Distance can't be negative");
       System.out.println("Insert distance in meters");
       menu = keyboard.nextDouble();
       
    
        
            System.out.println("1. Convert to kilometers");
            System.out.println("2. Convert to inches");
            System.out.println("3. Convert to feet");
            System.out.println("4. Convert to yards");
            System.out.println("5. Quit the program");
                   
    }
    


            
    
            switch (option){

    
               case 1:
                   displaykilometers(distance);

                   break;
               case 2:
                   displayinches(distance);
                   break;
               case 3:
                   displayfeet(distance);
                   break;
               case 4:
                   displayyards(distance);
                   break;
               case 5:
                   System.out.println("Bye!");
                   measure = -98;
                   break;
               default:
                   break;
                   
            }
                   
                   
          final double KILOMETERS_CONVERSION = 0.16;
          double kilometers;
          {
          kilometers = distance * KILOMETERS_CONVERSION;
          {
          
          
          System.out.println("%,. 2f distance is %,. 2f kilometers%n%n", distance, kilometers);
          
         
          }
          final double INCHES_CONVERSION = 6299.2;
          {
          double inches;
          {
       inches = distance * INCHES_CONVERSION;
          {
      System.out.println("%,. 2f distance is %,. 2f inches%n%", distance, inches);
      
          } 
          final double FEET_CONVERSION = 524.96;
          double feet;
          
          feet = distance * FEET_CONVERSION;
          {
              System.out.println("%,. 2f distance is%,. 2f feet%n%, distance, feet");
              
          }
                  
          final double YARDS_CONVERSION = 174.98;
          double yards;
          yards = distance * YARDS_CONVERSION;
              System.out.println("%,. 2f distance is%,. 2f yards%n%, distance, yards");
              
          }
          
              System.out.println("Bye!");
       
   }     
        
          
   }
    
    
    
            
            
    
    public static void selections(double distance){
        
    }
    public static void display(double meters){
        
    }
   
        

    public static void displayKilometers(double meters){
    
    double kilometers = meters * 0.16;
    
    
    
    System.out.println("meters" + " meters " + kilometers + "kilometers.");
    }

    public static void displayInches(double meters){
    
    double inches = meters * 6299.2;


    System.out.println("meters" + " meters is " + inches + "inches.");
    }
    public static void displayFeet(double meters){
    
    double feet = meters * 524.96;
    
    System.out.println("meters" + " meters is " + feet + "feet.");
    }
    public static void displayYards(double distance){
    double yards = distance * 174.98;
    
    System.out.println("meters" + " meters is " + yards + "yards.");
    }
    
    public static void quitProgram(){
       
   
    System.out.println("Bye!");
    }
        
       int measure = 0;
       String option;
     
        
       
        
       //do{
            //System.out.println("1. Convert to kilometers");
            //System.out.println("2. Convert to inches");
//            System.out.println("3. Convert to feet");
//            System.out.println("4. Convert to yards");
//            System.out.println("5. Quit the program");
//            
//            Scanner keyboard = new Scanner(System.in);
//            System.out.println("Enter your option");
//            option = keyboard.next();
           
            

            
//           switch (option) {
//               case "1":
//                   displaykilometers(distance);
//                   break;
//               case "2":
//                   displayinches(distance);
//                   break;
//               case "3":
//                   displayfeet(distance);
//                   break;
//               case "4":
//                   displayyards(distance);
//                   break;
//               case "5":
//                   System.out.println("Bye!");
//                   measure = -98;
//                   break;
//               default:
//                   break;
           }
            
            
            
//          final double KILOMETERS_CONVERSION = 0.001;
//          double kilometers;
//          
//          kilometers = distance * KILOMETERS_CONVERSION;
//          
//          System.out.println("%,. 2f distance is %,. 2f kilometers%n%n", distance, kilometers);
//          
        
       
          
  
//      final double INCHES_CONVERSION = 39.37;
//      double inches;
//      
//      inches = distance * INCHES_CONVERSION;
//      
//      System.out.println("%,. 2f distance is %,. 2f inches%n%", distance, );
//      
          
           
    
    
    
       
    
    
    
    

