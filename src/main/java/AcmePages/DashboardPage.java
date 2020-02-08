package AcmePages;

import SeleniumBase.ProjectSpecificMethodsAcme;

public class DashboardPage extends ProjectSpecificMethodsAcme{

	public void gettitle()  {
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
	}
	
}
