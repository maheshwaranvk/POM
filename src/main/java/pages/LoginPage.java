package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;

	}
	
	public CrmsfaPage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new CrmsfaPage(driver);

	}
	
}
