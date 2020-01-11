package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		// //tagName[@attribute='value'] - xpath
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown expath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		// //tagName[attribute='value'] - CSS
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("[value='log in']")).click();
		
		// tagName#id - CSS
		
		driver.quit();
		
	}

}
