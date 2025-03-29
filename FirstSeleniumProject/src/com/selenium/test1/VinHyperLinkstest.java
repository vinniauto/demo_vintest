package com.selenium.test1;

import java.util.concurrent.TimeUnit;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class VinHyperLinkstest {

	public static void main(String[] args) {
		WebDriver d=null;
		String Browsername="Chrome";
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
try{
	d.get("https://book.spicejet.com/Search.aspx");
//Find all links in webpage	
	List<WebElement> linksonpage= d.findElements(By.tagName("a"));
//iterate over fisrt 10 links or less than 10
	int maxLinks=Math.min(linksonpage.size(), 5);
	for (int i=0;i<maxLinks;i++){
		WebElement link=linksonpage.get(i);
		String linktext=link.getText();
		System.out.println("Title of link"+(i+1)+":"+(linktext.isEmpty() ? "no text":linktext));
	}
	
}
catch (Exception e){
		e.printStackTrace();
	}finally {
		//close browser
		d.quit();
	}
		
	}
	 


}
