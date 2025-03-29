package vinTestngStart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
public class myScreenshotProg {
   static WebDriver d= null;
   @Test
	public static void takesphhoto() throws IOException {
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
		d=new FirefoxDriver();
	   d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.get("https://google.com");
		String filename1 = "movies";
		takescreenshot(filename1);
	}
	
	public static void takescreenshot(String filename) throws IOException{
		File file =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//File file = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\u\\"+filename+".png"));
		
	}
}
