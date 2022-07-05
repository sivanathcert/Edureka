package module1;

public class LoopTenEvenOdd {

	public static void main(String[] args) {

		// for loop
		System.out.println("##### for Loop #####");
		System.out.print("Even Numbers are : ");
		for(int i=1;i<=19;i++) {
			if(i%2==0) {

				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		System.out.print("Odd Numbers are : ");
		for(int i=1;i<=18;i++) {
			if(i%2!=0){

				System.out.print(i + " ");
			}
		}

		//while loop

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("##### while Loop #####");
		System.out.print("Even Numbers are : ");
		int j = 1;

		while(j<=19){
			if(j%2==0) {

				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println(" ");
		System.out.print("Odd Numbers are : ");
		int k=1;
		while(k<=18) {
			if(k%2!=0){

				System.out.print(k + " ");
			}
			k++;
		}	


		//do-while loop

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("##### do-while Loop #####");
		System.out.print("Even Numbers are : ");
		int l = 1;

		do{

			if(l%2==0) {

				System.out.print(l + " ");
			}
			l++;
		}while(l<=19);

		System.out.println(" ");
		System.out.print("Odd Numbers are : ");
		int k1=1;
		while(k1<=18) {
			if(k1%2!=0){

				System.out.print(k1 + " ");
			}
			k1++;
		}	


	}
}
