import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// Create Driver object for chrome Browser
		
		// we will strictly implement methods of webdriver
		
		/* Class name = ChromeDriver,
		  
		  		X driver = new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "/C:\\Users\\Rin\\Downloads\\seleDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com"); //Hit url on the browser
		System.out.println(driver.getTitle()); //Validate if your page title is correct
		
		//Validate if you are landed on correct url
		System.out.println(driver.getCurrentUrl()); //"getCurrentUrl" To open the browser with new window
		
		//System.out.println(driver.getPageSource()); //Print page source
		
		driver.get("http://yahoo.com");
		//How to go back to previous page
		driver.navigate().back();
		//How to go forward page (Selenium bugs, waiting for fixing it)
		driver.navigate().forward();
		//How to close the "Current" browser
		driver.close();
		//How to close the "All" browsers opened by selenium script
		//driver.quit();
	}

}
