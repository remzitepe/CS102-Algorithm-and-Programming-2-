

/*
 * 
 * 
 * 
 * 
 * */

public abstract class Shape implements Locatable{
  
   // properties
   double x;
   double y ;
   
   abstract double getArea();
  
   public double getX()
   {
      return x;
   }
   
   public double getY()
   {
      return y;
   }
   
   public void setLocation( double x, double y)
   {
      this.x = x;
      this.y = y;
   }
}