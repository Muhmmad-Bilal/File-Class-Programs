import java.io.*;
public class IsFile_Method
{
	public static void main(String arg[])
	{
		File file=new File("File_Record.txt");
		if(file.isFile())
		{
			System.out.println("File");
		}
		else
		{
			System.out.println("Not file");
		}
	}
}