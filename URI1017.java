import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int time, speed;
		double liters;
		time = sc.nextInt();
		speed = sc.nextInt();
		liters = (time * speed) /12.0;
		
		System.out.printf("%.3f", liters);
		
	}

}
