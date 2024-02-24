package com.sdp;

import org.openqa.selenium.WebDriver;

import com.myntra.pom.Allproduct_Name;

public class Myntra_Home_Container {

	public static WebDriver driver;

	private Allproduct_Name names;

	public Myntra_Home_Container(WebDriver driver2) {
		this.driver=driver2;
	}

	public Allproduct_Name getNames() {
		names = new Allproduct_Name(driver);
		return names;
	}

}
