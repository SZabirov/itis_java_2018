import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite km:");
		int s = sc.nextInt();
		int cost = s * 25;
		if (cost > 200) {
			cost = cost - 20;
		}
		System.out.println("Stoimost: " + cost);
	}
}






