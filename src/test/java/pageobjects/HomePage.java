package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver)// Creating constructor so that this class driver gets attributes from Test Class driver.
	{
		this.driver=driver;
	}

	By search=By.xpath("//input[@type='search']");
	public WebElement getSearch()
	{
		return driver.findElement(search);
	 }

}
