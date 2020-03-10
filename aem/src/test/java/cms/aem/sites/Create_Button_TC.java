package cms.aem.sites;
import org.testng.annotations.*;
import Interactions.Create_Button;


public class Create_Button_TC {
	
        Create_Button cb;

    @BeforeTest
    public void init() {
    	
    	cb = new Create_Button();
    }

    @Test
    public void create()  {
    	cb.create();
    }
    
   /* @AfterTest
    public void quit()
    {
    	cb.close();
    }*/

}