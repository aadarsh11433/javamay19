package com.aadarsh;

public class Employee4{
String empId;
String empName;
double salary;
Address3 address = new Address3();
public void showDetails(){
System.out.println("Employee Id :"+empId);
System.out.println("Employee Name :"+empName);
System.out.println("Employee Salary :"+salary);
System.out.println("Employee Address :");
address.printAddress();
}
public static void main(String[] args){
Employee4 emp1 = new Employee4();
emp1.showDetails();
Employee4 emp2 = new Employee4();
emp2.empId = "Emp-01";
emp2.empName = "Ramesh";
emp2.salary = 50000;
emp2.address.city = "gmboor";
emp2.address.state = "Katilbadu";
emp2.address.pincode = "434322";
emp2.showDetails();
}
}
