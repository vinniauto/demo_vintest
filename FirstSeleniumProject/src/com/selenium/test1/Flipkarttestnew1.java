package com.selenium.test1;

import java.awt.Desktop.Action;
//import java.awt.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkarttestnew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=null;
		String Browsername="Chrome";
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
d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
d.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
d.manage().deleteAllCookies();
d.get("https://www.flipkart.com/");
Actions act= new Actions(d);
act.sendKeys(Keys.ESCAPE).build().perform();
//List <WebElements> vin =d.findElements(By.xpath("//table"));
List <WebElement> vin =d.findElements(By.xpath("//table"));
WebElement viin =d.findElement(By.xpath("//table"));
Select sel = new Select(viin);
sel.selectByIndex(0);
sel.selectByValue("vinnu");
sel.selectByVisibleText("audi");
	}
public static void sendkeys(WebDriver d, WebElement element,int timeout ,String value){
	new WebDriverWait(d ,timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}
public static void clickon(WebDriver d, WebElement locator,int timeout ,String value){
	new WebDriverWait(d ,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
    locator.click();
}
}
