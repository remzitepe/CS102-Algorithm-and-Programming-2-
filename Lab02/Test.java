 import cs1.SimpleURLReader;
 import java.util.Scanner;
/*
 * This is the test class
 * @author_Tepe_Remzi
 * @version_04.03.2020
 * 
 * */
public class Test{
   
 public static void main( String[] args )
 {
    Scanner scan = new Scanner( System.in);
    // constants
    
    // variables
    
    int str; 
    String url;
    String url2;
    String url3;
    String url4;
    
    // program code
   
    // writes the links
    url = "http://www.cs.bilkent.edu.tr/%7Edavid/housman.txt";
    url2 = "http://www.cs.bilkent.edu.tr/%7Edavid/housman.htm";
    url3 = "http://sertoz.bilkent.edu.tr/courses/math102spring2020.htm";
    url4 = "https://www.tcmb.gov.tr/kurlar/today.xml";
    
    SimpleURLReader urlRead1 = new SimpleURLReader( url ); // creates an SimpleURLReader object
    
    MySimpleURLReader urlRead2 = new MySimpleURLReader( url ); // creates am MySimpleURLReader object
    
    HTMLFilteredReader urlRead3 = new HTMLFilteredReader( url2 ); // creates an HTMLFiltered object
    
    XHTMLFilteredReader urlRead4 = new XHTMLFilteredReader( url3 ); // creates an XHTMLFiltered object
    
    Currency urlRead5 = new Currency( url4 );
    
    // These are commands for SimpleURLReader Class
    
    System.out.println( urlRead1.getPageContents() );
    
    System.out.println( urlRead1.getLineCount() );
    
    System.out.println( "-----------------------------" );
    
    // These are commands for MySimpleURLReader Class
    
    System.out.println( urlRead2.getName() );
    
    System.out.println( urlRead2.getURL() );
    
    System.out.println( urlRead2.getPageContents() );
    
    System.out.println( "-----------------------------" );
    
    // These are commands for HTMLFilteredReader Class 
    
    System.out.println( urlRead3.getPageContents() );
    
    System.out.println( urlRead3.getUnfilteredPageContents() );
    
    System.out.println( "-----------------------------" );
    
    // These are commands for XHTMLFilteredReader Class
    
    System.out.println( urlRead4.getPageContents() );
    
    System.out.println( urlRead4.getUnfilteredPageContents() );
    
    System.out.println( urlRead4.overhead() );
    
    System.out.println( urlRead4.getLinks() );
     
    System.out.println( "-----------------------------" );
    
    // These are commands for currency class 
     System.out.println( urlRead5.getUnfilteredPageContents() );
    
    System.out.println( " Would you like to see currency if you do pls select one ");
    System.out.println( " 1: USD/TRY \n 2: EUR/TRY ");
   
    str = scan.nextInt();
    
    System.out.println( urlRead5.getCurrency( str ) );
    System.out.println( "-----------------------------" );

 }
}