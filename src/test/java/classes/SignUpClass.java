package classes;

import java.util.Properties;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.SignUpPage;

public class SignUpClass extends BaseClass{
	
	SignUpPage sign;
	Properties prop=new Properties();
	
	@Test
	public void verifySignUp()
	{
		sign=new SignUpPage(driver);
		sign.clickSignUpButton();
		
		sign.enterUserName(prop.getProperty("userName"));
	}

}
