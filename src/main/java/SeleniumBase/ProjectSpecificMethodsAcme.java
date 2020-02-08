package SeleniumBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utils.LearnReadExcel;

public class ProjectSpecificMethodsAcme {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void login() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

@DataProvider
public String[][] senddata() throws IOException {
	LearnReadExcel excel = new LearnReadExcel();
	String[][] data1 = excel.readExcel("TestData");
	return data1;
}
	


}
