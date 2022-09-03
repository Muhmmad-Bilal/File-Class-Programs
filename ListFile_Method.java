import java.io.*;
public class ListFile_Method
{
	public static void main(String arg[])
	{
		try
		{
		File f=new File("C:\\Users\\Muhammad bilal\\Desktop\\java_prog\\Input_Out\\File_Class");
		File[] file=f.listFiles();
		System.out.println("Files are");
		for(int i=0;i<=file.length;i++)
		{
			System.out.println(file[i]);
		}
		}catch(Exception e)
		{
			System.out.println("All Files are these");
		}
	}
}