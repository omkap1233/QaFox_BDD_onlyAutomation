package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Homepage;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_StepDef {

	Homepage Hp = new Homepage(DriverFactory.getdriver());

	@Given("User is at homepage of QaFox")
	public void user_is_at_homepage_of_qa_fox() {

		WebDriver driver = DriverFactory.getdriver();
		driver.get("https://tutorialsninja.com/demo/");

	}

	@Then("Page title should be display as {string}")
	public void page_title_should_be_display_as(String Expectedtitle) {

		String ActaulTitle = Hp.VerifyPageTitle();
		Assert.assertEquals(ActaulTitle, Expectedtitle);
	}

	@Then("Shopping cart icon should be display on homepage")
	public void shopping_cart_icon_should_be_display_on_homepage() {

		boolean ActaulResult = Hp.VerifyShoppingCartIcon();
		Assert.assertTrue(ActaulResult);
		
	}

	@When("User clicks on iphone of featured option")
	public void user_clicks_on_iphone_of_featured_option() {
		Hp.ClickOnIphone();
	}

	@Then("User able to see brand name of iphone as {string}")
	public void user_able_to_see_brand_name_of_iphone_as(String ExpectedBrandname) {
		
		String ActualBrandname= Hp.VerifyBrandNameOfiphone();
		Assert.assertEquals(ActualBrandname, ExpectedBrandname);
		
	}

	@When("User clicks on My account dropdown")
	public void user_clicks_on_my_account_dropdown() {

		Hp.ClickOnMyAccountDropdown();
	}

	@When("User clicks on login option")
	public void user_clicks_on_login_option() {

		Hp.clickOnLoginOption();
	}

	@When("User enter login credentials as {string} and {string}")
	public void user_enter_login_credentials_as_and(String EM, String PSW) throws InterruptedException {

		Hp.EnterEmailAddress(EM);
		
		Thread.sleep(2000);
		Hp.EnterPassword(PSW);
		
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		Hp.ClickedOnLoginButton();
	}

	@Then("User should be redirected to my account page as {string}")
	public void user_should_be_redirected_to_my_account_page_as(String ExpectedPage) {
		String ActualPage= Hp.VerifyMyAccountPage();
		Assert.assertEquals(ActualPage, ExpectedPage);
	
	}

}
