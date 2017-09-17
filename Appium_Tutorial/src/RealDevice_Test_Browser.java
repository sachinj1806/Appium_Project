
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevice_Test_Browser {

	// public static AndroidDriver<AndroidElement> capabilities() throws
	// MalformedURLException
	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		/*File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");*/
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://192.168.1.100:4723/wd/hub"), capabilities);
		//driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("rj8962@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("fdgd");
		driver.findElement(By.name("login")).click();

		// return driver;
	}

}
