package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class BROKENLINKS {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	//////.........TO CLICK ON LINKS PRESENT IN FOOTER SECTION AND PRINT RESPONSE CODE.../...WITH SOFT ASSERTION....../
		SoftAssert asrt=new SoftAssert();
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link: links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int rcode=con.getResponseCode();
			System.out.println(rcode);
			asrt.assertTrue(rcode>=400, url+"is broken link");
		}
		
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(15));
		//w.until(ExpectedConditions.visibilityOfElementLocated(null);
	//////.........TO CLICK ON LINKS PRESENT IN FOOTER SECTION AND PRINT RESPONSE CODE......///////////
		/*List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link : links)
		{
		String url=link.getAttribute("href");
		HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int rcode=con.getResponseCode();
		System.out.println("Response code of active link is:"+rcode);
		if(rcode>400)
		{
			System.out.println("Response code of broken link is :"+rcode);
			Assert.assertTrue(false);											//HARD ASSERTION (REMAINIG LINKS WILL NOT BE VARIFIED)
																				// ONCE A BROKEN LINK FOUND EXECUTION WILL BE STOPPED 
		}																	// IT WILL BE INCOMPLETE TEST 
		}*/
		
		/*//////.........TO CLICK ON LINK AND PRINT RESPONSE CODE..........///////////
		String url=driver.findElement(By.cssSelector("a[href*='restapi']")).getAttribute("href");
		
		HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		
		int responseCode=con.getResponseCode();
		System.out.println(responseCode);*/
	
	}

}
