package com.streambox.eslstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountsPageSysAdminLive extends AccountsPageLive {

	@FindBy(xpath="//a[text()='Accounts']") protected WebElement accountsTabLink;
	@FindBy(xpath="//a[text()='Add Account']") protected WebElement buttonAddAccount;

	public AccountsPageSysAdminLive goToAccountsPage() {
		accountsTabLink.click();
		return PageFactory.initElements(webDriver, AccountsPageSysAdminLive.class);
	}

	public AccountsPageSysAdminLive(WebDriver webDriver) {
		super(webDriver);
	}
}
