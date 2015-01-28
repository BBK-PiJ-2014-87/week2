import java.util.Scanner;

public class NumberPiramids {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num2 = 1;
		int num3 = 0;
		String s = "";

		System.out.println("Please enter a number:");
		num = sc.nextInt();
		while (num2 <= num) {
			s = "";
			num3 = 0;
			while (num3 < num2) {
				s = s + Integer.toString(num2);
				num3++;
			}
			num2++;
			System.out.println(s);

		}

	}
}
