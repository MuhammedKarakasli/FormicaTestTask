package com.formica.tests;

import org.testng.annotations.Test;

public class CreateUserTest extends TestPage{
	
	@Test
	public void createUserTest1() throws InterruptedException {
		
		homePage.CreateUser()
		.asCreate();
		
	
	}
}
