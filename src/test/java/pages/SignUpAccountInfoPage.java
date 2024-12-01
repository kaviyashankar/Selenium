package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpAccountInfoPage {

	WebDriver driver;
	Select select;
	
	public SignUpAccountInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, SignUpAccountInfoPage.class);
	}
	
	@FindBy(xpath = "//input[@id=\"id_gender2\"]")
	WebElement btn_title;
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement txt_pass;
	
	@FindBy(xpath = "//select[@id=\"days\"]")
	WebElement drp_days;
	
	@FindBy(xpath = "//select[@id=\"months\"]")
	WebElement drp_months;
	
	@FindBy(xpath = "//select[@id=\"years\"]")
	WebElement drp_year;
	
	@FindBy(xpath = "//input[@id=\"first_name\"]")
	WebElement txt_firstname;
	
	@FindBy(xpath = "//input[@id=\"last_name\"]")
	WebElement txt_lastname;
	
	@FindBy(xpath = "//input[@id=\"address1\"]")
	WebElement txt_address;
	
	@FindBy(xpath = "//select[@id=\"country\"]")
	WebElement drp_country;
	
	@FindBy(xpath = "//input[@id=\"state\"]")
	WebElement txt_state;
	
	@FindBy(xpath = "//input[@id=\"city\"]")
	WebElement txt_city;
	
	@FindBy(xpath = "//input[@id=\"zipcode\"]")
	WebElement txt_zipcode;
	
	@FindBy(xpath = "//input[@id=\"mobile_number\"]")
	WebElement txt_phonenumber;
	
	@FindBy(xpath = "//button[@data-qa=\"create-account\"]")
	WebElement btn_createaccount;
	
	public void clickTitle()
	{
		btn_title.click();
	}
	
	public void enterPassword(String pass)
	{
		txt_pass.sendKeys(pass);
	}
	
	public void selectDate(int index)
	{
		select = new Select(drp_days);
		select.selectByIndex(index);
	}
	
	public void selectMonth(int index)
	{
		select = new Select(drp_months);
		select.selectByIndex(index);
	}
	
	public void selectYear(String year)
	{
		select = new Select(drp_year);
		select.selectByValue(year);
	}
	
	public void enterFirstName(String firstName)
	{
		txt_firstname.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		txt_lastname.sendKeys(lastName);
	}

	public void enterAddress(String address)
	{
		txt_address.sendKeys(address);
	}
	
	public void selectCountry(String country)
	{
		select = new Select(drp_country);
		select.selectByVisibleText(country);
	}
	
	public void enterState(String state)
	{
		txt_state.sendKeys(state);
	}
	
	public void enterCity(String city)
	{
		txt_city.sendKeys(city);
	}
	
	public void enterZipcode(String zipcode)
	{
		txt_zipcode.sendKeys(zipcode);
	}
	
	public void enterMobileNumber(String mobileNum)
	{
		txt_phonenumber.sendKeys(mobileNum);
	}
	
	public void clickSignUp()
	{
		btn_createaccount.click();
	}
}
