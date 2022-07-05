package module1;

public class Factorial {

	public static void main(String[] args) {
		
		//for loop
		
		System.out.println("##### for Loop #####");
		int input=6;
		int fact = 1;
		for(int i=1;i<=input;i++) {
			fact = fact*i;
		}
System.out.println(fact);

//while loop

System.out.println(" ");
System.out.println("##### while Loop #####");

int input1=6;
int fact1 = 1;
int i = 1;
while(i<=input1) {
	fact1 = fact1*i;
	i++;
}
System.out.println(fact1);

//do while loop
System.out.println(" ");
System.out.println("##### do while Loop #####");

int input11=6;
int fact11 = 1;
int i1 = 1;
 do{
	fact11 = fact11*i1;
	i1++;
}while(i1<=input11);
System.out.println(fact11);

	}

	}

