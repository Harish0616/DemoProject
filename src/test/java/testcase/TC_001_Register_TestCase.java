package testcase;

import base.ProjectSpecificationMethod;
import pages.HomePage;


public class TC_001_Register_TestCase extends ProjectSpecificationMethod{

	public void register() {
		HomePage obj = new HomePage(driver);
				obj.registerClick()
				.FirstName("jack")
				.LastName("D")
				.Email("jack123@gmail.com")
				.password("jack.123")
				.confirmpassword("jack.123")
				.registerButton()
				.Logout();
	}
}
