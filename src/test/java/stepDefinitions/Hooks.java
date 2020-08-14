package stepDefinitions;

import Cucumber.BDD.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{
	

@After("@SanityyTest")
public void afterValidation()
{
driver.close();
}


@After("@SmokeTest")
public void afterWebValidation()
{
	driver.close();

}

@After("@SeleniumTest")
public void afterSeleniumTest()
{
driver.close();
}

}
