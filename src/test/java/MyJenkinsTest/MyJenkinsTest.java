package MyJenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyJenkinsTest {
	
	@Test
	public void VerifyTitle() {
		
		
	 WebDriverManager.chromedriver().setup();
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
			
	 System.out.println( driver.getTitle());
		
	driver.quit();
	}	
		
		
		
	

}
