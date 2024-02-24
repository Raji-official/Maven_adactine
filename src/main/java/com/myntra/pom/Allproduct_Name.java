package com.myntra.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allproduct_Name {

	public static WebDriver driver;
	
	
	
	public Allproduct_Name(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getClick_kids() {
		return click_kids;
	}

	public WebElement getKids_Tshirt() {
		return kids_Tshirt;
	}
	
	
	public List<WebElement> getAllprice() {
		return allprice;
	}

	public void setAllprice(List<WebElement> allprice) {
		this.allprice = allprice;
	}


	
	public List<WebElement> getAllname() {
		return allname;
	}

	public List<WebElement> getPagesize() {
		return pagesize;
	}
	
	
	@FindBy(xpath = "(//a[@class='desktop-main'])[3]")
	private WebElement click_kids;
	
	@FindBy(xpath = "//a[text()='T-Shirts']")
	private WebElement kids_Tshirt;
	
    
	@FindBy(xpath = "//div[@class='product-price']//descendant::span[text()=not(@class) or @class=\"product-discountedPrice\"]")
	private List<WebElement> allprice;	
	
	

	@FindBy(xpath = "//h4[@class='product-product']")
	private List<WebElement> allname;

	
	@FindBy(xpath = "//div[@class='results-showMoreContainer']//ul//descendant::li")
	private List<WebElement> pagesize;

	
	@FindBy(xpath = "//li[@class='pagination-next']")
	private WebElement next_button;



	public WebElement getNext_button() {
		return next_button;
	}
	


	
	
	
}
