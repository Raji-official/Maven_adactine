package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	
	public static WebDriver driver; //null

	

	public  Select_hotel(WebDriver driver) {
    	 this.driver=driver;
 		PageFactory.initElements(driver, this);
     }

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_button;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}
	
}
