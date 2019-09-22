package ExtenetReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentReportDemo {

	public static void main(String[] args) {
		
		// WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		
		// driver.get("https://www.facebook.com");
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter ("D:\\Amit\\Selenium\\ScreenShot\\batch.html");
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(htmlReporter);
		ExtentTest logger = report.createTest("Aut_01_verifyLogin", "User is able to login successfully");
		
		logger.log(Status.PASS, "Username entered successfully in username text box");
		logger.log(Status.PASS, "password entered successfully in password text box");
		logger.log(Status.FAIL, "Unable to click on login button");
		logger.log(Status.INFO, "Home page is not displayed");
		
		report.flush();
		
	}

}
