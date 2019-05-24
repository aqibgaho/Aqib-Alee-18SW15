

class Task3
{
	public static void main(String[] args)
	{
		Task3 overloading = new Task3(); 
		overloading.intchar(5,'a');
		overloading.intchar('a',5);
	}
	public void intchar(int i, char c)
	{
		int number = i;
		char character = c;
		System.out.println("---------First integer then char----------------- ");
		System.out.println("number ="+number);
		System.out.println("Character ="+character);
	}
	public void intchar(char c,int i)
	{
		System.out.println("------------First char then integer---------------");
		int number = i;
		char character = c;
		System.out.println("number ="+number);
		System.out.println("Character ="+character);
	}
}