package org.pojo;

import org.base.BaseClassCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AsosPojo extends BaseClassCucumber {


	//1.Non-para constructor
	public  void AsosPoj() {
	  PageFactory.initElements(driver,this);
		
	}
	//2.webelement as private (set as private)
	@FindBys({
			//AND Operator- both condition should be satisfied
			@FindBy(xpath="//input[@id='EmailAddress']"),//true
			@FindBy(xpath="//input[@name='Username']")//true
			
	})
	
	
	//Using @Findby method to find locators
	//@FindBy(id="email")
	private WebElement txtEmail;
	//@FindBy(id="pass")
	@FindAll({
		//OR Operator anyone condition should be satisfied
		@FindBy(xpath="//input[@id='Password']"),//true
		@FindBy(xpath="//input[@name='Password']")//false
	})
	private WebElement txtPass;
	 @FindBy(id="signin")
	private WebElement btnlogin;
	 public WebElement getTxtEmail() {
			return txtEmail;
		}
		public WebElement getTxtPass() {
			return txtPass;
		}
		public WebElement getBtnlogin() {
			return btnlogin;
		}
	
}
