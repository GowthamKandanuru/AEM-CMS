package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FranchiseFragment {

	@FindBy(xpath="//coral-icon[@class='globalnav-homecard-icon coral3-Icon coral3-Icon--asset coral3-Icon--sizeXL']")
	 public static WebElement assets;
	
	@FindBy(xpath="//div[@class='foundation-collection-navigator globalnav-homecard']/div[text()='Files']")
	public static WebElement files;
	
	@FindBy(xpath="//div[@title='via']")
	public static WebElement via;
	
	@FindBy(xpath="//div[@title='gowtham']")
	public static WebElement folder;
	
	@FindBy(xpath="//button[@trackingelement='create'][@class='granite-collection-create cq-damadmin-admin-createasset foundation-collection-action foundation-toggleable-control coral3-Button coral3-Button--primary']")
	public static WebElement create;
	
	@FindBy(xpath="//coral-list-item-content[text()='Content Fragment']")
	public static WebElement contentfragment;
	
	@FindBy(xpath="//coral-card-title[text()='Franchise Content Model']/../parent::div")
	public static WebElement franchisefg;
	
	@FindBy(xpath=" //coral-button-label[text()='Next']/..")
	public static WebElement next;
	
	@FindBy(xpath="//*[@type='text']/parent::div[@class='coral-Form-fieldwrapper']/input")
	public static WebElement systitle;
	
	@FindBy(xpath="//*[@name='name']/parent::div/input")
	public static WebElement name;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;
	
	@FindBy(xpath="//coral-button-label[text()='Open']/..")
	public static WebElement open;
	
	@FindBy(xpath="//input[@data-element='title']")
	public static WebElement FranchiseTitle;
	
	@FindBy(xpath="//input[@data-element='title']/../label")
	public static WebElement label;
	
	@FindBy(xpath="//button[@class='button-apply editor-GlobalBar-item coral3-Button coral3-Button--primary']")
	public static WebElement save;
}
