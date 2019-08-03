import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		// Create Driver object for chrome Browser
		
				// we will strictly implement methods of webdriver
				
				/* Class name = ChromeDriver,
				  
				  		X driver = new X();*/
				//invoke .exe file first
		// geckodriver.exe
		System.setProperty("webdriver.geckodriver.exe", "C:\\Users\\Rin\\Downloads\\seleDemo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
