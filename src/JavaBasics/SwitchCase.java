package JavaBasics;

public class SwitchCase {

	public static void main(String[] args) {

		String day = "Friday";
		switch (day) {

		case "Monday": {
			System.out.println("I eat veg on " + day);
			break;
		}
		case "Saturday": {
			System.out.println("I eat veg on " + day);
			break;
		}
		default: {
			System.out.println("I eat nonveg on " + day);
		}
		}

	}

}
