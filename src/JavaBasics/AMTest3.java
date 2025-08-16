package JavaBasics;

import AccessModifier.AMTest;

public class AMTest3 extends AMTest {

	public static void main(String[] args) {
		
		AMTest3 am= new AMTest3();
		System.out.println(am.myAccNo);
		System.out.println(am.myHobby);
		am.getpub();
		AMTest.getpro();

	}

}

/*
 * public class AMTest3 {
 * 
 * public static void main(String[] args) {
 * 
 * AMTest am= new AMTest(); System.out.println(am.myHobby); am.getpub();
 * 
 * 
 * }
 * 
 * }
 */

