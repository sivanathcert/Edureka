package module1;

public class EvenOdd {

	public static void main(String[] args) {
		evenOrOdd(1050);

	}

	private static void evenOrOdd(int n1) {
		if(n1%2==0) {
			System.out.println("Given number " + n1 + " is Even number");
		}
		else {
			System.out.println("Given number " + n1 + " is Odd number");
		}
	}

}
