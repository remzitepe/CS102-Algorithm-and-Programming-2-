/*
 * 
 * 
 * 
 * 
 * */

public class Square extends Rectangle{
   
   // properties 
   
   private int side;
   private double x;
   
   public Square( int side, double x )
   {
      super( side, side, x, x );
      this.side = side;
      setLocation( x, x );
   }
   
   public double getArea()
   {
      return super.getArea();
   }
}