import java.util.*;
public class Calculator
{
	static double addition(double num1,double num2)
	{
		return num1+num2;
	}
	static double subtraction(double num1,double num2)
	{
		return num1-num2;
	}
	static double multiplication(double num1,double num2)
	{
		return num1*num2;
	}
	static double division(double num1,double num2)
	{
		return num1/num2;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double num1,num2,res=0;
		char op;
		System.out.println("Enter first number");
		num1 = sc.nextDouble();
		System.out.println("Enter second number");
		num2 = sc.nextDouble();
		System.out.println("\nselect operation \n + for Addition\n - for substraction\n* for multiplication\n/ for division");
		op=sc.next().charAt(0);
		switch(op)
		{
			case '+':
       				res=addition(num1,num2);
				System.out.println(res);
				break;
			case '-':
				res=subtraction(num1,num2);
				System.out.println(res);
				break;
			case '*':
				res=multiplication(num1,num2);
				System.out.println(res);
				break;
			case '/':
				if(num2 == 0)
					System.out.println("Division with Zero is not possible");
				else
				{
					res=division(num1,num2);
					System.out.println(res);
				}
		}
	}
}
	
	
	

