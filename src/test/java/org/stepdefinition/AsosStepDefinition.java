package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.BaseClassCucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.AsosPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AsosStepDefinition extends BaseClassCucumber {


@Given("To Launch the ASOS Browser")
public void to_Launch_the_ASOS_Browser() {
  launchBrowser();
   url("https://www.asos.com/women/");
   
	
}

@When("To Mousehover  New In functionality")
public void to_Mousehover_New_In_functionality() {
	WebElement New = driver.findElement(By.xpath("//span[text()='New in']"));
	Actions a = new Actions(driver);
	a.moveToElement(New).perform();
	
   
}

@When("To click the options clothing under New In Dropdown")
public void to_click_the_options_clothing_under_New_In_Dropdown() {
 driver.findElement(By.xpath("//a[text()='Clothing']")).click();
	
}

@When("Click on tops options under categories")
public void click_on_tops_options_under_categories() {
	driver.findElement(By.xpath("//div[text()='Category']")).click();
	driver.findElement(By.xpath("//div[text()='Tops']")).click();
   
}

@Then("Click on first image")
public void click_on_first_image() {
   
	driver.findElement(By.xpath("//p[text()='ASOS DESIGN Hourglass slim fit t-shirt in rib in black']")).click();
	
}

//need to add implicit wait


//Scenario 2

@When("To Mousehover Dresses functionality")
public void to_Mousehover_Dresses_functionality() {
	
   WebElement dresses = driver.findElement(By.xpath("//span[text())='Dresses']"));
   Actions a = new Actions(driver);
   a.moveToElement(dresses).perform();
   
}

@When("To click Trending now options under sundresses")
public void to_click_Trending_now_options_under_sundresses() {
    
	driver.findElement(By.xpath("//span[text()='Sundresses']")).click();
	
}

@When("Click size dropdown and select {int}XS option")
public void click_size_dropdown_and_select_XS_option(Integer int1) {
   
	driver.findElement(By.xpath("//div[text()='Size']")).click();
	driver.findElement(By.xpath("//div[text()='2XS']")).click();
}

@Then("click on the second image")
public void click_on_the_second_image() {
    
	driver.findElement(By.xpath("//p[text()='Monki long sleeve midi dress with ruffled hem in orange gingham']")).click();
	
	
}

@When("To add datas in {string} email field")
public void to_add_datas_in_email_field(String string) {
   WebElement account = driver.findElement(By.xpath("//div[@id='myAccountDropdown']"));
	Actions a = new Actions(driver);
	a.moveToElement(account).perform();
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	AsosPojo aj = new AsosPojo();
	fill(aj.getTxtEmail(), "pojo");
}

@When("To add datas in {string} password field")
public void to_add_datas_in_password_field(String string) {

	AsosPojo aj = new AsosPojo();
	fill(aj.getTxtPass(), "pojo123");
	
}

@Then("click on Sign In button")
public void click_on_Sign_In_button() {
	AsosPojo aj = new AsosPojo();
	toClick(aj.getBtnlogin());
    
}








}
