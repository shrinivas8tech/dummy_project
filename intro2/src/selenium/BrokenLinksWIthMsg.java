package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksWIthMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String homepage="https://rahulshettyacademy.com/loginpagePractise/";
		driver.get(homepage);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext()) {
			
		String	url=it.next().getAttribute("href");
			
			System.out.println(url);
			
			if(url==null || url.isEmpty() )  {
				System.out.println(url+"is invalid is empty");
				continue;
			}
			
			if(!url.startsWith(homepage)) {
				
				System.out.println(url+" is invalid link");
				
			}
			
			try {
				HttpURLConnection con=(HttpURLConnection) (new URL(url).openConnection());
				con.setRequestMethod("HEAD");
				con.connect();
				
				
				if(con.getResponseCode()>=404) {
					System.out.println(url+"is broken link");
					}
				else {System.out.println(url+"is valid link");
					
				}
				
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

		
	}


