/*
 * 
 * 
 * 
 * 
 * */

public class Circle extends Shape implements Selectable{
   
   // constants
   private final String name = "Circle";
   
   // properties 
   double radius;
   double x;
   double y;
   boolean selected;
   
   public Circle( double radius, double x, double y)
   {
    this.radius = radius;  
    setLocation( x, y );
   }
   
   public boolean getSelected()
   {
      return selected;
   }
   
     public boolean setSelected( boolean selected )
   {
      this.selected = selected;
      return selected;
   }
   
    public Shape contains( double a, double b )
   {
      Shape s = new Circle( radius, x, y );
      
      if ( Math.pow( Math.abs(getX() - a ), 2 ) + Math.pow( Math.abs(getY() - b ), 2 )  <= Math.pow( radius ,2 ) )
      {
         return s;
      }
      return null;
   }
   
   double getArea()
   {
      double area;
      area =  radius * radius * Math.PI;
      return area;
   }
   
   
   public String toString()
   {  
      String features;
      String str;
      str = " not selected ";
      if( selected )
      {
         str = " selected ";
      }
      features = name + " is located in " + getX() + ", " + getY() + " radius: " + radius + " and area: "
         + getArea() + " and is " + str;
      
      return features;
   }
   
  
   
 
   
  
}