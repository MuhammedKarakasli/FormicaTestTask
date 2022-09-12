package com.formica.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CreateUserPage extends PageBase {
	
	
	public CreateUserPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	JavascriptExecutor jse=((JavascriptExecutor) driver);
	
	
	public CreateUserPage asCreate() throws InterruptedException {
		try{
		jse.executeScript("arguments[0].style.border='5px solid red'", loginUsername); Thread.sleep(1500);
		loginUsername.sendKeys("muhammedkarakasli");Thread.sleep(1500);
		jse.executeScript("arguments[0].style.border='transparent'", loginUsername);
		
		jse.executeScript("arguments[0].style.border='5px solid red'", loginPassword); Thread.sleep(1500);
		loginPassword.sendKeys("Mk987654321");Thread.sleep(1500);
		jse.executeScript("arguments[0].style.border='transparent'", loginPassword);
		
		jse.executeScript("arguments[0].style.border='5px solid red'", signinBtn);Thread.sleep(1500);
		signinBtn.click();
		
		createBtn.click();Thread.sleep(3000);
		
		username.sendKeys("theAvacado");Thread.sleep(1500);
		
		fullname.sendKeys("Emir Ali Karakaþlý");Thread.sleep(1500);
		
		password.sendKeys("emiralikarakasli01234");Thread.sleep(1500);
		
		repassword.sendKeys("emiralikarakasli01234");Thread.sleep(1500);
		
		email.sendKeys("emiralikarakasli@gmail.com");Thread.sleep(1500);

		selectG.click();Thread.sleep(1500);
		adm.click();Thread.sleep(1500);
		content.click();Thread.sleep(1500);
		
		adminBtn.click();Thread.sleep(1500);
		adminBtn.click();Thread.sleep(1500);
		
		role.click();Thread.sleep(1500);
		
		createbutton.click();Thread.sleep(3000);
		
		removeBtn.click();Thread.sleep(1500);
		areyousure.click();Thread.sleep(3000);
		}catch(Exception e) {
		System.out.println(e);
		}
	
		return new CreateUserPage(driver);
	}
	
	

}
