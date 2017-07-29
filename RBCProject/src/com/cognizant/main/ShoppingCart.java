package com.cognizant.main;

import com.cognizant.exception.RbcException;

public class ShoppingCart {

	public void calculateTotalCost(String banana, String apple, String orange, String lemon, String peaches)
			throws RbcException {

		int rateOfBanana = 5;
		int rateOfPeaches = 50;
		int rateOfOrange = 30;
		int rateOfApple = 25;
		int rateOfLemon = 8;
		
		if (apple == null || orange == null || banana == null || lemon == null || peaches == null) {
			throw new RbcException("Quantity of product cannot be null.");
		} 
			else if (Integer.parseInt(banana) < 0 || Integer.parseInt(apple) < 0 || Integer.parseInt(lemon) < 0
					|| Integer.parseInt(peaches) < 0 || Integer.parseInt(orange) < 0) {

				throw new RbcException("Quantity of product cannot be negative.");

			} else {

				int totalPrice = (Integer.parseInt(banana) * rateOfBanana) + (Integer.parseInt(apple) * rateOfApple)
						+ (Integer.parseInt(orange) * rateOfOrange) + (Integer.parseInt(lemon) * rateOfLemon)
						+ (Integer.parseInt(peaches) * rateOfPeaches);
				System.out.println("Total price of basket is " + totalPrice);

			}

		}

	}


