package com.selenium.test1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vinmaptrial1 {

	public static void main(String[] args) throws InterruptedException {
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

d.get("http://toolsqa.com/automation-practice-form/");
WebElement ele=d.findElement(By.id("photo"));
ele.sendKeys("C:\\Users\\Administrator\\Desktop\\vin.docx");

/*List <WebElement> radiobuttons= d.findElements(By.name("exp"));
int exp=5;
for(int i=0;i<radiobuttons.size();i++){
	if (i+1==exp){
		String checkedvalue=radiobuttons.get(i).getAttribute("checked");
		System.out.println("before click value"+checkedvalue);
		radiobuttons.get(i).click();
		checkedvalue=radiobuttons.get(i).getAttribute("checked");
		System.out.println("after clicking"+checkedvalue);
	break;
	}
System.out.println(+exp);
}
/*switch (exp){
case 1:
	radiobuttons.get(0).click();
	break;
case 2:
	radiobuttons.get(1).click();
	break;
case 3:
	radiobuttons.get(2).click();
	break;
case 4:
	radiobuttons.get(3).click();
	break;
case 5:
	radiobuttons.get(4).click();
	break;
case 6:
	radiobuttons.get(5).click();
	break;
}*/


	}
}



