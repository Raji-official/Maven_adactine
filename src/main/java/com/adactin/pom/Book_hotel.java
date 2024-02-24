 package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	
	
	
	
	
	public static WebDriver driver; //null

	

	public  Book_hotel(WebDriver driver) {
    	 this.driver=driver;
 		PageFactory.initElements(driver, this);
     }
	
	
	
	
	
	
	
//	----------sendkeys-------
@FindBy(xpath = "//input[@id='first_name']")	
private WebElement firstname;


public WebElement getFirstname() {
	return firstname;
}

@FindBy(xpath = "//input[@id='last_name']")	
private WebElement lastname;


@FindBy(xpath = "//textarea[@id='address']")	
private WebElement address;


@FindBy(xpath = "//input[@id='cc_num']")	
private WebElement card_number;

//------select--------

//---selectByIndex---
@FindBy(xpath = "//select[@id='cc_type']")	
private WebElement card_type;

//--------selectByVisibleText--------
@FindBy(xpath = "//select[@id='cc_exp_month']")	
private WebElement card_expiry_month;

//------selectByValue--------
@FindBy(xpath = "//select[@id='cc_exp_year']")	
private WebElement  card_expiry_year;



//input[@id='cc_cvv']
@FindBy(xpath = "//input[@id='cc_cvv']")	
private WebElement  card_cvv_number;


@FindBy(xpath = "//input[@id='book_now']")	
private WebElement  book_now;


public WebElement getLastname() {
	return lastname;
}


public WebElement getAddress() {
	return address;
}


public WebElement getCard_number() {
	return card_number;
}


public WebElement getCard_type() {
	return card_type;
}


public WebElement getCard_expiry_month() {
	return card_expiry_month;
}


public WebElement getCard_expiry_year() {
	return card_expiry_year;
}


public WebElement getCard_cvv_number() {
	return card_cvv_number;
}


public WebElement getBook_now() {
	return book_now;
}




//@FindBy(xpath = "//input[@id='logout']")	
//private WebElement  card_expiry_year;






}
