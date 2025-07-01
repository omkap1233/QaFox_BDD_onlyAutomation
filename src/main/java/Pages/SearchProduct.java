package Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchProduct {
	
	WebDriver driver;
	
	@FindBy(xpath= "//input[@class=\"form-control input-lg\"]") private WebElement searchfeild;
	@FindBy(xpath= "//button[@class=\"btn btn-default btn-lg\"]") private WebElement searchBtn;
	@FindBy(xpath= "//a[text()='MacBook']") private WebElement Macbook;
	@FindBy(xpath= "//a[text()='MacBook Air']") private WebElement Macbookair;
	@FindBy(xpath= "//a[text()='MacBook Pro']") private WebElement Macbookpro;
	
	public SearchProduct(WebDriver driver) {
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public void EnterproductInSearchfeild(String productname) {
		searchfeild.sendKeys(productname);
	
	}
	
	public void clickOnSearchbutton() {
		searchBtn.click();
	}
	
	public ArrayList<String> Verifyresultofproductsearch() {
		String product1= Macbook.getText();
		String product2= Macbookair.getText();
		String product3= Macbookpro.getText();
		
		ArrayList <String> A= new ArrayList<String>();
		  A.add(product1);
		  A.add(product2);
		  A.add(product3);
		  
		  return A;
	}
	

	
	
	
	
	
	
}
