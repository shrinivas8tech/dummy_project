package selenium.special;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;   //...need to add manually from selenium documentation....///
public class specialSELENIUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriever.gecko.driver","C:\\Users\\Arasiddi\\Documents\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//..get the text which is above the name text bar...//
		
		//driver.findElement(with(By.tagName("label")).above(By.xpath("//form-comp/div/form/div[1]/input"))).getText();
		//System.out.println(driver.findElement(with(By.tagName("label")).above(By.xpath("//form-comp/div/form/div[1]/input"))).getText());
		
		//...now click submit button which is below Date of Birth text.....///
		
		driver.findElement(with(By.tagName("input")).below(By.cssSelector("label[for='dateofBirth']"))).click();
		
		//...now click check box which is present left side of text...///
		
		driver.findElement(with(By.tagName("input")).toLeftOf(By.cssSelector("label[for='exampleCheck1']"))).click();
		
		//...now get text from right side of chek box.....///
		
		driver.findElement(with(By.tagName("label")).toRightOf(By.cssSelector("input[id='inlineRadio1']"))).getText();
		

	}

}
