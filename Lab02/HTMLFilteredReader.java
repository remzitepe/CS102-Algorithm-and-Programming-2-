import cs1.SimpleURLReader;
/*
 * This is the HTMLFiltered class
 * @author_Tepe_Remzi
 * @version_04.03.2020
 * */

public class HTMLFilteredReader extends MySimpleURLReader{
   
   // properties 
   
   private String url;
   
   // constructors
   
    /*
    * The consructor createss an object with String
    * @param String url takes the url
    */
   public HTMLFilteredReader( String url )
   {
      super( url );
      this.url = url;
   }
   
   // methods
   
    /*
    * The method gets getPageContents
    * @return String PageContents filtered
    */
   public String getPageContents()
   {
      String str;
      int starter;
      
      starter = 0;
      str = "";
      
      for( int i = starter; i < ( super.getPageContents() ).length(); i++) // To get all page contents data
      {
         int count;
         count = 0;
        
         if( ( super.getPageContents() ).charAt(i) == '<' && count < 1) // to control if there is < symbol
         {
            int count1;
            
            count1 = 0;
            
            for( int j = i; j < ( super.getPageContents() ).length(); j++)
            {
               if( ( super.getPageContents() ).charAt(j) == '>' && count1 < 1 ) // to control if there is > symbol
               {
                  str = str + ( super.getPageContents() ).substring( starter, i); // writes all data except between < and >
                  count1++;
                  starter = j + 1;
               }
               count++;
            }
         } 
         
      }
      for( int i = 0; i < ( super.getPageContents() ).length(); i++)
      {
         if( super.getPageContents().substring( i - 6, i ).equals( "&nbps;" ) )
         {
           
            
         }
         
         
      }
      return str;
   }
   
   /*
    * The method gets UnfilteredPageContents
    * @return String super getPageContents
    */
   public String getUnfilteredPageContents()
   {
      return super.getPageContents();
   }
}