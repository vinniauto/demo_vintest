package dinTestngStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
//vintestmaincomit to git6
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();

		driver.get("http://toolsqa.com/automation-practice-form/");
  // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		WebElement ChkBox = driver.findElement(By.id("profession-0"));
		boolean isChecked = ChkBox.isSelected();
		System.out.println("Checkbox click status "+ isChecked);
		ChkBox.click();

		if (isChecked) {

			System.out.println("No action required checkbox is seleccted");
		} 
		else 
		{
			ChkBox.click();
			System.out.println("Checkbox click status after performing click action "+ ChkBox.isSelected());

		}
		  
			
		

	}

}


//*[@id='secondary']//*[@class='listingchange']/a