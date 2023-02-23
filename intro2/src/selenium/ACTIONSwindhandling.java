package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ACTIONSwindhandling {

	public static void main(String[] args) 
	{
/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();*/
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.cssSelector("a.blinkingText")).click();
Set<String> windows=driver.getWindowHandles();
Iterator<String> iter=windows.iterator();
String pwind=iter.next();
String cwind=iter.next();
String gcwind=iter.next();
driver.switchTo().window(gcwind);
WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(15));
WebElement webe=driver.findElement(By.cssSelector(".im-para.red"));
System.out.println(webe.getText());
String mailId=webe.getText().split("with")[0].split("at")[1].trim();
System.out.println( mailId);
driver.switchTo().window(cwind);
driver.findElement(By.cssSelector("input#username")).sendKeys(mailId);



	}

}
