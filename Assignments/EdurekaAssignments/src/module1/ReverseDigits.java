package module1;

public class ReverseDigits {

	public static void main(String[] args) {
		//for loop
		System.out.println("##### for Loop #####");
		int num=456578, sum;
		for (sum=0; num>0 ; ) {
			sum = (sum * 10) + (num % 10);
			num/=10;
		}
		System.out.println(sum);

		//while loop

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("##### while Loop #####");
		int num1=456578, sum1=0;
		while(num1>0) {
			sum1 = (sum1 * 10) + (num1 % 10);
			num1/=10;
		}
		System.out.println(sum1);

		//do-while loop
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("##### do-while Loop #####");
		int num11=456578, sum11=0;
		do {
			sum11 = (sum11 * 10) + (num11 % 10);
			num11/=10;
		}while(num11>0);
		System.out.println(sum11);

		

	}

}
