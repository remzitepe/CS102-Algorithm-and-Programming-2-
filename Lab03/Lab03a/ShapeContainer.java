import java.util.*;
/*
 * 
 * 
 * 
 * 
 * */

public class ShapeContainer {
   
   // propereties
   
   private ArrayList <Shape> shapes;
   private double x;
   private double y;
   public ShapeContainer(){
    shapes = new ArrayList <Shape>();  
   }
   
   public void add( Shape s ){
      
      shapes.add( s );
      
   }
   
   public double getArea(){
      
      double allArea;
      
      allArea = 0;
      
      for ( int i = 0; i < shapes.size(); i++)
      {
         allArea = allArea + shapes.get( i ).getArea();
      }
      return allArea;
   }
   
   public String toString(){
      
      String str;
      
      str = "";
      
      for( int i = 0; i < shapes.size(); i++)
      {  
         str = str + "Shape " + i + " is: " + shapes.get( i ).toString() + "\n";   
      }
      return str;
   }
   
   public void remove( int i ){
      
      shapes.remove( i );
   }
   
   public void findFirstShape( double x, double y )
   {
      int count;
      count = 0;
      for( int i = 0; i < shapes.size(); i++)
      {
         if(  ( ( Selectable )shapes.get( i ) ).contains( x, y )  != null && count < 1)
         {
           ( ( Selectable )shapes.get( i ) ).setSelected( true );
            System.out.println( shapes.get( i ).toString() + " is the first shape with given locations. " );
            count++;
         }
         else
            System.out.println( shapes.get( i ).toString() + " is not containing ");  
      }
      if( count < 1 )
      {
         System.out.println( " So, there is no such shape containing those locations " );
      }
   }
   
   public void removeSelectedShape()
   {
      for( int i = 0; i < shapes.size(); i++)
      {
         if( ( ( Selectable )shapes.get( i ) ).getSelected() == true )
            shapes.remove( i );
      }
   }
   
}