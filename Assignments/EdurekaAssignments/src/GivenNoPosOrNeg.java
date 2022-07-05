package module1;

//import java.util.Scanner;

public class GivenNoPosOrNeg {

	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();*/
		int num=-5;
		checkNumberSign(num);
	}

	static void checkNumberSign(int n) {
		if (n==0)
		{
			System.out.println("Given " + n + " is Zero");
		}
		else if(n<0) {
			System.out.println("Given " + n + " is Negative");
		}else {
			System.out.println("Given " + n + " is Positive");
		}
	}

}
