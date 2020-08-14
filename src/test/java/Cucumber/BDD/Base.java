package Cucumber.BDD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

public static WebDriver driver; // Declared this is static as for using static variables there is no need to create object of the class.

public static WebDriver getDriver() throws IOException
{
	Properties prop =new Properties(); // Creating object of property class
	FileInputStream fis= new FileInputStream("C:\\Cucumber\\BDD\\src\\test\\java\\Cucumber\\BDD\\global.properties");// Creating object of file stream class and passing property file to it.
	prop.load(fis);// Passed file input stream object to load function/.
 	System.setProperty("webdriver.chrome.driver","C:\\bin\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(	prop.getProperty("url"));
    return driver;
}
}
