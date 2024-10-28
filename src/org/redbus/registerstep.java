package org.redbus;

import java.io.IOException;

import org.help.registerpojo;
import org.help.samplebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;

public class registerstep extends samplebase{
	@Given("To launch browser and legacy tour travel website")
	public void to_launch_browser_and_legacy_tour_travel_website() {
	   
		browserlaunch();
		launchurl("https://legacytourtravel.com/Secure/User/Login");
	   
	   
	}
	@When("Give the required information to fill the form")
	public void give_the_required_information_to_fill_the_form() throws IOException {

	    registerpojo r=new registerpojo();
	    WebElement register=r.getRegister();
	    register.click();
	    WebElement first =r.getFirstname();
	    first.sendKeys(getdatadriven("etravel", 0, 1));
	    WebElement last =r.getLastname();
	    last.sendKeys(getdatadriven("etravel", 1, 1));
	
	    WebElement address =r.getAddress();
	    address.sendKeys(getdatadriven("etravel", 5, 1));
	
    WebElement city =r.getCity();
    city.sendKeys(getdatadriven("etravel", 6, 1));
    
		
		WebElement state=driver.findElement(By.id("Address4"));
		Select s= new Select(state);
		s.selectByValue("AB");
	    
	    
	
	    WebElement code =r.getCode();
	    code.sendKeys(getdatadriven("etravel", 7, 1));
	    
	}

	@When("Give Email address")
	public void give_Email_address() throws IOException {
		registerpojo r=new registerpojo();
	    WebElement email =r.getEmailadd();
	    email.sendKeys(getdatadriven("etravel", 3, 1));

	    
	}

	@When("Give confirm Email address")
	public void give_confirm_Email_address() throws IOException {
		registerpojo r=new registerpojo();
	    WebElement email =r.getConemail();
	    email.sendKeys(getdatadriven("etravel", 3, 1));
	}

	@When("Give phone number")
	public void give_phone_number() throws IOException {
		registerpojo r=new registerpojo();
	    WebElement mobile =r.getMobileno();
	    mobile.sendKeys(getdatadriven("etravel", 2, 1));
	}

	@When("Give contact as email")
	public void give_contact_as_email() {
		registerpojo r=new registerpojo();
		WebElement contact=driver.findElement(By.id("Contact"));
		Select s= new Select(contact);
		s.selectByValue("Yes");
	}

	@When("Give password and confirm password")
	public void give_password_and_confirm_password() throws IOException {
		registerpojo r=new registerpojo();
		WebElement pass=r.getPass();
		pass.sendKeys(getdatadriven("etravel", 4, 1));
	    WebElement conpass =r.getConpass();
	    conpass.sendKeys(getdatadriven("etravel", 4, 1));
	}

	@Then("To validate the account is created or not")
	public void to_validate_the_account_is_created_or_not() {
		registerpojo r=new registerpojo();

	    WebElement create=r.getCreate();
	    create.click();
	}

	
	    
	
}
