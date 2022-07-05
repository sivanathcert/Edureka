package module1;

public class Fibbonacci {

	//For Loop
	
	public static void main(String[] args) {
		int range = 10, firstNum = 0, secNum=1, sum;
		System.out.println("##### for Loop #####");
		System.out.print(firstNum+" ");
		System.out.print(secNum + " ");
		for (int i = 2; i < range; i++) {	 					
			sum = firstNum + secNum;			
			firstNum=secNum;
			secNum=sum;
			System.out.print(sum+" ");	
		}
		
		//while Loop
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("##### while Loop #####");
		int j=2, range1 = 10, firstNum1 = 0, secNum1=1, sum1;
		System.out.print(firstNum1+" ");
		System.out.print(secNum1 + " ");
		while(j < range) {
			sum1 = firstNum1 + secNum1;			
			firstNum1=secNum1;
			secNum1=sum1;
			System.out.print(sum1+" ");
			j++;
		}
		//do while Loop
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("##### do while Loop #####");
		
		int k=2, range2 = 10, firstNum2 = 0, secNum2=1, sum2;
		System.out.print(firstNum2+" ");
		System.out.print(secNum2 + " ");
		do {
			k++;
			sum2 = firstNum2 + secNum2;			
			firstNum2=secNum2;
			secNum2=sum2;
			System.out.print(sum2+" ");
			
		}while(k < range);
	}
}
