import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter your operator: ");
		char operator = sc.next().charAt(0);
		System.out.println("Enter your second number: ");
		double num2 = sc.nextDouble();
		double result = 0.0;
		switch(operator) {
		case'+':
			result = num1+num2;
			System.out.println(result);
			break;
		case'-':
			result = num1-num2;
			System.out.println(result);
			break;
		case'*':
			result = num1*num2;
			System.out.println(result);
			break;
		case'/':
			result = num1/num2;
			System.out.println(result);
			break;	
	    default :
	    	System.out.println("Invalid operator");
	    	break;	   
		}
	}
}

