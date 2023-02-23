package streamss.streamss;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class searchfilter {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("*[id='search-field']")).sendKeys("Rice");
		List<WebElement> welem=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> serchi=welem.stream().filter(i->i.getText().contains("Rice")).collect(Collectors.toList());
		
		
		Assert.assertEquals(welem.size(), serchi.size());
		
		
	}

}
