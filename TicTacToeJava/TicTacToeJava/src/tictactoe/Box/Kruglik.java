package tictactoe.Box;

class Kruglik extends Box
{
	public char Draw()
	{
		return 'O';
	}
	
	public String GetName()
	{
		Box box = new Box();
		return box.GetName() + "!";
	}
}
