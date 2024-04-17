package org.base;

import java.awt.Frame;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCucumber {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static TakesScreenshot tk;
	public static Frame f;
	public static JavascriptExecutor js;
	public static Select s;
	//Launch browser
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Preethi\\Workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	//loadUrl
	public static void url(String url) {
		
		driver.get(url);
		
	}
	//getAttribute - to retrieve the text from text box
	public static String toAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
        return attribute;
	}
	//maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//Currenturl
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	//getTitle
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	//Sendkeys
	public static void fill(WebElement element, String userText) {
		element.sendKeys(userText);
		
	}
	//ToClick
	public static void toClick(WebElement element) {
		element.click();
		
	}
	
	public static void toQuit() {
	driver.quit();

	}
	
	//actions
		public static void moveToElement(WebElement element) {
			a.moveToElement(element).perform();

		}
		
		public static void dragAndDrop(WebElement src, WebElement des) {
			a.dragAndDrop(src, des).perform();
			
		}
		
		
		public static void doubleClick(WebElement element) {
			a.doubleClick(element);

		}
		public static void contextClick(WebElement element) {
			a.contextClick(element);
			//key down, keyup
		}
		//robot
	    public static void keyPres(int element) {
			r.keyPress(element);
		}
		
		public static void keyReleas(int element) {
			r.keyRelease(element);

		}
		//alert
		public static void accept() {
			al.accept();
		}
		
		public static void dismiss() {
			al.dismiss();
		}
		
		public static void getText() {
			al.getText();

		}
		public static void sendKey(String userText) {
			al.sendKeys(userText);

		}
		

		
		public static void getScreenshot(String Filepath) throws IOException {
			File src = tk.getScreenshotAs(OutputType.FILE);
			File des=new File(Filepath);
			FileUtils.copyFile(src, des);

		}
		
		private void frame( String element) {
		
		

		}
		
		public static void sendExecuteScript(String userText, WebElement element ) {
			 //setattribute->sendkeys
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript(userText, element);

		}
		
		public static void getAttributeExecuteScript( String userText, WebElement element) {
			Object o1 = js.executeScript(userText, element);
		    String s=(String)o1;

		}
		
		public static void scrollDownExecuteScript( String userText, WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript(userText, element);

		}
		public static void scrollUpExecuteScript(String userText, WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript(userText, element);

		}
		private void getWindowHandle() {
		
		}
		
		public static void selectByValue(String element) {
			s.selectByValue(element);

		}
		
		public static void selectByVisibleText(String text) {
			s.deselectByVisibleText(text);

		}
		
		public static void selectByIndex(Integer number ) {
			s.deselectByIndex(number);

		}
		public static void deselectByValue(String element) {
			s.deselectByValue(element);
		}
		public static void deselectByVisibleText(String text) {
			s.deselectByVisibleText(text);

		}			
			public static void deselectByIndex(Integer number) {
				s.deselectByIndex(number);

			}
			public static void deSelectAll() {
				s.deselectAll();

			}
		public static String getFirstSlectedOption() {
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
		

		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}

