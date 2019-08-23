/*Task 3: You are required to compute the power of a number by
implementing a calculator. Create a class MyCalculator which consists of a
single method long power(int, int). This method takes two integers, n and p,
as parameters and finds np. If either n or p is negative, then the method must
throw an exception which says "n or p should not be negative". Also, if both
and are zero, then the method must throw an exception which says "n or p
should not be zero"
Note: Use for loop to calculate the power*/

class PowerException extends Exception
{
	PowerException(String s)
	{
		super(s);
	}
}

class Task3
{
	long power(int n,int p) throws PowerException
	{
		int m=n;
		if(n<0 || p<0)
		{
			throw new PowerException("n/p is negative");
		}
		else if(n==0 || p==0)
		{
			throw new PowerException("n/p is zero");
		}
		else 
		{
			for(int i=1;i<p;i++)
			{
				m*=n;
			}
			return m;
		}
	}
	public static void main(String[] args)
	{
		Task3 obj = new Task3();
		try{
		System.out.println(obj.power(2,5));
		}
		catch(PowerException p )
		{
			System.out.println(p);
		}
			System.out.println("Program executed successfully ");
	}
}