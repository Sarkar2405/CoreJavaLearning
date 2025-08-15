package JavaBasics;

public class Construtor {

	String word;
	String value;
	int number;

	public Construtor() {
		word = "Qwerty";

	}

	public void Const(String value) {
		word = "Ajax";

	}

	public Construtor(String value) {
		this.value= "Aishee Sarkar";

	}
	public Construtor(int number) {
		//number= number;
		this.number= number;

	}

	public static void main(String[] args) {

		Construtor con = new Construtor();
		System.out.println(con.word);

		Construtor con1 = new Construtor();
		con1.Const("a");
		System.out.println(con1.word);

		Construtor con2 = new Construtor("a");
		System.out.println(con2.value);
		
		Construtor con3 = new Construtor(1234567890);
		System.out.println(con3.number);
	}
}
