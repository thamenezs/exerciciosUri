import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distance = sc.nextInt();
		double gas = sc.nextDouble();
		double consumo = (distance / gas);
		
		System.out.printf("%.3f km/l", consumo);

	}

}
