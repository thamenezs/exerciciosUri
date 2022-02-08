import java.util.Locale;
import java.util.Scanner;
public class URI1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int big, bigger;
		big = (a+b + (Math.abs(a - b))) / 2;
		bigger = (big+c + (Math.abs(big - c))) / 2;
		
		System.out.println(bigger + " eh o maior");
		
	
	}

}
