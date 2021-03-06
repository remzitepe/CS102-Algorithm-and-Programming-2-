import java.util.Scanner;
/*
 * 
 * 
 * 
 * 
 * */

public class ShapeTester{
   
   private static void Interface()
   {
      System.out.print( "This is ShapeTester Class!"
                          + "\n 1) Create an empty set of shapes"
                          + "\n 2) Add Rectangle"
                          + "\n 3) Add Circle"
                          + "\n 4) Get the total area of the shapes"
                          + "\n 5) Get the all info about the shapes" 
                          + "\n 6) Enter x and y then test if any shape contains it"
                          + "\n 7) Remove the shape in specific index"
                          + "\n 8) Quit");
      
   }
   public static void main( String[] args )
   {
     Scanner scan = new Scanner( System.in );
      
     // variables
     int option;
     int index;
     double width;
     double height;
     double radius;
     double x;
     double y;

     Interface();
     option = scan.nextInt();
     if( option == 1 )
     {
        ShapeContainer shapes = new ShapeContainer();
        do{
        
           Interface();
           option = scan.nextInt();
           if( option == 2 )
           {
              System.out.println( "What is the width: " );
              width = scan.nextDouble();
              System.out.println( "What is the height: " );
              height = scan.nextDouble();
              System.out.println( "What is location x: " );
              x = scan.nextDouble();
              System.out.println("What is location y: " );
              y = scan.nextDouble();
              Rectangle rectangle = new Rectangle( width, height, x, y );
              shapes.add( rectangle );
           }
           else if ( option == 3 )
           {
              System.out.println( "What is the radius: " );
              radius = scan.nextDouble();
              System.out.println( "What is location x: " );
              x = scan.nextDouble();
              System.out.println("What is location y: " );
              y = scan.nextDouble();
              Circle circle = new Circle( radius, x, y );
              shapes.add( circle );
           }
           else if ( option == 4 )
           {
              System.out.println( "All area: " + shapes.getArea() );
           }
           
           else if ( option == 5 )
           {
              System.out.println( shapes );
           }
         
           else if ( option == 6 )
           {
              System.out.println( "Test if x exists: " );
              x = scan.nextDouble();
              System.out.println( "Test if y exists:: " );
              y = scan.nextDouble();
               shapes.findFirstShape( x, y ) ;
           }
           else if ( option == 7 )
           {
              
              shapes.removeSelectedShape();
           }
 
        } while( option != 8 );
     }
     else
        System.out.println( "Please first create an empty set of shapes or just quit" );

   }
   
}