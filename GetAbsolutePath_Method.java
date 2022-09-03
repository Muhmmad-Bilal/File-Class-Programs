import java.io.*;
public class GetAbsolutePath_Method
{
	public static void main(String arg[])
	{
		File file=new File("File_Record.txt");
		String path=file.getAbsolutePath();
		System.out.println("Path"+path);
	}
}