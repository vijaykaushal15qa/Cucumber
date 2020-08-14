package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageobjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.BDD.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
 
	public WebDriver driver;// Declaring local driver variable.
	HomePage h;// Declaring object of Home Page page object class.
	
    @Given("^User is on Green Cart Landing Page$")
    public void user_is_on_green_cart_landing_page() throws Throwable {
       driver= Base.getDriver();// Assigning base class driver to local driver variable.
    	
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_vegetable(String name) throws Throwable {
    h=new HomePage(driver); // Here Page Object Class constructed gets called and this test class driver attributes are now passed to the page object driver.
    h.getSearch().sendKeys(name);
    Thread.sleep(2000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^User proceeded to checkout page$")
    public void user_proceeded_to_checkout_page() throws Throwable {
    	driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a[4]/img")).click();
    	driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/div[2]/div[2]/button")).click();
    	
    }

}