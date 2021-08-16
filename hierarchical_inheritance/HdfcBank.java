package hierarchical_inheritance;

public class HdfcBank {

	public void salary() {
		System.out.println("HDFC Bank salary = 50000");
	}
	
	public static void main(String[] args) {
		// all the class have the  access to hdfc class
		AxisBank axis = new AxisBank();
		IcicBank icic = new IcicBank();
		CityBank city = new CityBank();
		
		System.out.println("Hierarchical Inheritance");
		axis.salary();
		axis.salary1();
		icic.salary();
		icic.salary2();
		city.salary();
		city.salary3();
	}
}
