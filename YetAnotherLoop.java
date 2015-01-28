import java.util.Scanner;

public class YetAnotherLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter i number:");
		int i = in.nextInt();
		while (i < 10){
			i++;
			System.out.println("please enter j number:");
			int j = in.nextInt();
			if (j == 0){
				break;
			}else if (j != 1){
				System.out.println("J is " + j);
				
			}
			System.out.println("Attempts left" + (10-i));
		}

	}

}
