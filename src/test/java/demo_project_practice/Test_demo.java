package demo_project_practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Test_demo {
	WebDriver driver;
	 @Test
	  public void Setup1() 
	  {
		 DesiredCapabilities caps= new DesiredCapabilities();
		  
		  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		  
		  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		  
		  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		  
		  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		  
		  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		  
		  caps.setCapability("autoGrantPermissions", true);
		  
		  //Establishing the connection with appium server
		  
		  URL url = null;
		try 
		{
			url = new URL("http://127.0.0.1:4723/wd/hub/");
		}
		catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	       driver= new AndroidDriver(url,caps);
	       driver.get("https://www.amazon.com");
	  }
	  
}
