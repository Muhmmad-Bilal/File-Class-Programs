import java.io.*;
public class CanWrite_Method
{
	public static void main(String arg[])
	{
		try
		{
			File file=new File("File_Record.txt");
			if(file.canWrite())
			{
				System.out.println("This File is Writeable:");
			}
			else 
			{
				System.out.println("This file is not WriteAble");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}