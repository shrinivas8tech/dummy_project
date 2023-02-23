package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendergenric {

	public static void main(String[] args) throws InterruptedException {
		// SELECT DATE
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companion/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(5000);

		driver.findElement(By.id("form-field-travel_comp_date")).click();

		/*
		 * WebElement
		 * years=driver.findElement(By.cssSelector("[class='numInput cur-year']")); //
		 * System.out.println(years.getText());
		 * while(!years.getAttribute("min").contains("2022")) { Thread.sleep(2000);
		 * driver.findElement(By.
		 * cssSelector("[class='flatpickr-month'] [class='arrowUp']")).click(); // for }
		 */

		while (!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("January")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click(); // for month
		}

		List<WebElement> datess = driver.findElements(By.cssSelector("span[class*='flatpickr-day']")); // for date
		int datecount = datess.size();
		System.out.println(datecount);
		for (int i = 0; i < datecount; i++) {
			String datee=driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).get(i).getText();
			if (datee.contains("25")) {
				Thread.sleep(3000);
				driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).get(i).click();
				break;
			}
			//System.out.println(datess.get(i).isEnabled());
			// System.out.println(datess.get(i).getText());

		}

	}
}
