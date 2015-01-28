import java.util.Scanner;

public class GoingUp2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int nnum = 0;
		int ans = 0;
		int i = 0;
		do {
			System.out.println("Please enter a number:");
			num = scan.nextInt();
			i++;
			if (num-nnum != 1 && i !=1) {
				ans++;
				System.out.println("Answer"+ ans);
			}
			nnum = num;
		} while (num != -1);
		if (ans > 1) {
			System.out.println("No!");
		} else {
			System.out.println("Yes!");
		}

	}
}
