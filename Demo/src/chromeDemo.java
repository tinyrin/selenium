import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDemo {
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		// chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rin\\Downloads\\seleDemo\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com"); //URL in the browser
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.className("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot account?")).click();
		
	}

}
