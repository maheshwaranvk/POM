package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginPageTestCase extends ProjectSpecificMethods{
	@Test
	public void executeLogin() {
		new LoginPage(driver,prop).
		enterUserName().
		enterPassword().
		clickLogin();

	}
}
