package whileLoops;
import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n, sum=0;
		
		//to find the number of digits in n the formula is log(10)n +1
		
		int num= (int)Math.log10(n)+1;
		System.out.println(num);
	}

}
