import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src");
		File fs = new File(f, "Appium");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RinEmulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	}

}
