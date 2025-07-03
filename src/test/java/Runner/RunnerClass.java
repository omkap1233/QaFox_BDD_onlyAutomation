package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {
				"E:\\Automation_Priyanka_VCTC\\Priyanka_VCTC\\QaFox_BDD_Automation\\src\\test\\resources\\App_Features" },

		glue = { "StepDefination", "Hooks" },

		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" }

)
public class RunnerClass extends AbstractTestNGCucumberTests {

}
