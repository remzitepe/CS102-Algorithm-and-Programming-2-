import cs1.SimpleURLReader;
 import java.util.ArrayList;
/*
 * This is the XHTMLFiltered class
 * @author_Tepe_Remzi
 * @version_04.03.2020
 * 
 * */
public class XHTMLFilteredReader extends HTMLFilteredReader{
   
   // properties
   
   private String url;
   
   // constructors
  
   /*
    * The constructor creates String url
    */
   public XHTMLFilteredReader( String url )
   {
      super( url );
      
      this.url = url;
      
   }
   
   // methods
   
    /*
     * The method gets the difference between increases
     * @return int differences
    */
   public int overhead()
   {  
      return ( super.getUnfilteredPageContents().length() - super.getPageContents().length() ) * 100 / super.getUnfilteredPageContents().length();
   }
   
    /*
     * The method gets link
     * @return String allLinks
     */
   public String getLinks()
   {
      ArrayList<String> links = new ArrayList<String>();
      
      String allLinks;
      String str;
      
      allLinks = "";
      str = super.getUnfilteredPageContents();
      
      for( int i = 5; i < super.getUnfilteredPageContents().length(); i++)
      {
         if( str.substring( i - 5, i ).equals( "href=" ) )  // controls if it contains href=
         {
            String link;
            int count;
            
            count = 0;
            link = "";
            
            for( int j = i + 1; j < super.getUnfilteredPageContents().length(); j++)
            {
               
               if( str.charAt( j ) != '"' && count < 1 )
               {
                 link = link + str.charAt( j );  
               }
               else
                  count++;
            }
            links.add( link );
         }
      }
      
      for( int i = 0; i < links.size(); i++)
      {
         allLinks = allLinks + "\n" + links.get( i ) ;
      }
      return allLinks;
   }
}