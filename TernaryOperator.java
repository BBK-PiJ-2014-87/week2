import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		int currentYear = 2012;
		Scanner in = new Scanner(System.in);
		System.out.println("When were you born?");
		String s = in.nextLine();
		int birthYear = Integer.parseInt(s);	
		int age = currentYear - birthYear;
		String result = (age>17) ? "" : "not";
		System.out.println("It seems you are " + result + " an adult");
	}

}
