package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

   private WebDriver driver;

	public void initilizeOfWebDriver() {
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
//		System.getProperty("C:\\Users\\rohin\\Downloads\\eclipse-jee-2021-12-R-win32-x86_64\\github workspace\\.metadata\\.mylyn\\contexts\\demoAutomationRegister\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		this.setDriver(driver);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();		
	}
	
	public void implicitlyWait() {
		getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void tearDown() {
		getDriver().quit();
	}
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
