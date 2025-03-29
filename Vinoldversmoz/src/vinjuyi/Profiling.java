package vinjuyi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni prof=new ProfilesIni();
		FirefoxProfile p=prof.getProfile("Vinprofile");
		WebDriver d=new FirefoxDriver(p);
		d.get("http://www.flipkart.com");
		
		/*d.close();// for closing driver
		 d.quit();//close all firefox windows associated with driver */
		
	}

}
