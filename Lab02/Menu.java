import java.util.Scanner;
import java.util.ArrayList;
/*
 * This is the menu for all class
 * @author_Tepe_Remzi
 * @version_04.03.2020
 * 
 * */
public class Menu{
   
   // Interface for the process
   private static void Interface()
   {
      System.out.print( "\n(1) Enter the url of the poem to add to collection"
                          +"\n(2) List all poems in the collection"
                          +"\n(3) Quit");  
   }
   
   // creates an arraylist to show the poems added
   private static ArrayList<MySimpleURLReader> poems = new ArrayList<MySimpleURLReader>();
   
   public static void main( String[] args )
   {
      Scanner scan;
      boolean moveOn;
      int options;

      scan = new Scanner( System.in );
      moveOn = true;
      
      while( moveOn ) // Loop to show interface
      {
         
         Interface();
         
         options = scan.nextInt();
                  
         if( options == 1 )
         {
            String str;
            MySimpleURLReader newPoem; // creates newPoem object
            
            str = scan.next();
            
            if( str.substring( str.length() - 3, str.length() ).equals( "txt" ) )  // controls if it is txt
            {
               newPoem = new MySimpleURLReader( str );
               poems.add( newPoem );
            }
            
            else if( str.substring( str.length() - 4, str.length() ).equals( "html" ) ) // controls if it is html
            {
               newPoem = new HTMLFilteredReader( str );
               poems.add( newPoem );
            }
             else if( str.substring( str.length() - 3, str.length() ).equals( "htm" ) ) // controls if it is htm
            {
               newPoem = new HTMLFilteredReader( str );
               poems.add( newPoem );
            }
   
         }
         else if( options == 2 )
         {
            int option;
            for( int i = 0; i < poems.size(); i++)
            {
               System.out.println( i + ": " + ( poems.get( i ) ).getName() );
            }
            System.out.print( " If you like to select one poem please input a number:" );
            
            option = scan.nextInt();
            
            if( option < poems.size() && option >= 0  )
            {
               System.out.println( poems.get( option ).getPageContents() ); 
            }
            
            else if ( option > poems.size() || option < 0 )
            {
               
            }
         }
         else if( options == 3 )
         {
            moveOn = false;  
         }
         else 
           moveOn = true;  
      }
   }
}