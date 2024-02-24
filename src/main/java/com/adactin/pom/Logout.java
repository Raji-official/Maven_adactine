package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public static WebDriver driver; //null

	

	public  Logout(WebDriver driver) {
    	 this.driver=driver;
 		PageFactory.initElements(driver, this);
     }
	
	
@FindBy(xpath = "//input[@id='logout']")	
private WebElement logout;

public WebElement getLogout() {
	return logout;
}

public WebElement getClick_to_login_page() {
	return click_to_login_page;
}

@FindBy(xpath = "//a[text()='Click here to login again']")	
private WebElement click_to_login_page;
}
