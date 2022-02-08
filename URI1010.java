import java.util.Locale;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		int code = sc.nextInt();
		int number = sc.nextInt();
		double price = sc.nextDouble();
		double priceTotal = (number * price);
		int code1 = sc.nextInt();
		int number1 = sc.nextInt();
		double price1 = sc.nextDouble();
		double priceTotal1 = (number1 * price1);
		double totalValue = (priceTotal + priceTotal1);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalValue);
		
		
	}

}
