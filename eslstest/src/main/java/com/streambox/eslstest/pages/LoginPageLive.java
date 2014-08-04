package com.streambox.eslstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLive extends Page {

	// <input class="entryfield" id="username" name="login" type="text">
	@FindBy(xpath="//div[@id='flogin']//input[@id='username']") protected WebElement login_input_field;
	@FindBy(xpath="//div[@id='flogin']//input[@id='password']") protected WebElement password_input_field;
	@FindBy(xpath="//div[@id='flogin']//button[text()='Log In']") protected WebElement login_button;

	public LoginPageLive(WebDriver webDriver) {
		super(webDriver);
	}

}
