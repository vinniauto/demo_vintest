package vinjuyi;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Screenshot {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		String str=driver.getTitle();
		
		String fileName = new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
		System.out.println(fileName);
		GetScreenSHot("D:\\u\\"+fileName+"_"+str+".png");
		fileName = new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
		GetScreenSHot(fileName);

	}
	public static void GetScreenSHot(String str){
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(scrFile, new File(str));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
