package com.streambox.eslstest.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageSysAdminLiveTest extends TestBase {

	LoginPageSysAdminLive loginPage;
	LivePageSysAdminLive livePage;
	AccountsPageLive accountsPage;

	@Parameters({ "path" })
	@BeforeClass
	public void testInit(String path) {

		// Load the page in the browser
		driver.get(baseUrl + path);
		loginPage = PageFactory.initElements(driver, LoginPageSysAdminLive.class);
	}

	@Test
	public void testLogin() throws InterruptedException {
		livePage = loginPage.login("admin","demo");
		Thread.sleep(1000);
		livePage.archiveTabClick();
		Thread.sleep(1000);
		livePage.liveTabClick();
		Thread.sleep(1000);
		accountsPage = livePage.goToAccountsPage();
		Thread.sleep(10000);
	}

	@Test
	public void testUsernameInputExisting() throws InterruptedException {
		//		Assert.assertTrue(loginpage.getUsernameInput() != null);
	}

	@Test
	public void test2() throws InterruptedException {
		Assert.assertTrue(true);
	}
}
