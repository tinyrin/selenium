import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// Create Driver object for chrome Browser
		
		// we will strictly implement methods of webdriver
		
		/* Class name = ChromeDriver,
		  
		  		X driver = new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "/C:\\Users\\Rin\\Downloads\\seleDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com//");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.id("pw")).sendKeys("123456");
	}

}
