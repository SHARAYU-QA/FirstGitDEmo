import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		Select select = new Select (dropdown);
		select.selectByContainsVisibleText("USD");
		select.selectByIndex(1);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("AED");
		select.selectByVisibleText("USD");
		System.out.println(select.getFirstSelectedOption().getText());
		
		
		
		
		
		

	}

}
