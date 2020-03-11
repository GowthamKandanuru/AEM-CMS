package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShowHubTemplate {

	@FindBy(xpath="//a[@class='cq-siteadmin-admin-createpage foundation-collection-action coral-Link coral3-BasicList-item coral3-AnchorList-item']")
	public WebElement page;
	
	@FindBy(xpath="//coral-masonry-item/coral-card/div/coral-card-content/coral-card-title[text()='Shows Hub Page Template']")
	public WebElement showhub;
	
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
