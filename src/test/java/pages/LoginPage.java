package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage.class);
	}
	
	@FindBy(xpath = "//i[@class=\"fa fa-lock\"]")
	WebElement btn1_signup;
	
	@FindBy(xpath = "//input[@data-qa=\"login-email\"]")
	WebElement txt_email;
	
	@FindBy(xpath = "//input[@data-qa=\"login-password\"]")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[@data-qa=\"login-button\"]")
	WebElement btn_login;
	
	public void clickSignUpHomePage()
	{
		btn1_signup.click();
	}
	
	public void enterLoginEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void enterLoginPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		btn_login.click();
	}
}
