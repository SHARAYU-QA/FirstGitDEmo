import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClassDemo {
	
	@BeforeTest
	
	public void Test()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/upgrade_to_selenium_4/");
	}
  @Test
  public void f() {
	  
	 System.out.println("Hello World");
  }
}
