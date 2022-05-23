package com.aadarsh;

public class Demo {

	Demo(){
		
		 this("String");
		 System.out.println("inside demo constructor with no  parameter");
	}

     Demo(String s){
    	 this(5.32f);
    	 System.out.println("inside demo constructor having String parameter");
    	 
     }
     
     Demo(Float f){
    	 this(78);
    	 System.out.println("inside demo constructor having float parameter");
     }
	
     Demo(int i){
    	 System.out.println("inside demo constructor having integer parameter");
     }
	
	
	public static void main(String[] args) {

		Demo object = new Demo();
		System.out.println(object);

	}

}
