package module1;

public class dataTypeArithmeticOperators {

	public static void main(String[] args) {
		// Data Types and declaration
		
		System.out.println("Declaring and Initializing all datatypes");
		byte seatNum = 5;
		short carInsInr = 13000;
		int totKmRuns = 133354;
		long carPrice = 1200000001L;
		
		boolean isCarNew = true;
		char carSeries = 'Z';
		
		float carYears = 1.5F;
		double carEmi = 3333.44567;
		
		System.out.println("No of seats : " + seatNum);
		System.out.println("Car Insurance Premium : " + carInsInr);
		System.out.println("Total KMS : " + totKmRuns);
		System.out.println("Car Price : " + carPrice);
		System.out.println("Is it New Car : " + isCarNew);
		System.out.println("Car Series : " + carSeries);
		System.out.println("Car bought year : " + carYears);
		System.out.println("EMI value : " + carEmi);
		
		
		
		
		//Arithmetic Operators
		System.out.println(" ");
		System.out.println("Increment & Decrement Operators");
		int i=10, j=11;
		System.out.println(i++);
		System.out.println(j++);
		
		System.out.println(" ");
		
		System.out.println(++i);
		System.out.println(++j);
		
		System.out.println(" ");
		
		System.out.println(i--);
		System.out.println(j--);
		
		System.out.println(" ");
		
		System.out.println(--i);
		System.out.println(--j);
		
		
		System.out.println(" ");
		System.out.println(" Add, Sub, Div, Mul operators ");
		
		dataTypeArithmeticOperators obj1 = new dataTypeArithmeticOperators();
		int Sum = obj1.calcAdd(5, 10);
		System.out.println(Sum);
		
		float Subt = obj1.calcSub(5, 10);
		System.out.println(Subt);
		
		double Mult = obj1.calcMul(5, 10, 15);
		System.out.println(Mult);
		
		int Divi = obj1.calcDiv(50, 10);
		System.out.println(Divi);
		
		
		int n=5;
		n*=n+=10; // n = 5 * (5+10)   Answer is 75
		System.out.println(n);
	}
	
	public int calcAdd(int a, int b)
		{
			return a+b;
		}
	
	private float calcSub(float a1, float b1)
	{
		return a1-b1;
	}

	public double calcMul(double c, double d, double e)
	{
		return c*d*e;
	}

	public int calcDiv(int x, int y)
	{
		return x/y;
	}
	

	}


