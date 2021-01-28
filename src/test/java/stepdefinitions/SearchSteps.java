package stepdefinitions;

import Implementation.Product;
import Implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	Search search;

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step1: I am on Search Page");
	}

	@When("I search for a product with name {string} and  price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step2: Search the product" + productName + "Price   " + price);
		
		product = new Product(productName,price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Display Product Name"+productName);
		
		search = new Search();
		String name = search.displayProduct(product);
		System.out.println("Searched product is  "+ name);
		
	}

}
