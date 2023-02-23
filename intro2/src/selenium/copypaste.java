package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class copypaste {

	public static void main(String[] args)  {
		
		WebDriver driver=new SafariDriver();
		
		String [] sitems= {"karlo","vange","kanda"};
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
	w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("fd"))));
	Actions act=new Actions(driver);
	act.doubleClick(driver.findElement(By.id("k"))).build().perform();
	
	Set<String> wind=driver.getWindowHandles();
	Iterator<String> it=wind.iterator();
	String w1=it.next();
	
	
	WebElement inks=driver.findElement(By.tagName("column"));
	for(int i=0;i<inks.findElements(By.tagName("a")).size();i++) {
		
		String klick=Keys.chord(Keys.CONTROL,Keys.ENTER);
		inks.findElements(By.tagName("a")).get(i).sendKeys(klick);
		
		

	}
	Set<String> winds=driver.getWindowHandles();
	Iterator<String> id=wind.iterator();
	if(id.hasNext()) 
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
		
	}

	
public static void main(WebDriver driver) {
	


}

}
