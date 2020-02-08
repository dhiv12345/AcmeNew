package AcmePages;

import SeleniumBase.ProjectSpecificMethodsAcme;

public class LoginPage extends ProjectSpecificMethodsAcme{
	
	public LoginPage enteremail (String email) {
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;
	}
	
	public LoginPage enterpassword(String pass) {
		
	driver.findElementById("password").sendKeys(pass);
		return this;
	}
	
	public DashboardPage clicklogin() {
		
	driver.findElementById("buttonLogin").click();;
		return new DashboardPage();
	}

}
