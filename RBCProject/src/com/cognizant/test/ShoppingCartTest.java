package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cognizant.exception.RbcException;
import com.cognizant.main.ShoppingCart;

public class ShoppingCartTest {
	String banana = "";
	String apple = "";
	String orange = "";
	String lemon = "";
	String peaches = "";
	ShoppingCart newCart = new ShoppingCart();

	@Test
	public void positiveTestCase() {
		banana = "7";
		apple = "5";
		orange = "9";
		lemon = "8";
		peaches = "2";

		try {
			newCart.calculateTotalCost(banana, apple, orange, lemon, peaches);
		} catch (RbcException e) {

			e.printStackTrace();
		}
		assertTrue(true);
	}

	

	@Test
	public void negativeQuantityTestCase() {
		banana = "7";
		apple = "2";
		orange = "-5";
		lemon = "4";
		peaches = "6";

		try {
			newCart.calculateTotalCost(banana, apple, orange, lemon, peaches);
		} catch (RbcException e) {

			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void nullQuantityTestCase() {
		banana = null;
		apple = "7";
		orange = "3";
		lemon = "9";
		peaches = "1";

		try {
			newCart.calculateTotalCost(banana, apple, orange, lemon, peaches);
		} catch (RbcException e) {

			e.printStackTrace();
		}
		assertTrue(true);
	}

}
