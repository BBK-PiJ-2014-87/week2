import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int num;
		int denom;
		int quo = 0;
		int rem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numerator:");
		num = sc.nextInt();
		System.out.println("Please enter denomenator:");
		denom = sc.nextInt();
		//rem = (num>denom)? num: denom;
		rem=num;
		if (num>=denom){
			while (rem >=denom) {
			rem = rem - denom;
			quo++;
			}
		}else{
			rem=denom;
		}
		
		System.out.println(num + " / " + denom + " = " + quo + " + remainder "
				+ rem);

	}

}
