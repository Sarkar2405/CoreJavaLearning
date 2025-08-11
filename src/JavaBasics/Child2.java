package JavaBasics;

public class Child2 extends Child {
	
	public void play() {
		System.out.println("Child2 plays football");
	}
	
	public void study() {
		System.out.println("Child2 studies Science");
	}
	
	public static void main(String [] args) {
		Child cc2= new Child2();
		cc2.doJob();
		cc2.provideShelter();
		cc2.prepareFood();
		cc2.payFee();
		cc2.study();
		cc2.payRent();
	}

}
