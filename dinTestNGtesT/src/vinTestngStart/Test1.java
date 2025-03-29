package vinTestngStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver d= null;
	@BeforeMethod
	public void beforeMethod(){
		d=new FirefoxDriver();
		 d.get("http://gmail.com");
		}
	
	@Test(priority=-1)
  public void loginToGmail() {
	 d.findElement(By.id("Email")).sendKeys("vinesh.miet@gmail.com");
	  }

	@AfterMethod
	public void afterMethod(){
		d.close();
	}
	
}
