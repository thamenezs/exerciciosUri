import java.util.Locale;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double x1, y1, x2, y2;
	x1 = sc.nextDouble();
	y1 = sc.nextDouble();
	x2 = sc.nextDouble();
	y2 = sc.nextDouble();
	
	double x3, y3;
	x3 = Math.pow((x2 - x1), 2);
	y3 = Math.pow((y2 - y1), 2);
	
	double distance;
	distance = Math.sqrt((x3 + y3));
	
	System.out.printf("%.4f", distance);
	
	}

}
