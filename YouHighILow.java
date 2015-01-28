import java.util.Scanner;

public class YouHighILow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int nnum = 0;
		int ans = 0;
		int i = 0;
		int dif = 0;
		String answer = "Yes";
		do {
			System.out.println("Please enter a number:");
			num = scan.nextInt();
			dif = num - nnum;
			i++;
			if (dif == 1 || dif == -1) {

			} else if (i > 1) {
				ans++;
			}

			System.out.println("dif: " + dif + " i: " + ans);
			nnum = num;
		} while (num != -1);
		answer = (ans > 1) ? "No" : "Yes";
		System.out.println(answer);

	}
}
