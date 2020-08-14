package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	
	public WebDriver driver;
	public CheckOutPage(WebDriver driver)// Creating constructor so that this class driver gets attributes from Test Class driver.
	{
		this.driver=driver;
	}

	By productname=By.cssSelector("p.product-name");
	
	public WebElement getPrductName()
	{
		return driver.findElement(productname);
	 }

}
