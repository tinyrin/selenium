import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// Create Driver object for chrome Browser
		
		// we will strictly implement methods of webdriver
		
		/* Class name = ChromeDriver,
		  
		  		X driver = new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
