import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double n = 3.14159;
		double area = (raio * raio) * n;
		
		System.out.printf("A=%.4f\n", area);
	}

}
