package tictactoe.Box;

class Cross extends Box
{	
	public char Draw()
	{
		return 'X';
	}
	
	public String GetName()
	{
		Box box = new Box();
		return box.GetName() + "!";
	}
	
}
