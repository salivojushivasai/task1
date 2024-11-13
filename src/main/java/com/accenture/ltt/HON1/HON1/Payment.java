package com.accenture.ltt.HON1.HON1;

public interface Payment {
	void creditcard();
	void paypal();
}

class CreditCardPayment implements Payment {
	public void creditcard() {
		System.out.println("credit card payment success");
	}
	public void paypal() {
		
	}
	
}

class PayPalPayment implements Payment {
	public void creditcard() {
		
	}
	
	public void paypal() {
		System.out.println("paypal payment success");
	}
}
