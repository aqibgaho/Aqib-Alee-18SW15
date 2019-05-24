class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
		public String getEmail()
	{
		return email;
	}
		public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return "Author[ Name = "+name+", Email = "+email+", Gender = "+gender+" ]";
	}

}
public class AuthorTest
{
	public static void main(String[] args)
	{
		Author author1 = new Author("Deitel","Deitell123@gmail.com",'M');
		System.out.println(author1.toString());
	}
}