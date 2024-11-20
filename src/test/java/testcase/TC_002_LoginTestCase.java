package testcase;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC_002_LoginTestCase extends ProjectSpecificationMethod {
	
	public void LoginTest() {
		
		HomePage objHomePage = new HomePage(driver);
		objHomePage.logiPageClick()
		.mail("jack123@gmail.com")
		.password("jack.123")
		.LoginButton();
	}

}
