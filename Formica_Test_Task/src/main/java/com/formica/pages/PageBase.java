package com.formica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	WebDriver driver;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	
	
	@FindBy(id = "username")
	WebElement loginUsername;
	
	@FindBy(id = "password")
	WebElement loginPassword;
	
	@FindBy(id = "kc-login")
	WebElement signinBtn;
	
	@FindBy(id = "user-component-header-create-button")
	WebElement createBtn;
	
	@FindBy(id = "user-creator-drawer-content-username-input")
	WebElement username;
	
	@FindBy(id = "user-creator-drawer-content-fullname-input")
	WebElement fullname;
	
	@FindBy(id = "user-creator-drawer-content-password-input")
	WebElement password;
	
	@FindBy(id = "user-creator-drawer-content-repassword-input")
	WebElement repassword;
	
	@FindBy(id = "user-creator-drawer-content-email-input")
	WebElement email;
	
	@FindBy(id = "user-creator-drawer-content-groups-selectbox")
	WebElement selectG;
	
	@FindBy(xpath ="//li[normalize-space()='Administration']")
	WebElement adm;
	
	@FindBy(id = "user-creator-drawer-content-admin-switch")
	WebElement adminBtn;
	
	@FindBy(id = "user-creator-drawer-content-role-selectbox")
	WebElement role;
	
	@FindBy(id = "user-creator-drawer-header-update-button")
	WebElement createbutton;
	
	@FindBy(xpath = "//div[@id='user-creator-drawer-content']")
	WebElement content;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/span[1]/div[1]/a[1]")
	WebElement removeBtn;
	
	@FindBy(xpath = "//button[@class='ant-btn primary-button ant-btn-primary ant-btn-sm']")
	WebElement areyousure;
	
	
	
	

}
