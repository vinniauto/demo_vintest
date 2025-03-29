package vinjuyi;

import java.util.concurrent.TimeUnit;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Vindragdropfunct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=null;
		String Browsername="InternetExplorer";
		switch (Browsername)
		{
		case "Firefox":
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
			 d=new FirefoxDriver();
			 break;
		case "InternetExplorer":
			System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\IEDriverServer.exe");
			 d=new InternetExplorerDriver();
			break;
		case "Chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\chromedriver.exe");
		  d=new ChromeDriver();
		  
		
		}
		
d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
d.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
d.get("https://www.flipkart.com/");
d.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
//Thread.sleep(5000);
WebElement vin =d.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA' and @autocomplete='off']"));
vin.sendKeys("9980987667");
	}
private static void getScreenShot(String str){
	//File Scrfile=((TakeScreenshot)driver).getScreenShotAs(OutputType.FILE);
}


/*Alert al=d.switchTo().alert();
System.out.println(al.getText());
al.accept(); ///ok
//al.dismiss();//cancel
//switch to regular page
d.switchTo().defaultContent();
//normal commands
Thread.sleep(5000);
d.findElement(By.name("login")).sendKeys("vinesh");*/

}

