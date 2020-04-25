package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageTemplate {

	@FindBy(xpath="//coral-masonry-item[@data-foundation-collection-item-id='/conf/viacom-sites/settings/wcm/templates/home-template']")
	public WebElement homepage;
	
	@FindBy(xpath="//a[@class='cq-siteadmin-admin-createpage foundation-collection-action coral-Link coral3-BasicList-item coral3-AnchorList-item']")
	public WebElement page;
	
	@FindBy(xpath="//div[@title='Superhero Component']")
	public WebElement superhero;
	
	@FindBy(xpath="//coral-button-label[text()='Next']")
	public WebElement next;
	
	@FindBy(xpath="//input[@name='./jcr:title']")
	public WebElement title;
	
	@FindBy(xpath="//button[@class='coral3-Button coral3-Button--secondary coral3-Button--block coral3-Select-button']/span[text()='Select']")
	public WebElement prddropdown;
	
	@FindBy(xpath=" //coral-selectlist-item[text()='WebPlex']")
	public WebElement webplex;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement create;
	
	@FindBy(xpath="//coral-button-label[text()='Open']")
	public WebElement open;
	
}
