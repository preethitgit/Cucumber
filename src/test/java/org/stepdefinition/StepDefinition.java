package org.stepdefinition;

import org.base.BaseClassCucumber;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClassCucumber {

	@Given("User is in facebook application")
	public void user_is_in_facebook_application() {
	   
		launchBrowser();
		url("https://en-gb.facebook.com/");
		maximize();
	}

	@When("User enter valid username")
	public void user_enter_valid_username() {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtEmail(), "preethi");  
	}

	@When("User click the forgot button")
	public void user_click_the_forgot_button() {
	   
		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	    toClick(forgot);
	}

	@Then("User is  in recover account page")
	public void user_is_in_recover_account_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("To check the url", currentUrl.contains("recover"));
		 
	}
	
}
