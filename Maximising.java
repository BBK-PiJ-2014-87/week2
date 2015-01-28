import java.util.Scanner;

public class Maximising {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int max = -1;
		String sum ="";
		do{
			System.out.println("Please enter a number:");
			num = sc.nextInt();
			while(max<num){
				max=num;
			}
			sum = sum+Integer.toString(num)+",";
			System.out.println("sequnce "+ sum + " max " + max);
		}while(num!=-1);
		
		System.out.println("Maximum number is: "+max);

	}

}
