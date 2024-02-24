package com.sdp;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Book_hotel;
import com.adactin.pom.Login;
import com.adactin.pom.Logout;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_hotel;

public class Page_Object_Manager {
	public static WebDriver driver; //null
	
	
	private Login li;
	private Search_Hotel sh;
	private Select_hotel select_ho;
	private Book_hotel 	Book_h;
	private Logout 	LG;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		
	}

	public Login getInstanceli() {
		li = new Login(driver);
		return li;
	}
	
	public Search_Hotel getInstance_Sh() {
		sh = new Search_Hotel(driver);
		return sh;
	}
	
	public Select_hotel getInstance_select_ho () {
		 select_ho = new Select_hotel(driver);
		return select_ho;
	}
	
	public  Book_hotel getInstance_Book_h() {
		Book_h = new Book_hotel(driver);
		return Book_h;
	}
	public  Logout getInstance_LG() {
		LG = new Logout(driver);
		return LG;
	}
	
	
	
	
	
	
	
	
	
	
}
