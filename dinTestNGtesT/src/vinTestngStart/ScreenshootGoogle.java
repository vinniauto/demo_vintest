package vinTestngStart;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenshootGoogle {
	static WebDriver d=null;
	@Test
	public void TestJavaS1 () {
		WebDriver d=null;
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
		d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.get("http://google.com");
		String str=d.getTitle();
ScreenshootGoogle.GetScreenSHot(d);

	}
	
	public static void GetScreenSHot(WebDriver driver){
		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		try {
	// now copy the  screenshot to desired location using copyFile method

	FileUtils.copyFile(srcFile, new File("D:\\u\"+System.currentTimeMillis()"+".png"));                   
	
	        }
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

