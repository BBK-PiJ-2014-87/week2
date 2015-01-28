import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Pleaseenter second number:");
		int num2 = sc.nextInt();
		int mult = num2;
		int sum = 0;
				
		
		while (num2>0){
			sum = sum + num1;
			num2--;
		}
		System.out.println(num1+" x "+mult+ " = "+sum);
		
	}

}
