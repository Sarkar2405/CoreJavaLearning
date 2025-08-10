package JavaBasics;

public class ForLoop {
	
	public static void main(String[] args) {

		for(int i=1;i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		
		int num= 25;
		int i= num/2;
		boolean isPrime= true;
		for(int j=2;j<=i;j++) {
		int a= num%j;
		
		if(a==0) 
		{
			isPrime = false;
			break;
		}
		
		
	
	
}
		if(isPrime) {
			System.out.println(num+" is a prime number");
			}
			else System.out.println(num+" is not a prime number");

}
	
}
	


