import java.io.*;
public class GetParentFile_Method
{
	public static void main(String arg[])
	{
		File file=new File("File_Class\\File_Record.txt");
		
		File parentfile=file.getParentFile();
		System.out.println("ParentFile Name:"+parentfile);
	}
}