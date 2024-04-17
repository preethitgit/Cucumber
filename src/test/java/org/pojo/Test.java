package org.pojo;

import org.base.BaseClassCucumber;

public class Test extends BaseClassCucumber {

public static void main(String[] args) {
		
		launchBrowser();
		url("https://www.asos.com/women/");
		maximize();
		currentUrl();
		title();
		
	   AsosPojo aj = new AsosPojo();
		fill(aj.getTxtEmail(), "Preethi");
		fill(aj.getTxtPass(), "preethi123");
		toClick(aj.getBtnlogin());
		//To login Pojo method 1
		//WebElement email = l.getTxtEmail();
		//fill(email, "Preethi");
		
		//WebElement pass = l.getTxtPass();
		//fill(pass, "preethi123");
		
		//WebElement login = l.getBtnlogin();
		//toClick(login);
		
	
		
	}
}
