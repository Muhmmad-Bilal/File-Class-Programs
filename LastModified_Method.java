import java.io.*;
public class LastModified_Method
{
	public static void main(String arg[])
	{
		File file=new File("File_Record.txt");
		System.out.println("Last time to modified is: "+file.lastModified());
	}
}