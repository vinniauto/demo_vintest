package vinjuyi;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;
public class Vindemowind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=null;
		String Browsername="Firefox";
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

d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
d.get("https://www.online.citibank.co.in");
d.findElement(By.xpath("//*[@title='LOGIN NOW']")).click();
Set<String> noOfWindowsOpen=d.getWindowHandles();
System.out.println("Num of windows open "+noOfWindowsOpen.size());
Iterator<String> ite=noOfWindowsOpen.iterator();
String mainWindow=ite.next();
String tabwindow=ite.next();
System.out.println(mainWindow);
System.out.println(tabwindow);

d.switchTo().window(tabwindow);
d.findElement(By.id("User_Id")).sendKeys("lmohit");

d.close();
d.switchTo().window(mainWindow);
d.findElement(By.xpath("//*[@title='LOGIN NOW']")).click();

/*public static void switchToPage(WebDriver d, String title)
{
	Set<String> noofWindowsOpen=d.getWindowHandles();
	Iterator<Strings> ite=noofWindowsOpen.iterator();
	while(ite.hasNext()){
		String mainwindow= ite.next();
		d.switchTo().window(mainwindow);
		if(d.getTitle().equals(title)){
			break;
		}

}
	
}*/


	}

}
