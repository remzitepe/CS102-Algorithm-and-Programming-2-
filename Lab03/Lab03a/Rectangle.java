/*
 * 
 * 
 * 
 * 
 * */

public class Rectangle extends Shape implements Selectable {
   
   // constants
   private final String name = "Rectangle";
   // properties
   
   private double width;
   private double height;
   private double x;
   private double y;
   private boolean selected;
   
   public Rectangle( double width, double height, double x, double y )
   {
      this.width = width;
      this.height = height;  
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
      Shape s = new Rectangle(  width,  height,  x,  y);
      if( ( a >= getX() && a <= width ) && ( b >= getY() && b <= height ) )
      {
         setSelected( true );
         return s;
      }
      else 
         setSelected( false );
      return null;
   }
   
   double getArea()
   {
      double area;
      area =  width * height;
      return area;
   }
   public String toString()
   {
      String features;
      String str;
      str = " not selected ";
      if( this.selected )
      {
         str = " selected ";  
      }
      features = name + " is located in " + getX() + ", " + getY() + " width: " + width + " and heigth: " + height + " Area: " 
         + getArea() + " and is " + str;
      return features;
   }
}