package selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPScert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions ope=new ChromeOptions();
		ope.setAcceptInsecureCerts(true);
		Proxy po=new Proxy();
		po.setHttpProxy("sdfs");
		ope.setCapability("proxy", po);
		
		
		
		
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		Proxy poxy=new Proxy();
		poxy.setHttpProxy("ipaddress:1111");
		option.setCapability("proxy", poxy);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://http.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
