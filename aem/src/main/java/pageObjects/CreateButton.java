package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateButton {
	
	@FindBy(xpath="//coral-icon[@class='globalnav-homecard-icon coral3-Icon coral3-Icon--pages coral3-Icon--sizeXL']")
	public WebElement sites;
	
	@FindBy(xpath="//coral-columnview-item[@data-foundation-collection-item-id='/content/via']")
	public WebElement via;
	
	@FindBy(xpath="//coral-columnview-item[@data-foundation-collection-item-id='/content/via/us-paramountnetwork']")
	public WebElement paramount;
	
	@FindBy(xpath="//coral-columnview-item[@data-foundation-picker-collection-item-text='/content/via/us-paramountnetwork/gowtham']")
	public WebElement folder;
	
	@FindBy(xpath="//button[@class='granite-collection-create foundation-toggleable-control coral3-Button coral3-Button--primary']")
	public WebElement create;
	
	@FindBy(xpath="//a[@class='cq-siteadmin-admin-createpage foundation-collection-action coral-Link coral3-BasicList-item coral3-AnchorList-item']")
	public WebElement page;
	
	/*gowtham*/
}
