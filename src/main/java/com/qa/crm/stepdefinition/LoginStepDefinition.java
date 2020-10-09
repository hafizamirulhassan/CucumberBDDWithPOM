package com.qa.crm.stepdefinition;

import org.testng.Assert;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition extends Base {

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginStepDefinition() {

		super(); // To call the properties file. mean base constructor
	}
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
	    
		browser_intialization();
		loginPage=new LoginPage();
		
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page()  {
	    
		String actual=loginPage.GetPageTitle();
		String exptected="Cogmento CRM";
		Assert.assertEquals(actual, exptected);
		System.out.println(loginPage.GetPageTitle());
		
	}
	
	@Then("^validate signup button$")
	public void validate_signup_button()  {
		
		boolean flag=loginPage.Signup_button_verification();
		Assert.assertTrue(flag);
		System.out.println(loginPage.Signup_button_verification());
	}

	@Then("^validate classic CRM$")
	public void validate_classic_CRM() {
	   
		boolean flag=loginPage.ClassicCRM_Verification();
		Assert.assertTrue(flag);
	}
	
	@Then("^user logs into app$")
	public void user_logs_into_app()  {
	   
		homePage=loginPage.CRMLogin(prop.getProperty("Email"), prop.getProperty("Password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title()  {
		
		String actual=homePage.VerifyHomeTitle();
		String exptected="Cogmento CR";
		Assert.assertEquals(actual, exptected);
		System.out.println(homePage.VerifyHomeTitle());
	    
	}

	

}
