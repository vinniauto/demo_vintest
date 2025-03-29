package vinTestngStart;
//test trial new
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class NewTest {
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
	@Test(priority=0)
	  public void createGmailaccount() {
		 d.findElement(By.linkText("Create account")).click();
		  }
 
	@AfterMethod
	public void afterMethod(){
		d.close();
	}
}
  
  

  

