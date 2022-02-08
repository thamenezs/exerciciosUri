import java.util.Locale;
import java.util.Scanner;

public class URI1010MELHORIA {
	public static double calculatePriceUnit(int code, int number, double price) {
		Scanner sc = new Scanner(System.in);
		code = sc.nextInt();
		number = sc.nextInt();
		price = sc.nextDouble();
		return (number * price);
		
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		int a, b, c, d;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		
		double e = 0, f = 0, totalValue;
		totalValue = calculatePriceUnit(a, b, e) + calculatePriceUnit(c, d, f);
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalValue);
		
		
	}

}
