package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeaturedContent {
	
	@FindBy(xpath="//coral-tab-label[text()='Manual']")
	public WebElement manual;
	
	@FindBy(xpath="//div/label[text()='2:3 Image Path *']/../foundation-autocomplete/div/div/input")
	public WebElement Image_2_3;
	
	@FindBy(xpath="//div/label[text()='16:9 Image Path *']/../foundation-autocomplete/div/div/input")
	public WebElement Image_16_9;
	
	@FindBy(xpath="//input[@name='./title']")
	public WebElement title;
	
	@FindBy(xpath="//input[@name='./description']")
	public WebElement description;
	
	@FindBy(xpath="//button[@title='Done']")
	public WebElement submit;
}
