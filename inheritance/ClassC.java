// multi inheritance
package inheritance;

public class ClassC extends ClassB {

	public void salary3() {
		System.out.println("ICIC Bank salary = 45000");
	}
	
	public static void main(String[] args) {
		
		ClassC salary = new ClassC();
		
		salary.salary1();
		salary.salary2();
		salary.salary3();
	}
}

/** 
OutPut
Axis bank salary = 55000
HDFC Bank salary = 50000 
ICIC Bank salary = 45000

**/ 