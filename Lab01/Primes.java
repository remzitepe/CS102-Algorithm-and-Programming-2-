/**
    * This is the Primes class of lab01
    * @author Remzi_Tepe
    * @version 19.02.2020
    */
public class Primes{
   public static void main(String args[] )
   {  
      // constants
      
      // variables
      int number;
      int countPrime;
      
      // program code
      
      IntBag prime = new IntBag(); // creates an empty array.
      
      countPrime = 1;
      number = 3;
      
      prime.addEnd( 2 ); // adds the number
      
      // this while loop add the first 100 prime numbers to the array.
      while ( countPrime < 100 )
      {
         int count;
         count = 0;
         for ( int i = 0; i < prime.size(); i++)
         {
            if ( number % prime.get( i ) == 0 && count < 1)
               count++;  
         }
         if ( count < 1 )
         {
            countPrime++;
            prime.addEnd( number );
         }
         number++;
      }
      //prime.remove( 0 );
      // prime.addTo( 0, 4 );
      System.out.println( prime ); // output the prime numbers
   }
}
   