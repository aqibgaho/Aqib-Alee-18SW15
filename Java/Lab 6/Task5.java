
class Task5
{
	public static void main(String[] args)
	{
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		Student student7 = new Student();
		Student student8 = new Student();
		Student student9 = new Student();
		Student student10 = new Student();
		student1.setInfo("Aqib",18,"Tando M Khan");
		student2.setInfo("Asim",18,"Tando Adam");
		student3.setInfo("Fayaz",20,"Thatta");
		student4.setInfo("Akhtar",19,"Matyari");
		student5.setInfo("Sheeraz",18,"Sukkur");
		student6.setInfo("Sameer",18,"Larkana");
		student7.setInfo("Hasnain",18,"Karachi");
		student8.setInfo("Ahmed",22,"Dadu");
		student9.setInfo("Rahman",18,"Larkana");
		student10.setInfo("Zubair",20,"Khairpur");
		Student[] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
			for(int i=0;i<students.length;i++)
			{
				System.out.println(students[i].toString());
			}
	}
}
class Student{
	private String name;
	private int age;
	private String address;
	public Student()
	{
		this.name="Unknown";
		this.age=0;
		this.address="Not available";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String toString()
	{
		return ("Name = "+name+", Age = "+age+", Adress = "+address);
	}
}
	