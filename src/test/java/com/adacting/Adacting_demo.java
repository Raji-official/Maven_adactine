package com.adacting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.BookBoolRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler;
import org.openqa.selenium.support.ui.Select;

import com.adactin.pom.Book_hotel;
import com.adactin.pom.Login;
import com.adactin.pom.Logout;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_hotel;
import com.baseclass.Base_Class;
import com.sdp.Page_Object_Manager;

public class Adacting_demo extends Base_Class {


//	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
 
	
	public static void loginpage() throws Throwable {
		 browerLaunch("chrome");
		 Page_Object_Manager pom=new Page_Object_Manager(driver);
		getUrl("http://adactinhotelapp.com/index.php");
		sendText(pom.getInstanceli().getUsername(), "rajfernanto");
		sendText(pom.getInstanceli().getPassword(), "TC02CG");
		elementClick(pom.getInstanceli().getLogin());
	}

	public static void search_hotel_page() throws Throwable {

		 Page_Object_Manager pom=new Page_Object_Manager(driver);

			selectValuesfromDD(pom.getInstance_Sh().getLocation(), "index", "2");
			selectValuesfromDD(pom.getInstance_Sh().getHotelName(), "visibletext", "Hotel Creek");
			selectValuesfromDD(pom.getInstance_Sh().getRoomtype(), "index", "2");
			selectValuesfromDD(pom.getInstance_Sh().getNumber_of_room(), "index", "6");
			sendText(pom.getInstance_Sh().getCheck_in_date(), "17/12/2023");
			sendText(pom.getInstance_Sh().getCheck_out_date(), "18/12/2023");
			selectValuesfromDD(pom.getInstance_Sh().getAdult_count(), "index", "2");
			selectValuesfromDD(pom.getInstance_Sh().getChildren_count(), "visibletext", "2 - Two");
			elementClick(pom.getInstance_Sh().getSubmit());
		 

	}
	

	public static void select_hotel_page() throws Throwable {

		 Page_Object_Manager pom=new Page_Object_Manager(driver);

		elementClick(pom.getInstance_select_ho().getRadiobutton());
		elementClick(pom.getInstance_select_ho().getContinue_button());
	}
	

	public static void book_hotel_page() throws Exception {

		 Page_Object_Manager pom=new Page_Object_Manager(driver);

		sendText(pom.getInstance_Book_h().getFirstname(), "raji");
		sendText(pom.getInstance_Book_h().getLastname(), "anjappan");
		sendText(pom.getInstance_Book_h().getAddress(), "4/262 meenavar colony middle street poompuhar");
		sendText(pom.getInstance_Book_h().getCard_number(), "6754879034275876");

		selectValuesfromDD(pom.getInstance_Book_h().getCard_type(), "index", "2");
		selectValuesfromDD(pom.getInstance_Book_h().getCard_expiry_month(), "visibletext", "June");

		selectValuesfromDD(pom.getInstance_Book_h().getCard_expiry_year(), "value", "2025");
		sendText(pom.getInstance_Book_h().getCard_cvv_number(), "6789");
		elementClick(pom.getInstance_Book_h().getBook_now());

	}
	
	public static void logoutpage() throws Exception {
		 Page_Object_Manager pom=new Page_Object_Manager(driver);

		elementClick(pom.getInstance_LG().getLogout());
		elementClick(pom.getInstance_LG().getClick_to_login_page());
	}
	

	public static void main(String[] args) throws Throwable {
		
		
		loginpage();
		search_hotel_page();
		select_hotel_page();
		book_hotel_page();
        logoutpage();
		
			

			
			
			
			
			
			
			
			

		

	}

}
