package vinjuyi;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Americangolf {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// FirefoxProfile fp = new FirefoxProfile();
		// fp.setEnableNativeEvents(true);
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "E:\\Selenium\\Jars\\selenium\\IEDriverServer_x64_2.47.0\\IEDriverServer.exe"
		 * ); WebDriver driver = new InternetExplorerDriver();
		 */
		// ProfilesIni prof = new ProfilesIni();
		// FirefoxProfile p = prof.getProfile("Mohit");
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Jars\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

		d.get("http://americangolf.co.uk");

		Actions act = new Actions(d);

		WebElement golfClubmenu=d.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		act.moveToElement(golfClubmenu).build().perform();

		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		
		WebElement Ironset=d.findElement(By.xpath("//*//*[@id='CLUBS_1']//*[@class='a-level-2']//*[text()='Sets of Irons']"));
			act.moveToElement(Ironset).build().perform();

		WebElement box=d.findElement(By.xpath("//*[@id='CLUBS_1']"));
		List<WebElement> list=box.findElements(By.tagName("a"));
		 
		  for(int i=0;i<list.size();i++){
		  
		  System.out.println(list.get(i).getText()); 
		  }
		
		
		/*
		  WebElement ladies = driver.findElement(By.xpath(
		  "//[@id='navigation']/nav/ul/li[1]/div/div[1]/ul/li[2]/a"));
		  act.moveToElement(ladies).build().perform();
		  
		  WebElement box =
		  driver.findElement(By.xpath("//div[@class='CLUBS_1']/div[1]"));
		  List<WebElement> links = box.findElements(By.tagName("a"));
		  
		  System.out.println("Total links - "+ links.size());
		  
		  for(int i=0;i<links.size();i++){
		  
		  System.out.println(links.get(i).getText()); } int total=links.size();
		  Random r = new Random(); links.get(r.nextInt(total)).click();
		  */
		  //Select
		 
	}

}
