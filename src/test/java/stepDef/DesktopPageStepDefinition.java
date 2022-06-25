package stepDef;

import java.util.List;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {

	
	
  DesktopPageObject desktop= new DesktopPageObject();
		
	
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	desktop.moveToDesktopOption();
	logger.info("User move to Desktop Option");
	
	}
	
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	desktop.clickonshowDesktopOption();
	logger.info("User clicked on Show all desktop option");
	   
	}
	
	
	
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	List<WebElement> desktopsElements = desktop.isDesktopItemsPresent();
	for(WebElement element:desktopsElements ) {
		Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("title")+ "is present");
	}
	
	WebDriverUtility.takeScreenShot();
	WebDriverUtility.hardWait();
	}
	
	
	
}
