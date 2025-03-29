package com.selenium.test1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Vinboxwraptoday1 {
	
 

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
	
		//System.out.println("test fails");
	//d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	//d.findElement(By.linkText("Find my account")).click();
	//d.findElement(By.partialLinkText("Find my")).click();
	/*String str=d.getTitle();
	System.out.println("title ofthe page is"+str);
	//WebElement usernameTextBox=d.findElement(By.id("Email"));
	WebElement usernameTextBox=d.findElement(By.xpath("//input[@placeholder='Enter your email']"));
	usernameTextBox.sendKeys("vinesh.miet");
	//d.findElement(By.xpath("//*[@id='next']")).click();
	//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement button1=d.findElement(By.id("next"));
	button1.click();

	Thread.sleep(4000);//*[@id='']

	WebElement passwrdextBox=d.findElement(By.id("Passwd"));
	passwrdextBox.sendKeys("shambho123");
	d.findElement(By.xpath("//*[@id='signIn']")).click();*/
 WebElement Chkbox=d.findElement(By.id("profession-0"));
 boolean isChecked= Chkbox.isSelected();
 System.out.println("check click status+isChecked");
 if (isChecked){
	System.out.println("no action required checkbox is selected");
 } 
 else {
	 Chkbox.click();
	 System.out.println("check box click status after performing click action"+Chkbox.isSelected());
 }
System.out.println("program ran successfully");
		}

	

	
	}
	
	//panjwani.kavita@gmail.com


