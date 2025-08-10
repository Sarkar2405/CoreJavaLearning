package JavaBasics;

public class TernaryOperator {
	
	public void GradeCalculate(){
		int grade= 20;
		String mygrade= grade>90?"A":grade>70?"B":grade>50?"C":grade>30?"D":"Fail";
		System.out.println("My grade is "+mygrade);
	}
	
	public static void CheckEligibiity() {
		int age= 15;
		String eligibility= age>18?"I can vote":"I cannot vote";
		System.out.println(eligibility);
	}
	
	public void checkstatus() {
		double time = 10.00;
		double traintime= 9.50;
		String trainstatus= traintime==time?"Train on time":traintime>time?"Train is late":"Train is early";
		System.out.println(trainstatus);
	}
	
	
	
	public static void main(String[] args) {
		//new TernaryOperator().GradeCalculate();
		TernaryOperator obj= new TernaryOperator();
		obj.GradeCalculate();
		TernaryOperator.CheckEligibiity();
		obj.checkstatus();
	}
	

}
