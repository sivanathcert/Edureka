package module1;

import java.util.Scanner;

public class AddDigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter more than 1 digit number : ");
		int num=sc.nextInt(); 
				int sum=0;
		System.out.println("##### for Loop ####");
		for (sum=0; num>0 ; ) {
			sum = sum + (num % 10);
			num/=10;
		}
		System.out.println(sum);
		
		System.out.println(" ");
		System.out.println("##### while Loop ####");
	
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter more than 1 digit number : ");
		int num1=sc1.nextInt(); 
				int sum1=0;
		while(num1>0) {
			sum1 = sum1 + (num1 % 10);
			num1/=10;
		}
		System.out.println(sum1);
	
		System.out.println(" ");
		System.out.println("##### do while Loop ####");
		
		int sum2=0;
		Scanner sc11=new Scanner(System.in);
		System.out.print("Enter more than 1 digit number : ");
		int num2=sc11.nextInt();
		do {
			sum2 = sum2 + (num2 % 10);
			num2/=10;
		}while(num2>0);
		System.out.println(sum2);
	}
}
