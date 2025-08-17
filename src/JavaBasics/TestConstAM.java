package JavaBasics;

import AccessModifier.ConstExAM;

public class TestConstAM extends ConstExAM {
	int num;
	String a;

	// TestConstAM() {
	// super(); // compile time error-default constructor not allowed
	// }
	private TestConstAM(int a) {

		super(1); // pass
		num = a;
	}

	protected TestConstAM(String a) {
		super("a"); // pass
		this.a = a;

	}
	// TestConstAM(int a,String b) {
	// super(1, "a")// compile time error-private constructor not allowed
	// }

	public static void main(String[] args) {
		// TestConstAM tc= new TestConstAM();
		TestConstAM tc1 = new TestConstAM(2);
		System.out.println(tc1.num);
		TestConstAM tc2 = new TestConstAM("a");
		System.out.println(tc2.a);
		// TestConstAM tc3= new TestConstAM(2,"a");
		
		

	}

}
