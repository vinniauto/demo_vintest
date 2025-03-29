package com.selenium.test1;

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
		//	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
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
d.get("http://americangolf.co.uk");
Actions act=new Actions(d);
WebElement golfClubmenu=d.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a"));
act.moveToElement(golfClubmenu).build().perform();
	}

}
