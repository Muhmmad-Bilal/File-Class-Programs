import java.io.*;
public class IsDirectory_Method
{
    public static void main(String arg[])
	{
		try
		{
		File file=new File("C:\\File_Record.txt");
		if(file.isDirectory())
		{
			System.out.println("Directory");
		}
		else
		{
			System.out.println("Not Directory");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}