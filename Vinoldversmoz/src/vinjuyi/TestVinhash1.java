package vinjuyi;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestVinhash1 {

	public static void main(String[] args) {
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
				
d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
d.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
d.get("https://americangolf.co.uk");
Actions act=new Actions(d);
WebElement golfClubmenu=d.findElement(By.xpath("//*[@class='li-level-1']//a[contains(text(),'Golf Clubs')]"));
act.moveToElement(golfClubmenu).build().perform();

/*WebElement Men=d.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/div/div[1]/ul/li[2]/a"));
act.moveToElement(Men).build().perform();*/

WebElement Ironset=d.findElement(By.xpath("//*[@id='CLUBS_1']//*[@class='a-level-2']//*[text()='Sets of Irons']"));
Ironset.click();
//act.moveToElement(Ironset).build().perform();



/*WebElement ironsetdrag=d.findElement(By.xpath("//*[@id='secondary']/div[1]/div[2]/div[1]/div[1]/span[2]"));
act.dragAndDropBy(ironsetdrag,-100, 0).build().perform(); */
//*************************************************************************
/*d.manage().window().maximize();
WebElement Chkbox=d.findElement(By.xpath("//*[@id='secondary']/div[1]/div[2]/div/ul/li[4]/a"));
act.moveToElement(Chkbox).build().perform();
JavascriptExecutor js =(JavascriptExecutor)d;
System.out.println("good give try");
js.executeScript("window.scrollTo(0,'element.getLocation().x+')");
System.out.println("good give one more try");
Chkbox.click();*/
//***************************************************************************************************
/*boolean isChecked= Chkbox.isSelected();
System.out.println("check click status+isChecked");

if (isChecked){
	System.out.println("no action required checkbox is selected");
} 
else {
	 Chkbox.click();
	 System.out.println("check box click status after performing click action"+Chkbox.isSelected());
}*/
System.out.println("program ran successfully");

	}

}

