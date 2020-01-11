package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleforceE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign In']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[contains(@name, 'proceed')]")).click();

		driver.quit();

	}

}
