// Main Package
package org.emp;

// Importing all the Packages
import org.client.Client;
import org.company.Company;
import org.project.Project;

// Class
public class Employee {

	// Method
	public void empName() {
		System.out.println("Subash");
	}
	
	// Main
	public static void main(String[] args) {
		
		// Object
		Employee emp = new Employee();
		Company com = new Company();
		Client cl = new Client();
		Project p = new Project();
		
		// Calling the Methods from all the Packages & Classes
		emp.empName();
		com.companyName();
		cl.clientName();
		p.projectName();
	}
}
