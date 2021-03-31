/**
    * This is the user interface class of lab01
    * @author Remzi_Tepe
    * @version 19.02.2020
    */
import java.util.Scanner;
public class UI{
   
    /**
    * whenever this is written it output the commands in it.
    */
   private static void Interface()
   {
      System.out.print( ""
                          + "\n 1.Create a new empty collection with a specified maximum capacity (any previous values are lost!)"
                          + "\n 2.Read a set of positive values into the collection (use a negative value to indicate all the values have been entered.)"
                          + "\n 3.Print the collection of values."
                          + "\n 4.Add a value to the collection of values at a specified location"
                          + "\n 5.Remove the value at a specified location from the collection of values"
                          + "\n 6.Read a single test value."
                          + "\n 7.Compute the set of locations of the test value within the collection* (see note below)."
                          + "\n 8.Print the set of locations."
                          + "\n 9.Quit the program. " 
                          + "\nInput what you want: " );
   }
   
   
   public static void main( String args[] )
   {
      Scanner scan = new Scanner( System.in);
      
      Interface(); 
      
      int options = scan.nextInt(); // inputs the options 1 
      
      if ( options == 1 )
      { 
         System.out.println( " Choose your max limit of your array " );
         
         int maxLimit = scan.nextInt(); // limit your array.
         
         IntBag array = new IntBag( maxLimit ); // creates array with that certain size.
        
         boolean moveOn;
         moveOn = true;
         
         while ( moveOn ) // it will be in the loop until moveOn is false.
         {
            Interface();
            
            options = scan.nextInt();
            
            if ( options == 2 )
            {
               int count = 0;
               
               System.out.println( " Add numbers to your array, input negative numbers to exit " );
               
               while ( count < 1 )
               {
                  int numbers = scan.nextInt(); // input numbers.
                  
                  // add numbers until there is a negative number.
                  if ( numbers < 0 )
                  {
                     count++;
                  }
                  else
                     array.addEnd( numbers );
               }
            }
            
            // this option output the array so far.
            else if ( options == 3 )
            {
               System.out.println( array );   
            }
            
            // this options run the addTo method.
            else if ( options == 4 )
            {
               int location;
               int num;
               
               System.out.println( " Choose location and number to add that specified location " );
               
               location = scan.nextInt();
                num = scan.nextInt();
                
               array.addTo( location, num ); // add the number to that specified location.
            }   
       
            //  this condition removes the number at specified location.
            else if ( options == 5 )
            {
               int remove;
               
               System.out.println( " Remove the value at specified location." );
              
               remove = scan.nextInt();
               
               array.remove( remove ); // removes the number
            }
            
            // input a test value whether or not array contains it.
            else if ( options == 6 )
            {
               System.out.println( " Input a test value " );
               int testValue = scan.nextInt();
               if ( array.test( testValue ) )
               {
                  System.out.println( testValue + " is in the array " );
                  
                  Interface();
                  
                  options = scan.nextInt();
                  
                  
                  if ( options == 7 )
                  {  
                     String allNumber;
                     
                     allNumber = array.findAll( testValue );
                     
                     Interface();
                     
                     options = scan.nextInt();
                     
                     if ( options == 8 )
                     {
                        System.out.println( allNumber );  
                     }
                  }
                  else if ( options == 8 )
                  {
                     System.out.println( " You should first compute the set of locations." );
                  }
                  
               }
               else 
                  System.out.println( " There is no such number " );
            }
            
            // it indicates user should input option 6 before 7 and 8
            else if ( options == 7 || options == 8 )
            {
               System.out.println( " First test whether or not the array contains it. " );
            }
            
            // it makes you exit the programme.
            else if ( options == 9 )
            {
               moveOn = false;
            } 
         }
         
      }
      System.out.println( " you quit the programme " );
   } 
}

      
   
   
