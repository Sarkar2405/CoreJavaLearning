package JavaBasics;

public class Methods {
	
public String getData() 
	
	{
		System.out.println("My name is Aishee");
		return("I Love cats");
	}

public static void practice() {
	System.out.println("I live in CANADA");
}

public static void main(String[] args) {
	Methods o= new Methods();
	String message= o.getData();
	System.out.println(message);
	
	Methods.practice();
}

}
