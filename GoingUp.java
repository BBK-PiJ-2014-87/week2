import java.util.Scanner;

public class GoingUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int nnum = -1;
		int ans = 0;
		String seq = "";
		while (num != -1) {
			System.out.println("Please enter a number:");
			num = scan.nextInt();
			if (num - nnum != 1) {
				ans++;
				System.out.println(ans);
			}
			nnum = num;
			seq = seq +Integer.toString(num) + ",";
			System.out.println(seq);
			nnum = num;

		}
		if (ans>2){
			System.out.println("No!");
		}else{
			System.out.println("Yes!");
		}

	}
}
