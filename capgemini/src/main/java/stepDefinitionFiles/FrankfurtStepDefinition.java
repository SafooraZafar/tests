package stepDefinitionFiles;
//import junit.framework.Assert;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataFile.DataFile;
import pageObjects.Frankfurt;

//import io.restassured.RestAssured;

//import io.restassured.response.Response;

//import io.restassured.specification.RequestSpecification;




public class FrankfurtStepDefinition {
	
	WebDriver driver;
	
	@Given("^the user is on the api homepage$")
	public void the_user_is_on_the_api_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(DataFile.homePageUrl);
	   // throw new PendingException();
	}

	@Given("^frankfurt is found in the api$")
	public void frankfurt_is_found_in_the_api() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		
	}

	@When("^the details are returned$")
	public void the_details_are_returned() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@Then("^the country is correct$")
	public void the_country_is_correct() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(DataFile.country, Frankfurt.country(driver).getText());
//	    throw new PendingException();
	}
	@Then("^the longitude is correct$")
	public void the_longitude_is_correct() throws Throwable {
		Assert.assertEquals(DataFile.longitude, Frankfurt.longitude(driver).getText());		
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@Then("^the latitude is correct$")
	public void the_latitude_is_correct() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(DataFile.latitude, Frankfurt.latitude(driver).getAttribute("value"));		
	  //  throw new PendingException();
	}
}
