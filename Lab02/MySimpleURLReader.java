 import cs1.SimpleURLReader;
/*
 * This is the MySimpleURLReader class
 * @author_Tepe_Remzi
 * @version_04.03.2020
 * 
 * */
public class MySimpleURLReader extends SimpleURLReader{
   
   // properties
   
   private String url;
   
   // constructors
   
   /*
    * It creates a new MySimpleURLReader object
    * @param String url takes the url
    */
   public MySimpleURLReader( String url ){
      
       super( url );
       this.url = url;
    }
   
   // methods
   
    /*
    * The method gets url
    * @return int url
    */
   public String getURL()
   { 
      return url;
   }
   
    /*
    * The method gets name
    * @return int index
    */
   public String getName(){
      
    int index;

    index = url.lastIndexOf( '/' );

    return url.substring( index + 1 );
  }
   
    /*
    * The method overload getPageContents in the parent class, ignores null
    * @return String getPageContents
    */
   public String getPageContents(){
      
      return ( super.getPageContents() ).substring(4);
  }  
}