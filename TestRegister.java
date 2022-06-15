package com.testRegister;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.register.RegisterUsingAssertion;

import generic.BaseTest;

public class TestRegister extends BaseTest{

	private RegisterUsingAssertion objRegisterUsingAssertion;
	
	public void initializeWebEnvironment() {
		objRegisterUsingAssertion = new RegisterUsingAssertion();
	}
	@BeforeClass
	public void checkRegisterPage() {
	this.initializeWebEnvironment();
	objRegisterUsingAssertion.initilizeOfWebDriver();
	}
	
	@AfterClass
	public void tearDownEnv() {
       objRegisterUsingAssertion.tearDown();
	}
	
	@Test	
	public void TC_01_checktheRegisteredDetails() {
	objRegisterUsingAssertion.setFullName();
	objRegisterUsingAssertion.getRegisterTextOnRegisterPage();
	objRegisterUsingAssertion.verifyRegisterTextOnRegisterPage();
	objRegisterUsingAssertion.verify();
	objRegisterUsingAssertion.verifyRCharIsPresent();
	objRegisterUsingAssertion.verifyRegisteredOnRegisterPage();
	objRegisterUsingAssertion.verifyStringIsNull();
	objRegisterUsingAssertion.verifyStringIsNotNull();
	objRegisterUsingAssertion.verifyBothTheValuesAreSame();
	objRegisterUsingAssertion.verifyBothTheValuesAreNotSame();
	}
	
}
