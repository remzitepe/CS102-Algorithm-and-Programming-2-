import java.awt.*;
import javax.swing.*;
/*
 * MyFrame Class
 * @author Tepe_Remzi
 * @version 01.04.2020
 * */
public class MyFrame extends JFrame
{
   // properties
   
   // constructors
   public MyFrame()
   {
      JButton b;
      MyDrawingPanel  p, x, y;
      
      // setSize( 300, 250);
      // setBounds( 350, 250, 400, 300);
       setLayout( new FlowLayout() );
      
      // p = new MyPanel();
      // add( new MyPanel() );
      // add( new MyPanel() );
    // p =  new MyDrawingPanel();
//      
//      x = new MyDrawingPanel();
//      x.setBackgroundColor( Color.green );
//      
      y = new MyDrawingPanel( 300, 400);
      y.setBackgroundColor( Color.black );
 
     // p.add( new Label( "Welcome to ZOOM") );
//      
//      b = new Button( "OK");
//      p.add( b);
//      p.add( new Button( "Good luck with Maths! ") );
//      
//      p.add( new TextField( 25) );
//      add( p);
//      add( x );
      add( y );
      
      pack();
      setVisible( true );      
   }
   
   // methods
   
}