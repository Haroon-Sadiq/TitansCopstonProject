package stepDef;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition extends Base{
	
	

@Given("User is on Retail website")
public void user_is_on_retail_website() {

}

@When("User click on Currency")
public void user_click_on_currency() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User Chose Euro from dropdown")
public void user_chose_euro_from_dropdown() {
 
}

@Then("currency value should change to Euro")
public void currency_value_should_change_to_euro() {
    
}






@When("User click on shopping cart")
public void user_click_on_shopping_cart() {
   
}

@Then("“Your shopping cart is empty!” message should display")
public void your_shopping_cart_is_empty_message_should_display() {
    
}

}
