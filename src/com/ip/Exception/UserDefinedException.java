package com.ip.Exception;

public class UserDefinedException {

	public static void main(String[] args) throws Exception {
		int price = -120;
		if(price < 0) {
			throw new CustomException(price);
		}else {
			System.out.println("You have entered: "+price+ " Rs");
		}
	}
}

class CustomException extends Exception {
	
	private static final long serialVersionUID = 6571795986060040677L;
	private int price;
	
	public CustomException(int price) {
		this.price=price;
	}
	
	public String toString() {
		return "Price should not be Negative: "+price;
	}
}
