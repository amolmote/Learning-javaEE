package com.cdac.in.SpringCore.lifecycle;

public class Samosa {
	
 private double price;

 
 
public Samosa(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
 private void init() {
	// TODO Auto-generated method stub
	 System.out.println("Init method call");

}
 private void destroy() {
	// TODO Auto-generated method stub
	 System.out.println("destroy method call");
}
}
