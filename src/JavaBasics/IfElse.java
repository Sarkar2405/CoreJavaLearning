package JavaBasics;

public class IfElse {

	public static void main(String[] args) {
		
		//String day= "sunny";
		//String day= "foggy";
		String day= "cloudy";
		//String day= "cold";
		
		if(day=="cloudy") {
			System.out.println("It will rain today");
		}
		else {
			System.out.println("It will not rain today");
		}

		if(day=="sunny")
		{
		System.out.println("It is hot today");
		}
		
		else if(day=="foggy") {
			System.out.println("It will be low visibility");
		}
		
		else if(day=="cloudy") {
			System.out.println("It will rain today");
		}
		
		else {
			System.out.println("Unpredictable");
		}
		
	}

}
