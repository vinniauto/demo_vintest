package dinTestngStart;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Vindataparemeterization {
	
	WebDriver d = null;
@Test(dataProvider="data")
public void testDataProvider(String username,String password) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
	 d=new FirefoxDriver();
	 d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
d.get("http://gmail.com");
d.findElement(By.id("identifierId")).sendKeys(" ");
d.findElement(By.id("identifierNext")).click();
Thread.sleep(2000);
d.findElement(By.id("Passwd")).sendKeys("");	
//d.findElement(By.id("SignIn")).click();
Thread.sleep(5000);
d.close();
}


@DataProvider(name="data")
public Object[][] data(){
Object[][] data= new Object[2][2];
data[0][0]="sam.miet";
data[0][1]="shambho";
data[1][0]="ram.miet";
data[1][1]="shambho123";
return data;
}

}
