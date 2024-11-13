package com.accenture.ltt.HON1.HON1;

abstract public class MyCard {
	public void pay() {
		System.out.println("Your payment is successful");
	}
	abstract void payment();

}

class Credit1 extends MyCard {
	public void payment() {
	System.out.println("cerdit1 payment selected");
	Payment p1 = new CreditCardPayment();
	p1.creditcard();
	}
}

class Credit2 extends MyCard {
	public void payment() {
	System.out.println("cerdit2 payment selected");
	Payment p2 = new CreditCardPayment();
	p2.creditcard();
	}
}

