import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id className, androidUIautomator
		/*	xpath Syntax
		 * 	//tagName[@attribute = 'value']
		 * 
		 * 	className = tagName
		 * 
		 */
		
		driver.findElementByXPath("//android.widget.TextView[@text = 'Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	}

}
