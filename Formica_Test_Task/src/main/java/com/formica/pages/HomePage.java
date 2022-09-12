package com.formica.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	public CreateUserPage CreateUser() {
		
		return new CreateUserPage(driver);
	}
	

}
