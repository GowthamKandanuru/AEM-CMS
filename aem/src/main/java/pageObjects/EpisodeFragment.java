package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpisodeFragment {
	
	@FindBy(xpath="//coral-card-title[text()='Episode Content Model']")
	public static WebElement Episodefg;
	
	@FindBy(xpath=" //coral-button-label[text()='Next']/..")
	public static WebElement next;
	
	@FindBy(xpath="//*[@type='text']/parent::div[@class='coral-Form-fieldwrapper']/input")
	public static WebElement systitle;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;
	
	@FindBy(xpath="//coral-button-label[text()='Open']/..")
	public static WebElement open;
	
	@FindBy(xpath="//input[@data-element='title']")
	public static WebElement EpisodeTitle;
	
	@FindBy(xpath="//textarea[@data-element='description']")
	public static WebElement description;
	
	@FindBy(xpath="//textarea[@data-element='shortDescription']")
	public static WebElement shortdesc;
	
	@FindBy(xpath="//input[@name='productionNumber']")
	public static WebElement production;

}
