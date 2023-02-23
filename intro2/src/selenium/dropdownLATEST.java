package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdownLATEST {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isEnabled());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		if(driver.findElement(By.cssSelector("Div#Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("disabled");
			Assert.assertTrue(false);
		}
		
	}
	
}
