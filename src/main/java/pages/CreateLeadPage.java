package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterCompName(String cName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(cName);
		return this;

	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();

	}
}
