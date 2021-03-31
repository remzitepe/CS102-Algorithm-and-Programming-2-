import java.awt.*;
import javax.swing.*;
/*
 * MyOPanel Class
 * @author Tepe_Remzi
 * @version 01.04.2020
 * */
public class MyPanel extends JPanel
{
   // properties

   // constructors
   public MyPanel()
   {
      JButton b;
      JPanel p;
      p = new JPanel();
      p.setBounds(40,80,200,200);   

      setLayout( new GridLayout( 2, 3 ) );
      
      add( new JLabel( "Welcome to ZOOM") );
      
      b = new JButton( "OK");
      add( b);
      add( new JButton( "Good luck with Maths! ") );
      
      add( new JTextField( 25) );      
   }

   // methods
     
}