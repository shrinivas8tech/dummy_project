package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		//act.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//div/h1[1]")).getText());
		
		
	}

}
