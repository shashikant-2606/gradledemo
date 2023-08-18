package demo_project_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Test_demo {
	WebDriver driver;
	 @Test
	  public void Setup1() 
	  {
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.browserstack.com");
		  System.out.println("chrome launch");
		  
	  }
		  @Test
		  public void setup2()
		  {
			  
		  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://www.browserstack.com");
		  System.out.println("firefox launch");
		  }
		  @Test
		  public void setup3()
		  {
		  //System.setProperty("webdriver.edge.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.get("https://www.browserstack.com");
		  System.out.println("edge launch");
		  }
		 
	  
}
