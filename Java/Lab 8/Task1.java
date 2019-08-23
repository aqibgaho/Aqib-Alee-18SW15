/*Task 1: Create an interface AdvancedArithmetic which contains a
method signature int sumOfFactors(int n). You need to write a class
called MyCalculator which implements the interface.
sumOfFactors function just takes an integer as input and return the
sum of all its factors. For example factors of 6 are 1, 2, 3 and 6, so
sumOfFactors should return 12. The value of n will be at most
1000.*/

import java.util.*;
interface AdvancedArithmetic
{
	public int sumOfFactors(int num);
}
class Task1 implements AdvancedArithmetic
{
	public int sumOfFactors(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
		
	public static void main(String[] args)
	{
		Task1 obj = new Task1();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		int result = obj.sumOfFactors(num);
		System.out.println(result);
	}
}
	