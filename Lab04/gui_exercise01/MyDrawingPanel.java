import java.awt.*;
import javax.swing.*;
/*
 * MyDrawingPanel Class
 * @author Tepe_Remzi
 * @version 01.04.2020
 * */
public class MyDrawingPanel extends JPanel{
   
   // properties
   int width;
   int height;
   Color color;
   JPanel panel;

   
   // constructors
   
   public MyDrawingPanel(){

      panel = new JPanel();
      panel.setPreferredSize( new Dimension( 300, 250) );
      panel.setBackground( Color.yellow );
      add( panel );
   }
   
   public MyDrawingPanel( int width, int height ){

      panel = new JPanel();
      panel.setPreferredSize( new Dimension( width, height) );
      panel.setBackground( Color.yellow );
      add( panel ); 
   }
   
   // methods 
   
   public void setBackgroundColor( Color color ){
      
      panel.setBackground( color ); 
   }
   
   
}