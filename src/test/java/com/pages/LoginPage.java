package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver idriver) {
		
		this.driver=idriver;
	}
	
	@FindBy(xpath="//input[@placeholder='E-mail address']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginButton;
	
	public void loginToCRM(String UsernameApp, String PasswordApp) throws InterruptedException {
		Thread.sleep(3000);

		username.sendKeys(UsernameApp);
		System.out.println("username entered.");
		Thread.sleep(2000);
		password.sendKeys(PasswordApp);
		System.out.println("Password entered.");
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(3000);
		System.out.println("clicked on Login btn.");
		
	}

}
