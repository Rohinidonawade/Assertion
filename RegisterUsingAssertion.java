package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import generic.BaseTest;

public class RegisterUsingAssertion extends BaseTest {
	
	private String strActualValue = "Register";
	private String strActualWord = "RegisterPage";
	
   By Loc_inpFirstName = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']");
   By Loc_inpLastNme = By.xpath("//input[@ng-model='LastName']");
   
	public void setFullName() {
	getDriver().findElement(Loc_inpFirstName).sendKeys("kalpana");
	getDriver().findElement(Loc_inpLastNme).sendKeys("Chaula");
	} 
	  	 
	public String getRegisterTextOnRegisterPage() {
	String strValue = getDriver().findElement(By.xpath("//a[text()='Register']")).getText();
        return strValue;
	}
		
	        //AssertEquals
	public void verifyRegisterTextOnRegisterPage() {
		 String strExpectedValue= this.getRegisterTextOnRegisterPage();
	   Assert.assertEquals(strActualValue,strExpectedValue);  
	   System.out.println("Both the values are Equal");
	}
	
	       //AssertNotEquals
	public void verify() {
		 String strExpectedValue= this.getRegisterTextOnRegisterPage();
		Assert.assertNotEquals(strActualWord, strExpectedValue);
		System.out.println("Both the values are NotEqual");
	}
	
	       //AssertTrue
	public void verifyRCharIsPresent() {
	    Assert.assertTrue(strActualValue.contains("R"));
	    Assert.assertTrue(true, strActualValue);
		System.out.println("The value is true");
	}
	 
	      //AssertFalse
	public void verifyRegisteredOnRegisterPage() {
		Assert.assertFalse(strActualValue.contentEquals("Registered"));
		System.out.println("The value is False");
	}
	 
	      //AssertNull
	public void verifyStringIsNull() {
		String strValue = null;
		Assert.assertNull(strValue);
		System.out.println("Null value");
	}
	
	    //AassertNotNull
	public void verifyStringIsNotNull() {
		 String strExpectedValue= this.getRegisterTextOnRegisterPage();

	     Assert.assertNotNull(strActualValue);
	     Assert.assertNotNull(strActualValue, strExpectedValue);
			System.out.println("Value is present");

	}
	 
	    //AssertSame
	public void verifyBothTheValuesAreSame() {
		String strExpectedValue= this.getRegisterTextOnRegisterPage();
	    Assert.assertSame(strActualValue, strExpectedValue);
		System.out.println("Both the values are same");

    }
	
	    //AssertNotSame
	public void verifyBothTheValuesAreNotSame() {
		String strExpectedValue= this.getRegisterTextOnRegisterPage();
	    Assert.assertNotSame(strActualWord, strExpectedValue);
	    Assert.assertNotSame(strActualWord, strExpectedValue,"Registered" );
		System.out.println("Both the values are NotSame");

	    
	}
}
