package nestedForLoops;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no. of rows: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=2*n+1;
		for (int i=1 ; i<= row ; i++) {
			if (i<=n) {
				for (int j=1;j<=i ;j++) {
					System.out.print("* ");
				}
			}
			else {
				for (int j=1; j<=row-i+1;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
