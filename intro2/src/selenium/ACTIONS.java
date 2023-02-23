package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTIONS {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		//WebElement move = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
		//WebElement sbox = driver.findElement(By.cssSelector("input[name='field-keywords']"));
		//act.moveToElement(sbox).click().keyDown(Keys.SHIFT).sendKeys("Sodali").build().perform();
		WebElement search=driver.findElement(By.cssSelector("input.search-keyword"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("sodali").doubleClick().build().perform();
		// act.moveToElement(driver.findElement(By.xpath("//a[@data-nav-role='signin']"))).build().perform();
		
		
		
	}

}
