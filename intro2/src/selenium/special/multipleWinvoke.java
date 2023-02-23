package selenium.special;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWinvoke {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().newWindow(WindowType.TAB);
		Set<String> winds=driver.getWindowHandles();
		Iterator<String> ite=winds.iterator();
		String w1=ite.next();							//default opening
		String w2=ite.next();							//1st web
		String w3=ite.next();							//2nd blank window + later 2nd url
		driver.switchTo().window(w3);
		driver.get("https://www.rahulshettyacademy.com/");
		String coursetxt=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/'] ")).get(1).getText();
		System.out.println(coursetxt);
		driver.switchTo().window(w2);
		driver.findElement(By.cssSelector("input[minlength='2']")).sendKeys(coursetxt);
		
		//....TAKING PARTIAL SCREENSHOT.....//
		//..taking name box screenshot only...//
		
		
		WebElement name=driver.findElement(By.cssSelector("input[minlength='2']"));
		File ssht=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssht,new File("sht.jpg"));  //here in we did not mention file path  you can see file in project area after refreshing

		//VALIDATING HEIGHT AND WIDTH .... validate height and width of name bar//
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssht,new File ("m.png"));
		
	}
}

