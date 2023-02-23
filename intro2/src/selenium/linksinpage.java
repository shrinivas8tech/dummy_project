package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class linksinpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());		//no of links in webpage  
		
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));		//no of links in footer secction (limiting webdriver scope to footer)
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver=footerDriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));   
		System.out.println(columnDriver.findElements(By.tagName("a")).size());					//no of elements in footer column(limiting webdriver scope to footer)

		for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++) {
			String linkclick=Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(linkclick);
			Thread.sleep(8000);
			
			
		}
	Set<String> winds=driver.getWindowHandles();
	Iterator<String> ite=winds.iterator();
	
	while(ite.hasNext()) {
		ite.next();
		System.out.println(driver.getTitle());
		
	}
	
	driver.switchTo().newWindow(WindowType.TAB);
	}
}
