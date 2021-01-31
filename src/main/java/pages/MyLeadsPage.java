package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage clickCreateLeads() {
		driver.findElementByLinkText("Create Lead").click();
		
		return new CreateLeadPage(driver);

	}
}
