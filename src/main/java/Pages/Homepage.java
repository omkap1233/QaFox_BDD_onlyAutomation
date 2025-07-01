package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	
	@FindBy(xpath="//span[text()='Shopping Cart']") private WebElement shoppingcart;
	@FindBy(xpath="//a[text()='iPhone']") private WebElement iphone;
	@FindBy(xpath="//a[text()='Apple']") private WebElement apple;
	@FindBy(xpath="//span[text()='My Account']") private WebElement Myacc;
	@FindBy(xpath="(//a[text()='Login'])[1]") private WebElement loginopt;
	@FindBy(xpath="//input[@id=\"input-email\"]") private WebElement Email;
	@FindBy(xpath="//input[@id=\"input-password\"]") private WebElement pass;
	@FindBy(xpath="//input[@class=\"btn btn-primary\"]") private WebElement loginbtn;
	@FindBy(xpath="//h2[text()='My Account']") private WebElement myaccpage;
	
	
	public Homepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public String VerifyPageTitle() {
		
		String Title= driver.getTitle();
		
		return Title;
	}
	
	public boolean VerifyShoppingCartIcon() {
		
		boolean Actaulresult= shoppingcart.isDisplayed();
		
		return Actaulresult;
	}
	
	public void ClickOnIphone() {
		iphone.click();
	}
	
	public String VerifyBrandNameOfiphone() {
		
		String Actualbrandname= apple.getText();
		return Actualbrandname;
	}
	
	public void ClickOnMyAccountDropdown() {
		Myacc.click();
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
		String ActualMyAcc= myaccpage.getText();
		return ActualMyAcc;
	}
}
