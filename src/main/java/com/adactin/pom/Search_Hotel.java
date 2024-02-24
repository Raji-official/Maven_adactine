package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Hotel {
	
	public static WebDriver driver; //null

	

	public Search_Hotel(WebDriver driver) {
    	 this.driver=driver;
 		PageFactory.initElements(driver, this);
     }
	
	

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	
	@FindBy(xpath = "//select[@id='hotels']")
    private WebElement hotelName;
	
	@FindBy(xpath = "//select[@id='room_type']")
    private WebElement roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
    private WebElement number_of_room;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
    private WebElement check_in_date;
	

	@FindBy(xpath = "//input[@id='datepick_out']")
    private WebElement check_out_date;
	
	@FindBy(xpath = "//select[@id='adult_room']")
    private WebElement adult_count;
	
	
	@FindBy(xpath = "//select[@id='child_room']")
    private WebElement children_count;
	
	
	@FindBy(xpath = "//input[@id='Submit']")
    private WebElement submit;
	
	
	
	
	
	
	
	
	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotelName() {
		return hotelName;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	public WebElement getNumber_of_room() {
		return number_of_room;
	}


	public WebElement getCheck_in_date() {
		return check_in_date;
	}


	public WebElement getCheck_out_date() {
		return check_out_date;
	}


	public WebElement getAdult_count() {
		return adult_count;
	}


	public WebElement getChildren_count() {
		return children_count;
	}


	public WebElement getSubmit() {
		return submit;
	}



	
	
	
	
	
	
	
	
	








}