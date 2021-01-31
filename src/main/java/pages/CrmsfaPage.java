package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class CrmsfaPage extends ProjectSpecificMethods{

	public CrmsfaPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCrmsfaLink() {
	
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
		
	}
}
