package API;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdownAPI {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rin\\Downloads\\seleDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http//:spicejet.com");
		Select s = new Select(driver.findElement(By.id("ct100_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5 Adults");
	}
	
}