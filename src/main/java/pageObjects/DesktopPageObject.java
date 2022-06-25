package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// Backgound Scenarios
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement DesktopsOption;
	
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showDesktopOption;
	
	
	public void moveToDesktopOption() {
	WebDriverUtility.moveToElement(DesktopsOption);	
	}
	
	
	public void clickonshowDesktopOption() {
		showDesktopOption.click();
	}
	
	
	// desktopPagetab1 first scenario
	
	@FindBy(tagName="img")
	private List<WebElement> desktopItems;
	
	
	public List<WebElement> isDesktopItemsPresent() {
		List<WebElement>  deskItems = desktopItems;
		return deskItems;
		
  	}
	
	
	
	
}
