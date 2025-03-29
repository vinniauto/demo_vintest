package vinTestngStart;
//this works in sync with class customlistener and ScreenshotTest
//all we are doing to take screenshot of only failed testcases
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

public class Base1 {
public static WebDriver driver;

public static void initialization(){
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.get("http://google.com");
}
public void failed (String testMethodName){
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcfile,new File("D:\\u\\"+testMethodName+"_"+".jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}
