import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 {

	public static void main(String[] args) {
		// Create Driver object for chrome Browser
		
		// we will strictly implement methods of webdriver
		
		/* Class name = ChromeDriver,
		  
		  		X driver = new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.ie.driver", "/C:\\Users\\Rin\\Downloads\\msedgedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
