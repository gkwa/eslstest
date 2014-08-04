package com.streambox.eslstest.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageLiveTest extends TestBase {

	LoginPageSysAdminLive loginPage;
	LivePageSysAdminLive livePage;

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
		Thread.sleep(5000);
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
