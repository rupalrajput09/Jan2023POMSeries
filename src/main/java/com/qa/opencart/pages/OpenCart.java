package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class OpenCart {

	String name = "cart";
	By cart = By.id("cart");
	
	public void addCart() {
		System.out.println("Cart is added");
	}
}
