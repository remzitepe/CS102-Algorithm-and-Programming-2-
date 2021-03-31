/**
    * This is the IntBag class of lab01
    * @author Remzi_Tepe
    * @version 19.02.2020
    */
public class IntBag{
   
   // properties
   private int[] bag;
   public int valid;
   
   // constructors
   
   // creates an empty bag with 100 sized.
   public IntBag() {
      
      bag = new int[100];
      valid = 0;
   }
   
   // creates an empty bag with certain size.
   public IntBag( int maxNum ) {
      
      bag = new int[ maxNum ];
      valid = 0;
   }
   
   /**
    * add a number to the end of the array.
    * @param the num that is added at the end of the array.
    */
   public void addEnd( int num )
   {  
      bag[valid] = num;
      valid++;
   }
   /**
    * add a number to a location that the user wants.
    * @param index that is the location of number we want to add.
    * @param num that is added at the location we indicate with the first parameter.
    */ 
   public void addTo( int index, int num )
   {
      int[] bagNew = new int[ bag.length ];
      for( int i = 0; i < index; i++)
      {
         bagNew[i] = bag[i];
      }
      
      for( int i = index; i < valid; i++)
      {
         bagNew[ i + 1 ] = bag[ i ];
      }
      bagNew[ index] = num;
      bag = bagNew;
      valid++;
   }
   /**
    * remove the number at certain location.
    * @param index is the number's that will be removed.
    */
   public void remove( int index ){
      
      int[] bagNew = new int[ bag.length];
      
      for( int i = 0; i < index; i++)
      {
         bagNew[i] = bag[i];
      }
      for( int i = index; i < valid-1; i++ )
      {
         bagNew[ i ] = bag[ i + 1 ];
      }
      bag = bagNew;
      valid--;
   }
   /**
    * output the all array numbers from 0 to valid number.
    * @return returns the string that contains all numbers.
    */
   public String toString() {
      
      String str;
      str = "";
      for ( int i = 0; i < valid; i++ )
      {
         str = str + bag[i] + ", ";
      }
      return str;
      
   }
   /**
    * test whether the given number is in the array or not
    * @param the num to be controlled whether or not it is exist in the array
    * @return  returns whether the given number is in the array or not
    */
   public boolean test( int num )
   {
      int i;
      int count;
      i = 0;
      count = 0;
      while( i < valid && count < 1)
      {
         if( bag[i] == num )
         {
            count++;
            return true;
         }
         i++;
      }
      return false;
   }
   /**
    * show the size of the current array.
    * @return  returns the size / length of the array.
    */
   public int size(){
      
      return valid;
   }
   /**
    * it let us get the value at the certain index
    * @param index is the location of the number we want.
    * @return  returns the number at that location.
    */
   public int get( int index )
   {
      return bag[index];
   }
   /**
    * finds all location for the number we want.
    * @param num is the number with its all locations in the array.
    * @return  returns the all given num parameter's indexes.
    */
   public String findAll( int num )
   {
      String str;
      str = "";
      for ( int i = 0; i < bag.length; i++)
      {
         if ( bag[i] == num )
            str = str + i + ", ";
      }
      return str;
   }
   
}