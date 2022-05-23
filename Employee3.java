package com.aadarsh;

public class Employee3 {

	
		
		String empId;
		String empName;
		double salary;
		//defining Address class as a static member
		static Address2 address;
		
		public static void main(String[] args)
		{
		Employee3 emp1 = new Employee3();
		System.out.println(emp1); //Employee object hashcode i.e Employee@323232
		System.out.println(emp1.empId); // null
		System.out.println(emp1.empName); // null
		System.out.println(emp1.salary); // 0.0
		System.out.println(Employee3.address); // null
		Employee3 emp2 = new Employee3(); 
		emp2.empId = "Emp-01";
		emp2.empName = "Ram";
		emp2.salary = 60000.00;
		Employee3.address = new Address2("sehore","MP","India");
		//address = new Address(); //within the same class we can access the static members directly
		//emp2.address=new Address(); we can access the static members with the help of object also
//		Day4: Object Collaboration 4
//		Employee3.address.city = "Coimbator";
//		Employee3.address.state = "Tamilnadu";
//		Employee3.address.country = "434322";
		System.out.println(emp2.empId); // Emp-01
		System.out.println(emp2.empName); // Ram
		System.out.println(emp2.salary); // 60000.00
		System.out.println(emp2.address); //Address object hashcode i.e Address@232423
		System.out.println(emp2.address.city); //Coimbator
		System.out.println(emp2.address.state); //Tamilnadu
		System.out.println(emp2.address.country); //434322
		
		
		}


	

}
