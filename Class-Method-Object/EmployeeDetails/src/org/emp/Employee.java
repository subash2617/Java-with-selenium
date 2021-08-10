package org.emp;

public class Employee {
	
	public void empID() {
		System.out.println(5980);
	}

	public void empName(){
		System.out.println("Nandhini");
	}
	
	public void empDob() {
		System.out.println("26-jan-2020");
	}
	
	public void empPhone() {
		System.out.println(9876543210l);
		}
	
	public void empAddress() {
		System.out.println("Chennai");
		}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.empID();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empAddress();
	}
}
