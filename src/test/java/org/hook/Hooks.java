package org.hook;

import org.base.BaseClassCucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClassCucumber {
	@Before(order = 1)
	public void bf() {
		launchBrowser();	

	}
	@Before(order = 3)
	public void bf1() {
		System.out.println("before launch take screenshot");

	}
	@Before(order = 2)
	private void bf2() {
		maximize();

	}
	@After(order = 4)
	public void af() {
		toQuit();

	}
	@After(order = 5)
public void af1() {
	System.out.println("after launch take screenshot");

}
}
