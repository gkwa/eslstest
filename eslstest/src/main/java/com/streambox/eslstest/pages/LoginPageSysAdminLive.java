package com.streambox.eslstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSysAdminLive extends LoginPageLive {

	public LoginPageSysAdminLive(WebDriver webDriver) {
		super(webDriver);
	}

	public LivePageSysAdminLive login(String username, String pass) {
		login_input_field.sendKeys(username);
		password_input_field.sendKeys(pass);
		login_button.click();
		return PageFactory.initElements(webDriver, LivePageSysAdminLive.class);
	}

}
