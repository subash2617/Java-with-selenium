package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	public void empName() {
		System.out.println("Nandhini");
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Company com = new Company();
		Client cl = new Client();
		Project p = new Project();
		
		emp.empName();
		com.companyName();
		cl.clientName();
		p.projectName();
	}
}
