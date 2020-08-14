package stepDefinitions;

import Cucumber.BDD.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{
	

@After("@SanityTest")
public void afterValidation()
{
driver.close();
System.out.println("Git Test Commit By User2");
System.out.println("Git Test Commit By User1");
System.out.println("Git Test Commit By User2 in Develope Branch");


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
