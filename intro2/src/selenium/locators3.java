package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class locators3 {

	public static void main(String[] args) throws InterruptedException {
		String name="Sodali";
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\msedgedriver.exe\\");
		//WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String password=getpasswords(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello Sodali,");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	}

	public static String getpasswords(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passT=driver.findElement(By.cssSelector("form p")).getText();
		String [] passF=passT.split("'");
		String passFF=passF[1].split("'")[0];
		return passFF;
		
		
	
		
	}

}
