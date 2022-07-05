package module1;

public class GreaterNumberOfTwo {

	public static void main(String[] args) {
		
		greaterNumber(10, 6);

	}

	private static void greaterNumber(int n1, int n2) {
		if(n1>n2) {
			System.out.println(n1 + " is greater than " + n2);
		}
		else {
			System.out.println(n2 + " is greater than " + n1);
		}
		
	}

}
