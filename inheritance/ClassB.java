// single inheritance
package inheritance;

public class ClassB extends ClassA {

	public void salary2() {
		System.out.println("HDFC Bank salary = 50000");
	}
	
public static void main(String[] args) {
		
		ClassB salary = new ClassB();
		
		salary.salary1();
		salary.salary2();
	}
}

/** 
	OutPut
Axis bank salary = 55000
HDFC Bank salary = 50000 
 
 **/ 