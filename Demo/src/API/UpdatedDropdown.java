package API;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class UpdatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rin\\Downloads\\seleDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("hrefIncAdt")).click(); //2 adults
			Thread.sleep(2000L);
		
		int i = 1;
		while(i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btncloseepaxoption")).click();
	}

}
