package vinTestngStart;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrapfun1 {
	
	public static void main(String[] args) {
		WebDriver driver= null;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();				
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains (@class,'multiselect')]")).click();
			
		//WebElement vin1 =driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container')]//li[4]//a//label"));
		//WebElement vin2= driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container')]//li[contains(@class,'active') ]//input[contains(@value,'HTML')]"));
		
		WebElement vin= driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container')]//input[contains(@value,'Angular')]"));
		
	//	all element above i found are perfect now below one is correct xpath for finding only checkbox elemnt ,will be using this in evening
		//ul[contains(@class,'multiselect-container')]//input[contains(@type,'checkbox')]
		
		System.out.println(vin.getText());
			boolean isChecked =vin.isSelected();
			System.out.println("Checkbox click status "+ isChecked);
			
			if (isChecked==true) {
				
				System.out.println("No action required checkbox is seleccted");	
			                      } 
			else
			  {
				vin.click();
				System.out.println("Checkbox click status after performing click action "+vin.isSelected());
			  }
						
			}
				}

	

	
		