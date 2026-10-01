import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List <WebElement> dropdowns = driver.findElements(By.cssSelector("li[class ='ui-menu-item'] a"));
		
		for (WebElement dropdown : dropdowns) 
		{
			if (dropdown.getText().equalsIgnoreCase("India"))
					{
						dropdown.click();
						break;
					}
		}
		
		
		
		
		//
		//driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("Ind");
		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@value='GOI']")).click();
		 * driver.findElement(By.xpath("//a[@value='AIP']")).click();
		 * driver.findElement(By.className("paxinfo")).click(); Thread.sleep(2000);
		 * 
		 * 
		 * for(int i=1;i<=2;i++) { driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * }
		 */
	}		
}
