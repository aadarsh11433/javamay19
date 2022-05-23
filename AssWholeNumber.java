package com.aadarsh;

public class AssWholeNumber {

	
	void finder(int a) {
		
		if(a<0) {
			System.out.println("Error");
//			return;
		}
		else if(a%2==1) {
			System.out.println(a);
//			return;
		}
		else {
			
			int b = a%10;
			b  = 10-b;
			
			System.out.println(a+b);
		}
		
		System.out.println("=====================");
		
	}
	
	
	public static void main(String[] args) {
		
		AssWholeNumber obj = new AssWholeNumber();
		
		obj.finder(0);
		obj.finder(-50);
		obj.finder(55);
		obj.finder(12);
		obj.finder(1462);

	}

}
