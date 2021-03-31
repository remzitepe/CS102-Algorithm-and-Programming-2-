/*
 * 
 * 
 * 
 * 
 * 
 * */

public class lab06{
   
   public static int countE( String test){
    int count;
    count = 0;
    if( test.length() == 0){
     return count;  
    }
    if( test.substring( 0, 1).equals( "e") ){
       count = 1 + countE( test.substring( 1) );
       return count;
    }
    return count;
   }
   public static void main( String[] args){
      String str = "erkek";
     System.out.println( countE( str ));
      
   }
   
}