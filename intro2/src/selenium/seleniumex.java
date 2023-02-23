package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class seleniumex {
public static void main(String[] args) {

	/*WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.close();*/
	
	/*	System.setProperty("webdriver.gecko.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
driver.quit();*/
	
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\msedgedriver.exe\\");
	WebDriver driver=new EdgeDriver();
	driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
}
}
	