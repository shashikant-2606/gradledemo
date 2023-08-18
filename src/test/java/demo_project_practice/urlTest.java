package demo_project_practice;

import org.testng.annotations.Test;

public class urlTest extends Test_demo{
  @Test
  public void url() 
  {
	  driver.get("https://www.amazon.in/");
  }
}
