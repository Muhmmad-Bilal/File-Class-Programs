import java.io.*;
public class List_Method
{
	public static void main(String arg[])
	{
		try
		{
		File file=new File("C:\\Users\\Muhammad bilal\\Desktop\\java_prog\\Input_Out\\File_Class");
		String l[]=file.list();
		System.out.println("files are: ");
		for(int i=0;i<=l.length;i++)
		{
			System.out.println(l[i]);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}