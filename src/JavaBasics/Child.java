package JavaBasics;

public class Child extends Parent  {

	public void study() {
		System.out.println("Child studies English Literature");
	}
	
	public void payRent() {
		System.out.println("Child pays $1000 rent");
	}
	
	public void payFee() {
		System.out.println("Child pays the college fees");
		
	}
	
	public void prepareFood(){
		System.out.println("Child cooks Maggi");
	}
	
	public static void main(String[] args) {
		
		
		Parent parentchild= new Child();
		parentchild.provideShelter();
		parentchild.payFee();
		parentchild.doJob();
		parentchild.prepareFood();
	}
}
