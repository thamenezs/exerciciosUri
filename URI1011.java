import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		double pi = 3.14159;
		double volume = (4.0/3) * pi * (Math.pow(radius, 3));
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
	}

}
