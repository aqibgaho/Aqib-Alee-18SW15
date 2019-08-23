class Task2
{
	String[] names;
	int[] votes;
	public void addCandidate(String[] names)
	{
		this.names=names;
		votes = new int[names.length];
	}
	public void castVote(int age, String voteTo)
	{
		if(age<18)
		{
			throw new ArithmeticException("invalid");
		}
		else {
			for(int i=0;i<names.length;i++)
			{
				if(names[i]==voteTo)
				{
					votes[i]++;
				}
			}
		}
	}
	public void print()
	{
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]+"\t"+votes[i]);
		}
	}
	public static void main(String[] args)
	{
		Task2 obj = new Task2();
		String[] array = {"PTI", "PPP", "PMLN"};
		obj.addCandidate(array);
		try{
			obj.castVote(19,"PTI");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		obj.print();
	}
}