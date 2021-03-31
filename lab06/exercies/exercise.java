/*
 * 
 * 
 * 
 * 
 * */

public class exercise{

   public static final int[] arrays = { 3, 5, 7, 9};
   
   public static int printReverse( int n){
      if( n == 0){
         return arrays[ n];
      }
     
      System.out.print( arrays[ n -1] + ", ");
      return printReverse( n -1);
   }
   
   public static int printForward( int n){
      if( n == 0){
         return arrays[ n];  
      }
    // System.out.print( arrays[ arrays.length - n ] + ", " );
    return printForward( n - 1);
   }
     
   public static double power( double x, int y){
      if( y == 0){
       return 1;  
      }
      else 
         return x * ( power( x, y - 1) );
   }
   
   public static int findMax( int n){
      if( n == 0){
         return arrays[ n];  
      }
      
      return Math.max( arrays[ n - 1], findMax( n -1) ); 
   }
   
   public static int printNums( int s, int e){
      if( s == e ){
         System.out.print( arrays[ s - 1] + ", " );
         return arrays[ s - 1 ];  
      }
      System.out.print( arrays[ s - 1] + ", " );
      return printNums( s + 1, e);
   }
   public static void main( String[] args ){
      
      printReverse( 4);
      System.out.println();
      System.out.println( printForward( 4) );
      System.out.println();
      System.out.println( power( 1.5, 4) );
      System.out.println();
      System.out.println( findMax( 4) );
      System.out.println();
      printNums( 1, 4);
   }
}