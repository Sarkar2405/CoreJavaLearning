package AccessModifier;

public class AMTest2 {

	public static void main(String[] args) {
		
		AMTest am= new AMTest();
		System.out.println(am.myNum);
		System.out.println(am.myAccNo);
		System.out.println(am.myHobby);
		
		am.getd();
		am.getpub();
		AMTest.getpro();
		
	}

}
