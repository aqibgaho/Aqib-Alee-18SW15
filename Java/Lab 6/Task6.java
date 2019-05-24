public class Task6
 {
	private String firstName;
	private String lastName;
	private static int count = 0;

	public Task6( String first, String last )
	{
		firstName = first;
		lastName = last;
		count++;
		System.out.println( "count when constructor is called = "+count);
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	} 
	public static int getCount()
	{
		return count;
	}
 }
 
 class MainClass
 {
	 public static void main(String [] args)
	 {
		System.out.println("Count initialy = "+Task6.getCount());
		Task6 employee1 = new Task6("Aqib","Ali");
		Task6 employee2 = new Task6("Muhammad","Asim"); 
		System.out.println("Count for employee1 : "+employee1.getFirstName()+" "+employee1.getLastName()+" = "+employee1.getCount());
		System.out.println("Count for employee2 : "+employee2.getFirstName()+" "+employee2.getLastName()+" = "+employee2.getCount());
		System.out.println("Count for class = "+Task6.getCount());
	 }
 }