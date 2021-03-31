import cs1.SimpleURLReader;
/*
 * This is the HTMLFiltered class
 * @author_Tepe_Remzi
 * @version_04.03.2020
 * */

public class Currency extends XHTMLFilteredReader{
   
   // properties
   private String url;
   
   // constructor
   public Currency( String url )
   {
      super( url );
      this.url = url;
   }
   
   /*
    * The method gets the currency
    * @param int currency option
    * @return the currency
    * */
   public String getCurrency( int currency )
   {
      String str;
      String pageData;
      
      pageData = super.getUnfilteredPageContents();
      str = "";
      
      if( currency == 1 || currency == 2 )
      {
         int count2;
         count2 = 0;
         for( int i = 3; i < pageData.length(); i++)
         {
            if( ( pageData.substring( i - 3, i ).equals( "USD") || pageData.substring( i - 3, i  ).equals( "EUR") ) && count2 < 1 )
            {
              int count; 
              count = 0;
              
              for( int j = i; j < pageData.length() - 16; j++)
              {
                 if( pageData.substring( j, j + 7 ).equals( "Selling" ) && count < 1 )
                 {
                   str = str + pageData.substring( j + 8, j + 14 ); 
                   count++;
                 }
              }
              count2++;
            }
         }
      }
      return str;  
   }

}