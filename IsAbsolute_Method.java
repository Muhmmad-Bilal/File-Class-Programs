import java.io.*;
public class IsAbsolute_Method
{
	public static void main(String arg[])
	{
		File file=new File("C:\\Users\\Muhammad bilal\\Desktop\\java_prog\\Input_Out\\File_Record.txt");
		//String path=file.isAbsolute();
		if(file.isAbsolute())
		{
			System.out.println("File isAbsolute():");
			}
		else
		{
			System.out.println("Not isAbsolute");
		}
	}
}