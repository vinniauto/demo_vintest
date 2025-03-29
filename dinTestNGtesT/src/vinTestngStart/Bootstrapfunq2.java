package vinTestngStart;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Bootstrapfunq2 {

	public static void main(String[] args) {
		WebDriver driver= null;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();				
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains (@class,'multiselect')]")).click();
			
		List<WebElement> alldropdown=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//input[contains(@type,'checkbox')]"));
		
	//	all element above i found are perfect now below one is correct xpath for finding only checkbox elemnt ,will be using this in evening
		
		
		
		System.out.println("Number of rows: "+ alldropdown.size());

		for (int i = 0; i < alldropdown.size(); i++) {
			System.out.println(alldropdown.get(i).getText());
			boolean isChecked =alldropdown.get(i).isSelected();
			System.out.println("Checkbox click status "+ isChecked);
			
			if (isChecked==true) {
				
				System.out.println("No action required checkbox is selected");	
			                      } 
			else
			  {
				alldropdown.get(i).click();
				System.out.println("Checkbox click status after performing click action "+alldropdown.get(i).isSelected());
			  }
			
			
			
			}
			/*
		for (int i = 0; i < alldropdown.size(); i++) {
			System.out.println(alldropdown.get(i).getText());
			if (alldropdown.get(i).getText().contains("Angular")){
				alldropdown.get(i).click();
				break;
			}*/
	}}

	

	

