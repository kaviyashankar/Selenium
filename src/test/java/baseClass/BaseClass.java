package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	protected static WebDriver driver;

		@BeforeClass
		public static void setUp()
		{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://automationexercise.com/");
		}
		
		@AfterClass
		public static void tearDown()
		{
			driver.close();
		}
}
