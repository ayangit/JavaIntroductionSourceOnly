package whileLoops;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n, sum=0;
		while(temp!=0) {
			sum+=temp%10;
			temp/=10;
		}
		System.out.println(sum);
		
		
	}

}
