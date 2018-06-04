package basicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest1 {

	public static void main(String[] str){
		System.setProperty("webdriver.chrome.driver", "D:/automation/chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
	}
}
