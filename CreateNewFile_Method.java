import java.io.*;
public class CreateNewFile_Method
{
	public static void main(String arg[])
	{
		try
		{
		File file=new File("File.txt");
		if(file.createNewFile())
		{
			System.out.println("File is Created");
		}
		else 
		{
			System.out.println("File is already exists");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}