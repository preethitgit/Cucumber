package org.stepdefinition;

import org.base.BaseClassCucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParastepDefinition extends BaseClassCucumber {
	@Given("To Launch the ParaBank Browser")
	public void to_Launch_the_ParaBank_Browser() {
	    
		launchBrowser();
		url("https://parabank.parasoft.com/parabank/index.htm");
		maximize();
	}

	@When("user click  product functionality")
	public void user_click_product_functionality() {
	   driver.findElement(By.xpath("//a[Text()='Products']")).click();
		
	}

	@When("User move to option Industries")
	public void user_move_to_option_Industries() {
		
		 driver.findElement(By.xpath("//span[Text()='Industries ']")).click();
		
	   
	}

	@When("user click on healthcare and insurance under Enterprises")
	public void user_click_on_healthcare_and_insurance_under_Enterprises() {
	    
		driver.findElement(By.xpath("//a[Text()='Healthcare & Insurance']")).click();
		
	}

	@Then("User click on accept button")
	public void user_click_on_accept_button() {
	   
		toQuit();
	}

}
