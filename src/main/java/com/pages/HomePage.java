package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//span[contains(text(),'Purabi Rout')]")

	WebElement userNameLabel;

	@FindBy(xpath = "//div[@class ='j83agx80 l9j0dhe7']")
	WebElement dropDownLink;

	@FindBy(xpath = "//span[contains(text(),'Log Out')]")
	WebElement logout;

	@FindBy(xpath = "//span[contains(text(), 'Groups')]")
	WebElement groupsLink;

	@FindBy(xpath = "(//span[@class='tojvnm2t a6sixzi8 abs2jz4q a8s20v7p t1p8iaqh k5wvi7nf q3lfd5jv pk4s997a bipmatt0 cebpdrjk qowsmv63 owwhemhu dp1hu0rb dhp61c6y iyyx5f41'])[7]")
	WebElement yourProfile;

	@FindBy(xpath = "//span[contains(text(),'Friends')]")
	WebElement friends;

	@FindBy(xpath = "//a[@aria-label='Home']")
	WebElement home;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();

	}

	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public HomePage click_home() {
		home.click();
		return new HomePage();
	}

	public FindFriends clickOnFriends() {
		friends.click();
		return new FindFriends();
	}

	public LoginPage checkOnLogout() {
		yourProfile.click();
		logout.click();
		return new LoginPage();
	}
}
