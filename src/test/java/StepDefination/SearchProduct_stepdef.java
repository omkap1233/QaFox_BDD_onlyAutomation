package StepDefination;

import java.util.ArrayList;

import org.testng.Assert;

import Pages.SearchProduct;
import QA.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct_stepdef {

	SearchProduct Sp= new SearchProduct(DriverFactory.getdriver());

	@When("User enters a product name as {string}")
	public void user_enters_a_product_name_as(String Searchproduct) {
		Sp.EnterproductInSearchfeild(Searchproduct);
		Sp.clickOnSearchbutton();
	}

	
	@Then("All items related should display as {string} {string} {string}")
	public void all_items_related_should_display_as(String Expectedproduct1, String Expectedproduct2, String Expectedproduct3) {

		ArrayList <String> Products= Sp.Verifyresultofproductsearch();
		String ActualProduct1= Products.get(0);
		String ActualProduct2= Products.get(1);
		String ActualProduct3= Products.get(2);
		
		Assert.assertEquals(ActualProduct1, Expectedproduct1);
		Assert.assertEquals(ActualProduct2, Expectedproduct2);
		Assert.assertEquals(ActualProduct3, Expectedproduct3);
	}

	

}
