package Appium.Jenkins;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestJenkins {

	@Test
	public void testLaunch() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,System.getProperty("PlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus6P");
		capabilities.setCapability("app","C:\\Users\\Moataz\\Desktop\\selendroid.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);	
		driver.quit();
	}
}
