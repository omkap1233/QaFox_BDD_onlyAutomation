package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingcart;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphone;
	@FindBy(xpath = "//a[text()='Apple']")
	private WebElement apple;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement Myacc;
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement loginopt;
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	private WebElement Email;
	@FindBy(xpath = "//input[@id=\"input-password\"]")
	private WebElement pass;
	@FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
	private WebElement loginbtn;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myaccpage;

	@FindBy(xpath="//a[text()='Canon EOS 5D']") private WebElement cannonEOS;
	@FindBy(xpath="//a[text()='Canon']") private WebElement cannonBrandname;
	
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	}

	public String VerifyPageTitle() {

		String Title = driver.getTitle();

		return Title;
	}

	public boolean VerifyShoppingCartIcon() {

		WebElement shoppingcarticon = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shopping Cart']")));
		boolean Actaulresult = shoppingcarticon.isDisplayed();

		return Actaulresult;
	}

	public void ClickOnIphone() {
		iphone.click();
	}

	public String VerifyBrandNameOfiphone() {

		String Actualbrandname = apple.getText();
		return Actualbrandname;
	}

	public void ClickOnMyAccountDropdown() {
		WebElement MyAccDP= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Account']")));
		MyAccDP.click();
	}

	public void clickOnLoginOption() {
		loginopt.click();
	}

	public void EnterEmailAddress(String email) {
		Email.sendKeys(email);

	}

	public void EnterPassword(String Pass) {
		pass.sendKeys(Pass);
	}

	public void ClickedOnLoginButton() {
		loginbtn.click();
	}

	public String VerifyMyAccountPage() {
		String ActualMyAcc = myaccpage.getText();
		return ActualMyAcc;
	}
	
	public void clickOnCannonEOS() {
		
		cannonEOS.click();
	}
	
	public String  getTextOfCannonBrandname() {
		
		String brandname= cannonBrandname.getText();
		
		return brandname;
	}
}
