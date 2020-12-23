package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int principal;
		float rate;
		int time;
		System.out.println("Enter Principal Amount :");
		principal= sc.nextInt();
		System.out.println("Enter rate:");
		rate=sc.nextFloat();
		System.out.println("Enter time (month): ");
		time= sc.nextInt();
		float simpleInterest=principal*rate*time/100;
		System.out.println(simpleInterest);

	}

}
