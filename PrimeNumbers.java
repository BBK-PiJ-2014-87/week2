import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num;
		int denom= 1;
		int dev_count = 0;
		String answer;
		String neg = "No! This is not a prime number";
		String pos = "Yes!This is a prime number";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to check:");
		num = scan.nextInt();
		
		if (num > 1){
			while(denom<=num){
				if (num%denom==0){
					System.out.println("Number: " +num+ " can be devided by: "+denom );
					dev_count++;
				}
				denom++;			
			}
		}else{
			System.out.println(neg);
		}
		
		answer = (dev_count<3)? pos : neg;
		System.out.println(answer);
		
	}

}
