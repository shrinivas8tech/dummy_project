package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSHOTPUPBLK {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");														//to maximize before loading page
		option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-block"));		// to block/close popup that appears on loading page
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arasiddi\\Documents\\Drivers\\neeew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		
		File sShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		// takes screenshot
		FileUtils.copyFile(sShot,new File("D:\\LEARN O\\UDALHOT1.png"));			// stores physical screenshot in given path and format
		
		
		
	}

}
