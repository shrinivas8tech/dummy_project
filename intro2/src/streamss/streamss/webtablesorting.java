package streamss.streamss;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webtablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//go to discount page sort in order(by clicking) and then get data again sort the same and compare 1st sorting with 2nd time sorting result//
		/*driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elelist=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> olist=elelist.stream().map(z->z.getText()).collect(Collectors.toList());
		List<String> nlist=olist.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(olist.equals(nlist));*/
		

/*	//......Print the Price of the Wheat item which is present in 1st page......////	
	List<WebElement> items=driver.findElements(By.xpath("//tbody/tr/td[1]"));
	List<String> price=items.stream().filter(i->i.getText().contains("Wheat")).map(i-> getItemPrice(i)).collect(Collectors.toList());
	price.forEach(p->System.out.println(p));*/
		
//.......Print the price of the Chocolate item presnet in 3rd page........//
		List<String> price;
		do 
	{
	List<WebElement> itemss=driver.findElements(By.xpath("//tbody/tr/td[1]"));
	 price=itemss.stream().filter(p->p.getText().contains("Chocolate")).map(p->getItemPrice(p)).collect(Collectors.toList());
	price.forEach(p->System.out.println(p));
	if(price.size()<1)
	{
		driver.findElement(By.xpath("//a[contains(@aria-label,'Next')]")).click();
		
	}
	}while(price.size()<1);
	
	
	
	}

	private static String getItemPrice(WebElement i) {
		// TODO Auto-generated method stub
		String iprice=i.findElement(By.xpath("following-sibling::td[1]")).getText();
		return iprice;
	}
}
