class Book
{
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	public Book(String name , Author[] authors, double price)
	{
		this.name=name;
		this.price=price;
		this.authors=authors;
		qty=0;

	}
	public Book(String name , Author[] authors, double price,int qty)
	{
		this.name=name;
		this.price=price;
		this.authors=authors;
		this.qty=qty;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQty()
	{
		return qty;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public Author[] author()
	{
		return authors;
	}
	public void setAuthors(Author[] authors){
		this.authors=authors;
	}
	public String toString()
	{
		String authorlist="";
		for(int i=0;i<authors.length;i++)
		{
			if(i==authors.length-1)
			{			
				authorlist+=authors[i].toString();
			}
			else
				authorlist+=authors[i].toString()+",";
		}

		return "Book[Name = "+name+", authors="+authorlist+", Price = "+price+", Quantity = "+qty+" ]";
	}
}
class BookTest
{
	public static void main(String[] args)
	{
		Author author1 = new Author("Dietel","Dietel123@gmail.com",'M');
		Author author2 = new Author("Lafore","robert321@gmail.com",'M');
		Author[] authors={author1,author2};
		Book b=new Book("C++",authors,200,3);
		System.out.println(b.toString());
	}
}