/*
 * This is the SimpleURLReader class
 * @author_Tepe_Remzi
 * @version_04.03.2020
 * */
public class SimpleURLReader{
   
   // properties
   
   private String url;
   private int line;
 
   /*
    * It creates a new SimpleURLReader object
    * @param String url takes the url
    */
   public SimpleURLReader( String url )
   {
      this.url = url;
   }
   
   /*
    * The method returns url
    * @return int url
    */
   public String getPageContents()
   {
      return url;
   }
   
   /*
    * The method returns the line count
    * @return int line 
    */
   public int getLineCount()
   {
      return line;
   }
}
