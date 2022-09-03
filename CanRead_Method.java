import java.io.*;
public class CanRead
{
	public static void main(String arg[])
	{
		File file=new File("File_Record.txt"); //this method tell that file is readable or not like windows file not readable return true or false
		if(file.canRead())
		{
			System.out.println("Can be Readable");
		}
		else
		{
			System.out.println("Can not be Readable")
		}
	}
}