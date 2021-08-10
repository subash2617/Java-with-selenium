package org.col;

import org.stu.Student;
import org.staff.*;

public class College {

	public void collegename() {
		System.out.println("VEL TECH UNIVERSITY");
	}
	
	public static void main(String[] args) {
		
		College clg = new College();
		Student std = new Student();
		Staff stf = new Staff();
		
		clg.collegename();
		std.stuId();
		std.stuName();
		std.stuDept();
		stf.stfId();
		stf.stfName();
		stf.stfDept();
	}
}
