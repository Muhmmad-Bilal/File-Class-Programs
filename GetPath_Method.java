import java.io.*;
public class GetPath_Method
{
	public static void main(String arg[])
	{
		File file=new File("File_Record.txt");
		String path=file.getPath();
		System.out.println("File path is:"+path);
	}
}