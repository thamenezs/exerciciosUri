import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		double salary, sales, totalSalary;
		salary = sc.nextDouble();
		sales = sc.nextDouble();
		totalSalary = (float)(((sales /100.00) * 15.00) + salary);
		System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
		
		
	}

}
