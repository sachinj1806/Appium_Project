
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevice_Test {

	// public static AndroidDriver<AndroidElement> capabilities() throws
	// MalformedURLException
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://192.168.1.100:4723/wd/hub"), capabilities);
		//driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		// return driver;
		

		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(5000);
	     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	     driver.findElementById("android:id/checkbox").click();
	}
	
}