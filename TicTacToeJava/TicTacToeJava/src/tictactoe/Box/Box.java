package tictactoe.Box;

class Box 
{

	private String name;
	
	public void box()
	{
		this.name = "-";
	}
	public void box(String name)
	{
		this.name = name;
	}

	public String GetName()
	{
		return this.name;
	}
	
}