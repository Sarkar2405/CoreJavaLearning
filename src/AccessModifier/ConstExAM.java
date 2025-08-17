package AccessModifier;

public class ConstExAM {
	String myCity;
	int num;
	

	ConstExAM() {
		System.out.println("I am a default constructor");
		myCity = "Ajax";
	}
	public ConstExAM(int abc) {
		System.out.println("I am a public constructor of parent class");
		num = abc;
	}
	protected ConstExAM(String a) {
		System.out.println("I am a protected constructor");
		myCity = a;
	}
	private ConstExAM(int a, String b) {
		System.out.println("I am a private constructor");
		num = a;
		myCity = b;
	}

	public static void main(String[] args) {

		ConstExAM ce = new ConstExAM();
		System.out.println(ce.myCity);

		ConstExAM ce1 = new ConstExAM(100);
		System.out.println(ce1.num);
		

		ConstExAM ce2 = new ConstExAM("Aishee");
		System.out.println(ce2.myCity);

		ConstExAM ce3 = new ConstExAM(10, "Sarkar");
		System.out.println(ce3.num+" "+ce3.myCity);

	}
}
