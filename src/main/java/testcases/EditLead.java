package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods{

	@BeforeTest
	public void getExcel() {
		excelFileName="EditLead";

	}
	
	@Test(dataProvider="fetchdata")
	public void runEditLead(String leadID) throws InterruptedException {
		new LoginPage(driver,prop)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickFindLead()
		.enterLeadID(leadID)
		.clickFindLeads()
		.clickLeadID()
		.clickEdit()
		.updateCompaName()
		.clickUpdateButton();
		

	}
}
