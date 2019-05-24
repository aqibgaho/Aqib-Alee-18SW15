

class Task4
{
	public static void main(String[] args)
	{
		Task4 overloading = new Task4();
		int length = 10;
		int breadth = 20;
		System.out.println("Area of Rectangle = "+overloading.area(length,breadth));
		System.out.println("Area of Square = "+overloading.area(length));
	}
	public int area(int l,int b)
	{
		return l*b;
	}
	public int area(int l)
	{
		return l*l;
	}
}