package module1;

public class TablesOfTen {

	public static void main(String[] args) {
		// for loop
		forTablesOfTenNo(10);
		
		// while loop
		whileTablesOfTenNo(5);

		// do while loop
		doWhileTablesOfTenNo(8);
	}
	private static void forTablesOfTenNo(int table) {
		System.out.println("##### for Loop " + table + "th Table #####");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "*" + table + "=" + i * table);
		}
	}
		
		private static void whileTablesOfTenNo(int table1) {
			System.out.println(" ");
			System.out.println("##### while Loop " + table1 + "th Table #####");
			int j=1;
			while(j<=10) {
			
				System.out.println(j + "*" + table1 + "=" + j * table1);
				j++;
			}	
		}
			
			private static void doWhileTablesOfTenNo(int table2) {
				System.out.println(" ");
				System.out.println("##### do while Loop "+ table2 + "th table #####");
				int k = 1; 
				do{
					System.out.println(k + "*" + table2 + "=" + k * table2);
					k++;
				}	while (k <= 10);
	}
}
