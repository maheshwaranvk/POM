package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getExcel() {
		excelFileName="CreateLead1";

	}
	
	@Test(dataProvider="fetchdata")
	public void runCreateLead(String cName, String fName, String lName) {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickCreateLeads()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterCompName(cName)
		.clickCreateLeadButton()
		.viewPage();

	}
}
