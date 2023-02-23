package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ASSIGNMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		List<WebElement> ele = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(ele.size());*/

		String s="maam";
		String  s1= "aamaam";
		String a;
		s.replace("m", "f");
		int y=s.compareToIgnoreCase(s1);
		System.out.println(y);
	}

	
}
