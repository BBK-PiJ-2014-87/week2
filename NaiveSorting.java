import java.util.Scanner;

public class NaiveSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Please enter third number:");
		int num3 = sc.nextInt();
		int temp = 0;

		while (num1 < num2 || num2 < num3) {
			if (num1 < num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
				System.out.println(num1 + " " +num2+ " "+num3);
			}
			if (num2 < num3) {
				temp = num2;
				num2 = num3;
				num3 = temp;
				System.out.println(num1+ " "+num2 + " " +num3);

			}

		}
		System.out.println("Max: "+num1+" Med: "+num2+" Min "+num3);

	}

}
