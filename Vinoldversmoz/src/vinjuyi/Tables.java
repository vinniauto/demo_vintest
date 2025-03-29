package vinjuyi;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {

public static void main(String[] args) {
	WebDriver driver= null;
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\JPMorgan-master\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get("http://money.rediff.com/gainers/bse/weekly");
	
	List<WebElement> allRows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	
	System.out.println("Number of rows: "+ allRows.size());

	for (int i = 0; i < 2; i++) {
		System.out.println(allRows.get(i).getText());
	}
	System.out.println("******************************************");
    List<WebElement> allColumnsRow1=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
	
	System.out.println("Number of Columns: "+ allColumnsRow1.size());

	for (int i = 0; i < allColumnsRow1.size(); i++) {
		System.out.println(allColumnsRow1.get(i).getText());
	}
	String str="Mangalam Organics";
	int rownNumber=0;
	List<WebElement> allCompanyName=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	System.out.println(allCompanyName.size());
	for (int i = 0; i < allCompanyName.size(); i++) {
		if(allCompanyName.get(i).getText().equals(str)){
			rownNumber=i+1;
			break;
		}
	}
	
	System.out.println("Mangal organics is present at rom number "+ rownNumber);
	
	String prevClose=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rownNumber+"]/td[3]")).getText();
	System.out.println("Mangalam organics prev close value is :  "+prevClose);
}}


