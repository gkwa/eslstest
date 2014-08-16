package com.streambox.eslstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LivePageLive extends Page {

	@FindBy(xpath="//a[@name='slsmap']") protected WebElement liveTabLink;
	@FindBy(xpath="//a[@name='slsfiles']") protected WebElement archiveTabLink;
	//	@FindBy(xpath="//a[@name='slsdecs']") protected WebElement decodersTabLink;

	public LivePageLive(WebDriver webDriver) {
		super(webDriver);
	}

	public void liveTabClick() {
		liveTabLink.click();
	}

	public void archiveTabClick() {
		archiveTabLink.click();
	}
}
