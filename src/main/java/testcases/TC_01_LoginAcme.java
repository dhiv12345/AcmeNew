package testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import AcmePages.LoginPage;
import SeleniumBase.ProjectSpecificMethodsAcme;

public class TC_01_LoginAcme extends ProjectSpecificMethodsAcme{
	String excelFileName;
	
	@BeforeSuite
	public void readexcel() {
		excelFileName = "TestData";
	}

	@Test(dataProvider ="senddata")
	public void runloginacme (String email, String pass)  {
		new LoginPage().enteremail(email).enterpassword(pass).clicklogin().gettitle();
	}

}
