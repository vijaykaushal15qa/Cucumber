package stepDefinitions;


import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageobjects.CheckOutPage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Cucumber.BDD.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions1 extends Base{
	
CheckOutPage cp;

    

@Then("^Verify selected (.+) items are displayed in checkout page$")
public void verify_selected_items_are_displayed_in_checkout_page(String name) throws Throwable {
	cp =new CheckOutPage(driver);
    Thread.sleep(2000);
	Assert.assertTrue(cp.getPrductName().getText().contains(name));

}

}