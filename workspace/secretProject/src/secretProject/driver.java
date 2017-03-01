package secretProject;

public class driver 
{
	public static void main(String [] args)
	{
		graphics testCase = new graphics();
		(new Thread(testCase)).start();
	
	}
}