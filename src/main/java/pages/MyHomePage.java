package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElementByLinkText("Leads").click();
		
		return new MyLeadsPage(driver);

	}
}
