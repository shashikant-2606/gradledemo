package demo_project_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_demo 
{
	WebDriver driver;
	
	@Parameters("browser")
	 @BeforeTest
	  public void Setup(String browser) 
	  {
		 switch(browser)
		 {
		 case "chrome":
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  System.out.println("chrome launch");
		  break;
			  
		 case "firefox":
		  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  System.out.println("firefox launch");
		  break;
		
		 case "edge":
		  //System.setProperty("webdriver.edge.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  System.out.println("edge launch");
		  break;
		  
		 
		  
		  default:
		  System.out.println("not recomend");
		  }
	  }
	
	@AfterTest
	public void Teardown()
	{
		driver.quit();
	}
		 
	  
}
