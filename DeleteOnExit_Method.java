import java.io.*;
public class DeleteOnExit_Method
{
	public static void main(String arg[])
	{
		File file=new File("File.txt");
		
		file.deleteOnExit();
	for(int i=1;i<=100;i++)
	{
			System.out.println("Hello");
		if(i==50)
		{
			return;
		}
	}
	}
}