package JavaBasics;

public class Overloading {
	

	public void domethod1() {
		System.out.println("Canada");
	}

	public void domethod1(String text) {
		System.out.println(text);
	}

	public void domethod1(int number) {
		System.out.println(number);
	}

	public void domethod1(String text, int number) {
		System.out.println(text + number);
	}

	public void domethod1(int number, String text) {
		System.out.println(text + number);
	}

	public void domethod1(int number, String text, boolean value) {
		System.out.println(number+text+value);

	}
	
	public static void main(String[] args) {
		Overloading ol= new Overloading();
		ol.domethod1();
		ol.domethod1("My name is Aishee");
		ol.domethod1(2025);
		ol.domethod1("My full namei is Aishee Sarkar and year is ", 2025);
		ol.domethod1(1108, " Today's date ", true);
	}

}

