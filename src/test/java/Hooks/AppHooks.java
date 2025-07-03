package Hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import QA.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	DriverFactory Df;
	WebDriver driver;
	
	@Before
	public void LaunchBrowser() throws IOException {
		FileInputStream file = new FileInputStream("E:\\Automation_Priyanka_VCTC\\Priyanka_VCTC\\QaFox_BDD_Automation\\src\\test\\resources\\config.properties");
		
		Properties prop= new Properties();
		prop.load(file);
		String BN= prop.getProperty("Browser");
		
		Df= new DriverFactory();
		driver=Df.initBrowser(BN);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@AfterStep
	public void PostActions(Scenario sc) {
		
		byte[] Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(Screenshot, "image/png", Screenshot.toString());
		
	}
	
	/*@AfterStep
	public void PostActions(Scenario sc) {  //This method will take screenshot of ailed testcases only
	if(sc.isFailed()){
		
		byte[] Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(Screenshot, "image/png", Screenshot.toString());
		
		}
	} */
}
