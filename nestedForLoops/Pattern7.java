package nestedForLoops;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no. of rows: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1 ; i<= n ; i++) {
			for(int j=1 ; j<=i ; j++) {
				if (i==j) {
					System.out.print("*");
				}
				else if(i==n || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
