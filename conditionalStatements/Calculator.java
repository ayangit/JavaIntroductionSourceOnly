package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a,b,result=0;
		char operator;
		System.out.println("Enter first number :");
		a=sc.nextInt();
		System.out.println("Enter second number :");
		b=sc.nextInt();
		System.out.println("Enter the operator :");
		sc.nextLine();
		operator= sc.nextLine().charAt(0);
		switch(operator) {
		
		case '+':
			result= a+b;
			break;
		case '-':
			result= a-b;
			break;
		case '/':
			result= a/b;
			break;
		case '*':
			result= a*b;
			break;
		default:
			System.out.println("Unknown operator!");
			
		}
		System.out.println("The required result is :"+result);
		
	}

}
