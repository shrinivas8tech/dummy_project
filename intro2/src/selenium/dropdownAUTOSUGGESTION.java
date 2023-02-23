package selenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownAUTOSUGGESTION {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
	Thread.sleep(2500);
	List<WebElement> suggestions=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	for(WebElement option:suggestions)
	{
		if(option.getText().equalsIgnoreCase("IndiA"))
		{
			option.click();
			
			break;
		}
		
	}
	
}
}