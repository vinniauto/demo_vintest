package vinTestngStart;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class ScreenshotHandle {
	static WebDriver driver;
	@Test
public static void takesphoto () throws IOException {


		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://google.com");
		String tempstring1 =driver.getTitle();
		//String tempstring2 =new  SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String tempstring2=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String finalstring =tempstring1+"_"+tempstring2;
		System.out.println(finalstring);
		takescreenshot(finalstring);
	}
	public static void takescreenshot(String filename) throws IOException {
		

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("D:\\u\\"+filename+"_"+System.currentTimeMillis()+".png"));
		
	}

}
