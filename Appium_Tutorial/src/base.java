import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	//public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	public static void main(String[] args) throws MalformedURLException
	{
	
	AndroidDriver<AndroidElement>  driver;
     
	System.out.println("Appium Demo ....");
	
	System.out.println("Appium Demo test....");	
	 File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    driver = new AndroidDriver<>(new URL("http://192.168.43.76:4723/wd/hub"), capabilities);
	    
	  //  return driver;
	}
	
	

}
