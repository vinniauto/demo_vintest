package dinTestngStart;
//this works in sync with class Base1 and customlistener
//all we are doing to take screenshot of only failed testcases
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base1 {

	@BeforeMethod
	public void setUp(){
		initialization();
	}
	
	@AfterMethod
	public void teardown(){
	
		driver.quit();
	}
	
	@Test(priority=-2)
	public void LoginTest(){
	  AssertJUnit.assertEquals(true, true);
	}
		
	@Test(priority=-1)
	public void BFA_ClientSearch_Test(){
	  AssertJUnit.assertEquals(true, true);
	}
	
	@Test(priority=0)
	public void chapsPaymentTest(){
	  AssertJUnit.assertEquals(false, true);
	}
	
	@Test(priority=1)
	public void BacsPaymentTest(){
	  AssertJUnit.assertEquals(false, true);
	}
	
}
