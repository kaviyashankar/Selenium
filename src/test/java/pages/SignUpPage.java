package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class=\"fa fa-lock\"]")
	WebElement btn1_signup;
	
	@FindBy(xpath = "//input[@name=\"name\"]")
	WebElement txt_name;
	
	@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
	WebElement txt_email;
	
	@FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
	WebElement btn2_signup;
	
	public void clickSignUpHomePage()
	{
		btn1_signup.click();
	}
	
	public void enterUserName(String name)
	{
		txt_name.sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void clickSignUpButton()
	{
		btn2_signup.submit();
	}
}
