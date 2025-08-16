package AccessModifier;

public class AMTest {

	int myNum = 24;
	private String myName = "Aishee Sarkar";
	public String myHobby = "Cooking";
	protected long myAccNo = 100028011865L;

	void getd() {
		System.out.println("I am a Default method");
	}

	private static void getpr() {
		System.out.println("I am a Private method");
	}

	public void getpub() {
		System.out.println("I am a Public method");
	}

	protected static void getpro() {
		System.out.println("I am a Protected method");
	}

public static void main(String [] args)	{
	AMTest am= new AMTest();
	
	System.out.println(am.myName);
	System.out.println(am.myAccNo);
	System.out.println(am.myHobby);
	System.out.println(am.myNum);
	
	am.getd();
	am.getpub();
	getpr();
	getpro();
}
	
}