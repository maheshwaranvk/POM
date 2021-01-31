package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class ProjectSpecificMethods {

	public RemoteWebDriver driver;
	public static String excelFileName;
	
	@BeforeMethod
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@DataProvider(name="fetchdata")
	public String[][] readxcelData() throws IOException {
		return new ReadExcelData().readExcel(excelFileName);

	}
	
	
	/*
	 * @AfterMethod public void closeBrowser() { driver.close();
	 * 
	 * }
	 */
	
}
