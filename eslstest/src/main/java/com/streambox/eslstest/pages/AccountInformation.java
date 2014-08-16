package com.streambox.eslstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountInformation extends Page {

    @FindBy(name="uname1") private WebElement inputLoginName;
    @FindBy(name="upass1") private WebElement inputPassword;
    @FindBy(name="upass2") private WebElement inputPasswordConfirm;
    @FindBy(name="udrm1") private WebElement inputGroup;
    @FindBy(name="ufirst1") private WebElement inputFirstName;
    @FindBy(name="ulast1") private WebElement inputLastName;
    @FindBy(name="ucompany1") private WebElement inputCompanyName;

	public AccountInformation(WebDriver webDriver) {
		super(webDriver);
	}

}
