package cms.aem.sites;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
public class Create_Button_TC {
	
	WebDriver driver;
	WebDriverWait wait;
    Proxy p;
    DesiredCapabilities cap;


    @SuppressWarnings("deprecation")
    @BeforeTest
    public void init() {
    	System.setProperty("webdriver.gecko.driver","K:/EclipseProjects/Workplace/First/drivers/geckodriver.exe");
        /*p = new Proxy();
         cap=new DesiredCapabilities();
         p.setHttpProxy("localhost:8002");
            cap.setCapability(CapabilityType.PROXY, p);*/
            driver = new FirefoxDriver();
            wait = new WebDriverWait(driver,1000);
    }

 

    @Test
    public void Login()  {
        driver.get("https://qa-cms.viacom.com");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//coral-icon[@class='globalnav-homecard-chevron coral3-Icon coral3-Icon--chevronRight coral3-Icon--sizeS']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//coral-icon[@class='globalnav-homecard-icon coral3-Icon coral3-Icon--pages coral3-Icon--sizeXL']"))).click();
        driver.findElement(By.xpath("//coral-columnview-item[@data-foundation-collection-item-id='/content/via']")).click();
        driver.findElement(By.xpath("//coral-columnview-item[@data-foundation-collection-item-id='/content/via/us-paramountnetwork']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//coral-columnview-item[@data-foundation-picker-collection-item-text='/content/via/us-paramountnetwork/gowtham']"))).click();
        driver.findElement(By.xpath("//button[@class='granite-collection-create foundation-toggleable-control coral3-Button coral3-Button--primary']")).click();
        driver.findElement(By.xpath("//a[@class='cq-siteadmin-admin-createpage foundation-collection-action coral-Link coral3-BasicList-item coral3-AnchorList-item']")).click();
    }

}