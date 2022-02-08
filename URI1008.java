import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, hours;
		double hourValue, salary;
		
		code = sc.nextInt();
		hours = sc.nextInt();
		hourValue = sc.nextDouble();
		salary = (hours * hourValue);
		
		System.out.println("NUMBER = " + code);
		System.out.printf("SALARY = U$ %.2f", salary);
		
	}

}
